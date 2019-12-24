package com.hjcrm.system.controller;

import com.hjcrm.publics.contstants.JumpViewConstants;
import com.hjcrm.publics.util.UserContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SubjectController {
    //system/subjectMang.do
    @RequestMapping("/system/subjectMang.do")
    public String subjectManger(){
        if(UserContext.getLoginUser()!=null){
            return JumpViewConstants.SYSTEM_SUBJECT;
        }
        return JumpViewConstants.SYSTEM_LOGIN;
    }
}


