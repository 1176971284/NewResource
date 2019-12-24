package com.system.service;

import com.system.bean.User;

import java.util.List;

public interface IUserService {
    User login(User user);

    int reg(User user);

    List<User> queryUserList();

    int insertUser(User new_user);

    User edit(int userid);

    int update(User edit_user);

    int delUser(int delId);
}
