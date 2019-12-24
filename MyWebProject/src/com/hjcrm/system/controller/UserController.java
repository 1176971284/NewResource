package com.hjcrm.system.controller;

import com.hjcrm.publics.contstants.JumpViewConstants;
import com.hjcrm.publics.contstants.ReturnConstants;
import com.hjcrm.publics.util.JsonUtil;
import com.hjcrm.publics.util.PageBean;
import com.hjcrm.publics.util.UserContext;
import com.hjcrm.system.entity.User;
import com.hjcrm.system.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    IUserService userService;

    @RequestMapping("/system/userMang.do")
    /**
     * 加载用户管理页面到主页面
     */
    public String userManger() {
        if (UserContext.getLoginUser() != null) {
            return JumpViewConstants.SYSTEM_USER_MANAGER;
        }
        return JumpViewConstants.SYSTEM_LOGIN;
    }

    @RequestMapping("/system/userlist.do")
    /**
     * 查询用户信息列表
     */
    public @ResponseBody String queryAllUserInfo(Integer pageSize, Integer currentPage) {
        if (UserContext.getLoginUser() != null) {
            //用户登陆状态
            //查询所有用户信息
            System.out.println("请求用户 信息：" + pageSize + "/" + currentPage);
            //封装分页实体对象
            PageBean pb = new PageBean();
            pb.setCurrentPage((currentPage-1)*pageSize); //limit 参数一，起始查询位置
            pb.setPageSize(pageSize); //limit 参数二，查询条数
            List<User> userList = userService.queryAllUserInfo(pb);
            for (User u: userList) {
                System.out.println("查询到的用户信息："+u);
            }
            //返回结果数据到ajax
            pb.setCurrentPage(currentPage);
            pb.setCountPage(pageSize);
            String userJsonResult =  JsonUtil.jsonToPage(userList,pb);
            System.out.println("userJsonResult："+userJsonResult);
            return userJsonResult;

        }
        return ReturnConstants.PAPAM_NULL;
    }

}


