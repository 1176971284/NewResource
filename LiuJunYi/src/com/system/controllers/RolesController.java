package com.system.controllers;

import com.system.bean.Role;
import com.system.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.util.List;

@Controller
public class RolesController {

    @Autowired
    IRoleService roleService;

    @RequestMapping("/role.do")
    public String role(HttpServletRequest request){
        List<Role> role= roleService.queryRoleList();
        request.setAttribute("role", role);
        return "role";
    }

    @RequestMapping("/insertRole.do")
    public String insertRole(){
        return "role_insert";
    }

    @RequestMapping("/insertNewRole.do")
    public String insertNewRole(HttpServletRequest request, String rolename, int deptid, String create_time){
        Role new_role=new Role(rolename,deptid,create_time);
        int addrolesult=roleService.insertRole(new_role);
        if (addrolesult>0){
            List<Role> role = roleService.queryRoleList();
            request.setAttribute("role", role);
            return "role";
        }else {
            return "role_insert";
        }
    }

    @RequestMapping("/roleedit.do")
    public String edit(int queryId,HttpServletRequest request){
        System.out.println("queryId:"+queryId+">>>>>>>>>>>>>>>>");
        Role old_role=roleService.edit(queryId);
        request.setAttribute("old_role",old_role);
        return "role_edit";
    }

    @RequestMapping("/roleupdate.do")
    public String updateAnimal(HttpServletRequest request) throws UnsupportedEncodingException {
        request.setCharacterEncoding("utf-8");
        Role edit_role = new Role(
                request.getParameter("rolename"),
                Integer.parseInt(request.getParameter("deptid")),
                request.getParameter("create_time"),
                Integer.parseInt(request.getParameter("roleid"))
        );

        System.out.println(edit_role+">>>>>>>>>>>>");
        int updateResult = roleService.update(edit_role);
        System.out.println(updateResult+">>>>>>>>>>>>>>>>>>>>>>>");
        return "redirect:role.do";
    }

    @RequestMapping("/delRole.do")
    public String delUser(int delId) {
        int delResult = roleService.delRole(delId);
        System.out.println(delResult+">>>>>>>>>>>>>>>>>>>>>>>");
        return "redirect:role.do";
    }


}
