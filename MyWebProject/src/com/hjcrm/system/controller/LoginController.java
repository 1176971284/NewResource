package com.hjcrm.system.controller;

import com.hjcrm.publics.contstants.JumpViewConstants;
import com.hjcrm.publics.contstants.ReturnConstants;
import com.hjcrm.publics.util.MD5Utils;
import com.hjcrm.publics.util.UserContext;
import com.hjcrm.system.entity.Menu;
import com.hjcrm.system.entity.User;
import com.hjcrm.system.service.IUserService;
import org.apache.commons.fileupload.RequestContext;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class LoginController {

    @Autowired
    IUserService userService;


    @RequestMapping(value="/login.do",method=RequestMethod.GET)
    /**
     * 跳转登陆页面
     */
    public String loginView(Model model){
        return JumpViewConstants.SYSTEM_LOGIN;
    }

    @RequestMapping(value="/login.do",method = RequestMethod.POST)
    public String login(HttpServletRequest request,String email,String password,String sign
            ,Model model){
        System.out.println(email);
        System.out.println(password);
        System.out.println(sign);
        //1. 判断接受参数为null
        if(StringUtils.isNotBlank(email) &&StringUtils.isNotBlank(password)){
            //2. 判断邮箱是否存在
            User user = userService.queryUserInfoByEmail(email+sign);
            if(user==null){
                model.addAttribute("msg",ReturnConstants.USER_NOT_EXIST);
                return JumpViewConstants.SYSTEM_LOGIN; //底层：请求转发
            }
            //3. 判断密码是否匹配
            User passwordIsExis = userService.queryPasswordIsExis(new User(user.getUserid(),MD5Utils.MD5Encode(password,"utf-8")));
            if(passwordIsExis==null){
                model.addAttribute("msg",ReturnConstants.PASSWORD_ERROR);
                return JumpViewConstants.SYSTEM_LOGIN; //底层：请求转发
            }
            //4. 操作session /cookie
            UserContext.setLoginUser(user);
            //5. 返回主页面
            return "redirect:main.do";
        }
        return ReturnConstants.PAPAM_NULL;
    }

    @RequestMapping("/main.do")
    public String index(Model model){
        //LoginController
        //UserController
        //DeptControler
        //... ... ...


        if(UserContext.getLoginUser()!=null){
            //1. 根据当前用户角色信息，查询当前角色所分配的菜单列表

            List<Menu> menus = userService.queryMenuRoleId(UserContext.getLoginUser().getRoleid()+"");

            for (int i = 0; i < menus.size(); i++) {
                System.out.println("一级菜单："+menus.get(i));
            }
            model.addAttribute("menus",menus);
            //判断用户是否登陆成功
            //查询当前角色所分配的菜单列表
            model.addAttribute("","");
            return  JumpViewConstants.SYSTEM_INDEX;
        }
        return JumpViewConstants.SYSTEM_LOGIN;
    }


    @RequestMapping("/logout.do")
    public String logout(Model model){
        //1.清空session数据和cookie数据

        UserContext.clearLoginUser();
        //清空cookie中的数据

        //跳转登陆页面
        return JumpViewConstants.SYSTEM_LOGIN;
    }



}
