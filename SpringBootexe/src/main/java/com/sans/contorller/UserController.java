package com.sans.contorller;

import com.sans.pojo.User;
import com.sans.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("world")
    @ResponseBody
    public String sayHello(){
        System.out.println("Welcome to this page!");
        return "success";
    }


    //@RequestMapping(value = "user/{id}",method = RequestMethod.GET)
    @GetMapping("/select/{id}")
    @ResponseBody
    public User queryUserById(@PathVariable("id") Long i){
        User user=userService.queryUserById(i);
        return user;
    }

    @GetMapping("/del/{ids}")
    @ResponseBody
    public String deleteUserById(@PathVariable("ids") Long ids){
        userService.deleteUserById(ids);
        return "success delete";
    }

    @GetMapping("list")
    public String queryAllUser(Model model){
        List<User> userlist=userService.queryAllUser();
        model.addAttribute("users",userlist);
        return "item";
    }

}
