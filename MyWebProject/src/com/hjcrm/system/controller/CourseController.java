package com.hjcrm.system.controller;

import com.hjcrm.publics.contstants.JumpViewConstants;
import com.hjcrm.publics.util.UserContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CourseController {

    @RequestMapping("/system/courseMang.do")
    public String courseManger(){
        if(UserContext.getLoginUser()!=null){
            //用户登陆状态
            return JumpViewConstants.SYSTEM_COURSE; //handlermapping ---> /web-inf/jsp/system/courseMang.jsp
        }
        //跳回登陆页面
        return JumpViewConstants.SYSTEM_LOGIN;
    }
}


