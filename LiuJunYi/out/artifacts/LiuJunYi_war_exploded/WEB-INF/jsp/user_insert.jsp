<%--
  Created by IntelliJ IDEA.
  User: Sans
  Date: 2019/12/20
  Time: 16:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加用户</title>
</head>
<body>
<body>
    <form action="insertNewUser.do" method="post">
        用户名:<input type="text" name="username"/><br/>
        密码:<input type="password" name="password"/><br/>
        手机:<input type="text" name="phone"/><br/>
        邮箱:<input type="text" name="email"/><br/>
        <input type="submit" value="添加" />
    </form>
</body>
</body>
</html>
