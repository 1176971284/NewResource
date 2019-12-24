<%--
  Created by IntelliJ IDEA.
  User: Sans
  Date: 2019/12/20
  Time: 16:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改用户</title>
</head>
<body>
    <form action="update.do" method="post">
        <input type="hidden" name="roleid" value="${old_role.roleid}" >
        角色名:<input type="text" name="rolename" value="${old_role.rolename}" /><br/>
        部门编号:<input type="text" name="deptid" value="${old_role.deptid}" /><br/>
        创建时间:<input type="text" name="create_time" value="${old_role.create_time}" /><br/>
        <input type="submit" value="修改" />
    </form>
</body>
</html>
