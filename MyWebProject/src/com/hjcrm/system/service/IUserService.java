package com.hjcrm.system.service;

import com.hjcrm.publics.util.PageBean;
import com.hjcrm.system.entity.Menu;
import com.hjcrm.system.entity.User;

import java.util.List;

public interface IUserService {
    /**
     * 根据邮箱查询用户信息
     * @param email
     * @return
     */
    User queryUserInfoByEmail(String email);

    /**
     * 查询密码是否匹配
     * @param user
     * @return
     */
    User queryPasswordIsExis(User user);

    /**
     * 查询当前角色匹配的菜单列表
     * @param roleId
     * @return
     */
    List<Menu> queryMenuRoleId(String roleId);

    /**
     * 实现户信息的查询（分页）
     * @param pb
     * @return
     */
    public List<User> queryAllUserInfo(PageBean pb);

}
