package com.hjcrm.system.mapper;

import com.hjcrm.system.entity.Role;

import java.util.List;

public interface RoleDao {
    /**
     * 查询某一个部门下的所有角色
     * @param deptId
     * @return
     */
    public List<Role> queryRoleByDeptId(String deptId);
}
