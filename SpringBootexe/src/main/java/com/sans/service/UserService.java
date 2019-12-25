package com.sans.service;

import com.sans.mapper.UserMapper;
import com.sans.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User queryUserById(Long i) {
        return userMapper.selectByPrimaryKey(i);
    }
    @Transactional
    public void deleteUserById(Long ids) {
        userMapper.deleteByPrimaryKey(ids);
    }

    public List<User> queryAllUser() {
        return userMapper.selectAll();
    }
}
