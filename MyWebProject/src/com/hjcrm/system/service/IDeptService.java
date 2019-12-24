package com.hjcrm.system.service;


import com.hjcrm.system.entity.Dept;
import com.hjcrm.system.entity.Role;

import java.util.List;

public interface IDeptService {

    /**
     * 查询所有部门信息
     *
     * @return
     */
    public List<Dept> queryAllDept();


    /**
     * 查询某一部门下所有的角色
     *
     * @param deptId
     * @return
     */
    List<Role> queryRoleByDeptId(String deptId);
}
