package com.system.service.impl;

import com.system.bean.Dept;
import com.system.dao.DeptDao;
import com.system.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("deptService")
public class DeptServiceImpl implements IDeptService {

    @Autowired
    DeptDao deptDao;

    @Override
    public int insertDept(Dept new_dept) {
        return deptDao.insertDept(new_dept);
    }

    @Override
    public List<Dept> queryDeptList() {
        return deptDao.queryDeptList();
    }

    @Override
    public Dept edit(int queryId) {
        return deptDao.edit(queryId);
    }

    @Override
    public int update(Dept edit_dept) {
        return deptDao.update(edit_dept);
    }

    @Override
    public int delDept(int delId) {
        return deptDao.delDept(delId);
    }
}
