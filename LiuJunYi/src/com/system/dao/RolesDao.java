package com.system.dao;

import com.system.bean.Role;

import java.util.List;

public interface RolesDao {

    List<Role> queryRoleList();

    int insertRole(Role new_role);

    Role getOne(int queryId);

    int update(Role edit_role);

    int delete(int delId);

}
