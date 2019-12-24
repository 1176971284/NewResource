package com.hjcrm.system.controller;

import com.hjcrm.publics.contstants.JumpViewConstants;
import com.hjcrm.publics.util.UserContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SystemMessageController {

    @RequestMapping("/system/systemMessage.do")
    public String messageManger(){
        if(UserContext.getLoginUser()!=null){
            return JumpViewConstants.SYSTEM_MESSAGE;
        }
        return JumpViewConstants.SYSTEM_LOGIN;
    }
}