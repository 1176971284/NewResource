package com.system.dao;

import com.system.bean.Dept;

import java.util.List;

public interface DeptDao {
   int insertDept(Dept new_dept);
   List<Dept> queryDeptList() ;
   Dept edit(int queryId);
   int update(Dept edit_dept) ;
   int delDept(int delId) ;
}
