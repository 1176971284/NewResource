package com.hjcrm.system.mapper;

import com.hjcrm.system.entity.Dept;

import java.util.List;

public interface DeptDao {
    /**
     * 查询所有部门信息列表
     * @return
     */
    public List<Dept> queryAllDept();
}
