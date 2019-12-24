package com.system.controllers;

import com.system.bean.User;
import com.system.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class LoginandRegController {

    @RequestMapping("/login.do")
    public String login(){
        return "login";
    }

    @Autowired
    IUserService userService;

    @RequestMapping("/loginsystem.do")
    public String loginsystem(String username,String password){
        User user=new User(username,password);
        User login=userService.login(user);

        if(login!=null){
            return "main";
        }else{
            return "login_error";
        }
    }


    @RequestMapping("/reg.do")
    public String reg(){
        return "reg";
    }

    @RequestMapping("/addUser.do")
    public String addUser(String username,String password){
        User user=new User(username,password);
        int reg=userService.reg(user);
        if (reg>0){
            return "login";
        }else {
            return "reg";
        }
    }



}
