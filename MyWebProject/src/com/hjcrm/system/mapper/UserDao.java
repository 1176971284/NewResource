package com.hjcrm.system.mapper;

import com.hjcrm.publics.util.PageBean;
import com.hjcrm.system.entity.User;

import java.util.List;

public interface UserDao {
    /**
     * 用户邮箱账号是否存在
     * @param email
     * @return
     */
    public User queryUserInfoByEmail(String email);

    /**
     * 查询用户密码是否匹配
     * @param user
     * @return
     */
    public User queryPasswordIsExis(User user);

    /**
     * 查询用户信息列表
     * @param pb
     * @return
     */
    public List<User> queryAllUserInfo(PageBean pb);
}
