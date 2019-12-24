package com.system.service.impl;

import com.system.bean.User;
import com.system.dao.UserDao;
import com.system.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("loginService")
public class UserServiceImpl implements IUserService {
    @Autowired
    UserDao userDao;

    @Override
    public User login(User user) {
        return userDao.login(user);
    }

    @Override
    public int reg(User user) {
        if(user!=null){
                return userDao.reg(user);
        }
        return -1;
    }

    @Override
    public List<User> queryUserList() {
        return userDao.queryUserList();
    }

    @Override
    public int insertUser(User new_user) {
        return userDao.addUser(new_user);
    }

    @Override
    public User edit(int userid) {
        return userDao.edituser(userid);
    }

    @Override
    public int update(User edit_user) {
        return userDao.updateuser(edit_user);
    }

    @Override
    public int delUser(int delId) {
        return userDao.deleteuser(delId);
    }
}
