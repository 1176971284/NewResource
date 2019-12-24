package com.hjcrm.system.controller;

import com.hjcrm.publics.contstants.JumpViewConstants;
import com.hjcrm.publics.contstants.ReturnConstants;
import com.hjcrm.publics.util.PageBean;
import com.hjcrm.publics.util.UserContext;
import com.hjcrm.system.entity.Dept;
import com.hjcrm.system.entity.Role;
import com.hjcrm.system.service.IDeptService;
import net.sf.json.util.JSONUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class DeptController {

    /**
     * 请求部门页面
     * @return
     */
    @RequestMapping("/system/deptMang.do")
    public String deptManger(){
        if(UserContext.getLoginUser()!=null){
            return JumpViewConstants.SYSTEM_DEPT_MANAGER;// //handlermapping ---> /web-inf/jsp/system/deptMang.jsp
        }
        return JumpViewConstants.SYSTEM_LOGIN;
    }

    @Autowired
    IDeptService deptService;

    /**
     * 查询所部门列表
     * @return
     */
    @RequestMapping("/dept/queryDept.do")
    public  @ResponseBody  String queryAllDept(){
        //1. 使用DetpService 实现部门查询业务操作
        List<Dept> depts = deptService.queryAllDept();
        //2. 将查询到的数据封装成json数据返回
        String jsonResult = PageBean.jsonToPage(depts,null);
        System.out.println("查询所有部门信息：json:"+jsonResult);
        return jsonResult;
    }

    /**
     * 查询某一部门下的所有角色
     * @param deptid
     * @return
     */
    @RequestMapping("/role/queryRoleByDeptid.do")
    public @ResponseBody String queryRoleByDeptId(String deptid){
        if(StringUtils.isNotBlank(deptid)){
            //查询属于当前部门下的所有角色
            List<Role> roles = deptService.queryRoleByDeptId(deptid);
            for (Role r: roles
            ) {
                System.out.println("查询具体角色："+r);
            }
            //请求RoleService
            String roleResult = PageBean.jsonToPage(roles,null);
            System.out.println("查询具体角色JSON："+roleResult);
            return  roleResult;
        }
        return ReturnConstants.PAPAM_NULL;
    }
}


