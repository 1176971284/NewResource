package com.hjcrm.publics.util;

import com.hjcrm.system.entity.User;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * 用户登录状态封装
 */
public class UserContext {
    public static final String LOGIN_USER="login_user";
    public static final String LOGIN_NAME="loginName";
    /**
     * 获取请求对象
     * @return
     */
    public static HttpServletRequest getRequest(){
        //RequestContextHolder ,spring提供，可以获取HttpSevletRequest的工具类
        return ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
    }
    public static User getLoginUser(){
        return (User)getRequest().getSession().getAttribute(UserContext.LOGIN_USER);
    }
    public static void setLoginUser(User user){
        getRequest().getSession().setAttribute(UserContext.LOGIN_USER,user);
        getRequest().getSession().setAttribute(UserContext.LOGIN_NAME,user.getUsername());
    }
    public static void clearLoginUser(){
        getRequest().getSession().removeAttribute(UserContext.LOGIN_USER);
    }
}
