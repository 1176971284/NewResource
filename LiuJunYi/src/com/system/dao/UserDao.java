package com.system.dao;

import com.system.bean.User;

import java.util.List;

public interface UserDao {
    User login(User user);
    int reg(User user);
    List<User> queryUserList();
    int addUser(User user);

    User edituser(int userid);

    int updateuser(User edit_user);

    int deleteuser(int delId);
}
