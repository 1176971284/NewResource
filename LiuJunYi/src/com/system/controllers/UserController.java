package com.system.controllers;

import com.system.bean.User;
import com.system.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    IUserService userService;

    @RequestMapping("/user.do")
    public String user(HttpServletRequest request){
        List<User> user= userService.queryUserList();
        request.setAttribute("user", user);
        return "user";
    }

    @RequestMapping("/insertUser.do")
    public String insertUser(){
        return "user_insert";
    }

    @RequestMapping("/insertNewUser.do")
    public String insertNewUser(HttpServletRequest request,String username,String password,String phone,String email){
        User new_user=new User(username,password,phone,email);
        int addusersult=userService.insertUser(new_user);
        if (addusersult>0){
            List<User> user = userService.queryUserList();
            request.setAttribute("user", user);
            return "user";
        }else {
            return "user_insert";
        }
    }

    @RequestMapping("/edit.do")
    public String edit(int queryId,HttpServletRequest request){
        System.out.println("queryId:"+queryId+">>>>>>>>>>>>>>>>");
        User old_user=userService.edit(queryId);
        request.setAttribute("old_user",old_user);
        return "user_edit";
    }

    @RequestMapping("/update.do")
    public String updateAnimal(HttpServletRequest request) throws UnsupportedEncodingException {
        request.setCharacterEncoding("utf-8");
        User edit_user = new User(
                request.getParameter("username"),
                request.getParameter("password"),
                request.getParameter("phone"),
                request.getParameter("email"),
                Integer.parseInt(request.getParameter("userid"))
        );

        System.out.println(edit_user+">>>>>>>>>>>>");
        int updateResult = userService.update(edit_user);
        System.out.println(updateResult+">>>>>>>>>>>>>>>>>>>>>>>");
        return "redirect:user.do";
    }

    @RequestMapping("/delUser.do")
    public String delUser(int delId) {
        int delResult = userService.delUser(delId);
        System.out.println(delResult+">>>>>>>>>>>>>>>>>>>>>>>");
        return "redirect:user.do";
    }

}
