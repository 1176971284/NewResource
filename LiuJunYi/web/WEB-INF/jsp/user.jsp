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
    <title>用户管理</title>
</head>
<body>
<h1>用户管理</h1>
<table border="1">
    <tr>
        <td colspan="6">
            <a href="insertUser.do">添加用户</a>
        </td>
    </tr>
    <tr>
        <td>序号</td>
        <td>用户名</td>
        <td>手机</td>
        <td>邮箱</td>
        <td colspan="2">操作</td>
    </tr>
    <c:forEach items="${user}" var="user">
        <tr>
            <td>${user.userid}</td>
            <td>${user.username}</td>
            <td>${user.phone}</td>
            <td>${user.email}</td>
            <td><a href="delUser.do?delId=${user.userid}">删除</a>  <a href="edit.do?queryId=${user.userid}">更新</a></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
