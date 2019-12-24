package com.system.service.impl;

import com.system.bean.Role;
import com.system.bean.User;
import com.system.dao.RolesDao;
import com.system.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("roleService")
public class RoleServiceImpl implements IRoleService {
    @Autowired
    RolesDao rolesDao;

    @Override
    public List<Role> queryRoleList() {
        return rolesDao.queryRoleList();
    }

    @Override
    public int insertRole(Role new_role) {
        return rolesDao.insertRole(new_role);
    }

    @Override
    public Role edit(int queryId) {
        return rolesDao.getOne(queryId);
    }

    @Override
    public int update(Role edit_role) {
        return rolesDao.update(edit_role);
    }

    @Override
    public int delRole(int delId) {
        return rolesDao.delete(delId);
    }
}
