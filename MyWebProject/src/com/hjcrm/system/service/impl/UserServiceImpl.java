package com.hjcrm.system.service.impl;

import com.hjcrm.publics.util.PageBean;
import com.hjcrm.system.entity.Menu;
import com.hjcrm.system.entity.User;
import com.hjcrm.system.mapper.MenuDao;
import com.hjcrm.system.mapper.UserDao;
import com.hjcrm.system.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
@Service("userService")
public class UserServiceImpl implements IUserService {


    @Autowired
    UserDao userDao;

    @Autowired
    MenuDao menuDao;

    @Override
    public User queryUserInfoByEmail(String email) {
        try {
            User user =  userDao.queryUserInfoByEmail(email);
            return user;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public User queryPasswordIsExis(User user) {
        try {
            User user2 = userDao.queryPasswordIsExis(user);
            return user2;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Menu> queryMenuRoleId(String roleId) {
        //1.查询当前用户的角色所具有的所有一级菜单
        HashMap<String,String> hashMap = new HashMap<String,String>();
        hashMap.put("roleid",roleId);
        hashMap.put("menuparaid","-1");
        List<Menu> menus = menuDao.queryMenuByRoleId(hashMap);
        //2.查询当前一级菜单的二级菜单
        for (Menu  m: menus) {
            System.out.println("一级菜单："+m);
            HashMap<String,String> hashMap2 = new HashMap<String,String>();
            hashMap2.put("roleid",roleId);
            hashMap2.put("menuparaid",m.getMenuid()+"");

            List<Menu> menusSecondary = menuDao.queryMenuByRoleId(hashMap2);

            System.out.println("二级菜单："+menusSecondary.size());

            m.setChildren(menusSecondary);  // 将查询到的二级菜单添加到一级菜单上
        }
        return menus;
    }


    //ajax
    @Override
    public List<User> queryAllUserInfo(PageBean pb) {

        return userDao.queryAllUserInfo(pb);
    }
}
