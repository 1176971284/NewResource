package com.hjcrm.system.test;

import com.hjcrm.publics.util.MD5Utils;
import com.hjcrm.system.entity.Dept;
import com.hjcrm.system.entity.Menu;
import com.hjcrm.system.entity.User;
import com.hjcrm.system.service.IDeptService;
import com.hjcrm.system.service.IUserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class ServiceTest {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("application-*.xml");
        IUserService userService =  app.getBean("userService",IUserService.class);
        User user = userService.queryUserInfoByEmail("123@qq.com");
        if(user==null){
            System.out.println("账号不存在");
            return;
        }

        if(userService.queryPasswordIsExis(new User(user.getUserid(), MD5Utils.MD5Encode("123123","utf-8")))==null){
            System.out.println("密码不正确");
            return;
        }
        /*
        if(userService.queryPasswordIsExis(new User(user.getUserid(),"123123"))==null){
            System.out.println("密码不正确");
            return;
        }
        */
        System.out.println("user:"+"登陆成功");

        //测试菜单
     /*   IUserService userService = app.getBean("userService", IUserService.class);
        List<Menu> menuList = userService.queryMenuRoleId("35");
        for (Menu m : menuList ) {
            System.out.println(m);
        }*/

//        System.out.println(MD5Utils.MD5Encode("123123","utf-8"));
/*
        IDeptService deptService =  app.getBean("deptService",IDeptService.class);
        List<Dept>detps= deptService.queryAllDept();
        for ( Dept d: detps) {
            System.out.println(d);
        }

 */
    }
}
