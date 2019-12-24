package com.hjcrm.system.controller;

import com.hjcrm.publics.contstants.JumpViewConstants;
import com.hjcrm.publics.contstants.ReturnConstants;
import com.hjcrm.publics.util.UserContext;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RoleController {


    /**
     * 获取角色管理页面
     * @return
     */
    @RequestMapping("/system/roleMang.do")
    public String roleManger(){
        if(UserContext.getLoginUser()!=null){
            return JumpViewConstants.SYSTEM_ROLE_MANAGER;
        }
        return JumpViewConstants.SYSTEM_LOGIN;
    }




}


