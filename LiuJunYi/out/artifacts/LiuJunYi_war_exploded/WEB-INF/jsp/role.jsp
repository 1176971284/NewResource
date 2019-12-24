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
    <title>角色管理</title>
</head>
<body>
<h1>角色管理</h1>
<table border="1">
    <tr>
        <td colspan="6">
            <a href="insertRole.do">添加角色</a>
        </td>
    </tr>
    <tr>
        <td>序号</td>
        <td>角色名</td>
        <td>部门</td>
        <td>创建时间</td>
        <td colspan="2">操作</td>
    </tr>
    <c:forEach items="${role}" var="role">
        <tr>
            <td>${role.roleid}</td>
            <td>${role.rolename}</td>
            <td>${role.deptid}</td>
            <td>${role.create_time}</td>
            <td><a href="delRole.do?delId=${role.roleid}">删除</a>  <a href="roleedit.do?queryId=${role.roleid}">更新</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
