package com.system.service;

import com.system.bean.Role;
import com.system.bean.User;

import java.util.List;

public interface IRoleService {
    List<Role> queryRoleList();

    int insertRole(Role new_role);

    Role edit(int queryId);

    int update(Role edit_role);

    int delRole(int delId);
}
