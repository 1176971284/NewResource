<%--
  Created by IntelliJ IDEA.
  User: Sans
  Date: 2019/12/20
  Time: 14:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>部门管理</title>
</head>
<body>
<h1>部门管理</h1>
<table border="1">
    <tr>
        <td colspan="6">
            <a href="insertDept.do">添加部门</a>
        </td>
    </tr>
    <tr>
        <td>序号</td>
        <td>部门名称</td>
        <td>部门编码</td>
        <td>创建时间</td>
        <td colspan="2">操作</td>
    </tr>
    <c:forEach items="${dept}" var="dept">
        <tr>
            <td>${dept.deptid}</td>
            <td>${dept.deptname}</td>
            <td>${dept.deptcode}</td>
            <td>${dept.create_time}</td>
            <td><a href="delDept.do?delId=${dept.deptid}">删除</a>  <a href="editdept.do?queryId=${dept.deptid}">更新</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
