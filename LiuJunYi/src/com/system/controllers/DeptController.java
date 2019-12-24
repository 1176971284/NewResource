package com.system.controllers;

import com.system.bean.Dept;
import com.system.bean.Role;
import com.system.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.util.List;


@Controller
public class DeptController {

    @Autowired
    IDeptService deptService;

    @RequestMapping("/dept.do")
    public String dept(HttpServletRequest request){
        List<Dept> dept= deptService.queryDeptList();
        request.setAttribute("dept", dept);
        return "dept";
    }

    @RequestMapping("/insertDept.do")
    public String insertDept(){
        return "dept_insert";
    }

    @RequestMapping("/insertNewDept.do")
    public String insertNewDept(HttpServletRequest request, String deptname, String deptcode, String create_time){
        Dept new_dept=new Dept(deptname,deptcode,create_time);
        int addrdeptsult=deptService.insertDept(new_dept);
        if (addrdeptsult>0){
            List<Dept> dept = deptService.queryDeptList();
            request.setAttribute("dept", dept);
            return "dept";
        }else {
            return "dept_insert";
        }
    }

    @RequestMapping("/editdept.do")
    public String edit(int queryId,HttpServletRequest request){
        System.out.println("queryId:"+queryId+">>>>>>>>>>>>>>>>");
        Dept old_dept=deptService.edit(queryId);
        request.setAttribute("old_dept",old_dept);
        return "dept_edit";
    }

    @RequestMapping("/deptupdate.do")
    public String deptupdate(HttpServletRequest request) throws UnsupportedEncodingException {
        request.setCharacterEncoding("utf-8");
        Dept edit_dept = new Dept(
                request.getParameter("deptname"),
                request.getParameter("deptcode"),
                request.getParameter("create_time"),
                Integer.parseInt(request.getParameter("deptid"))
        );

        System.out.println(edit_dept+">>>>>>>>>>>>");
        int updateResult = deptService.update(edit_dept);
        System.out.println(updateResult+">>>>>>>>>>>>>>>>>>>>>>>");
        return "redirect:dept.do";
    }

    @RequestMapping("/delDept.do")
    public String delUser(int delId) {
        int delResult = deptService.delDept(delId);
        System.out.println(delResult+">>>>>>>>>>>>>>>>>>>>>>>");
        return "redirect:role.do";
    }

}
