<%--
  Created by IntelliJ IDEA.
  User: Sans
  Date: 2019/12/20
  Time: 11:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<body>
    <form action="addUser.do" method="post">
        用户名:<input type="text" name="username" onblur="checkusername(this.value)" /> <div id="usernamespan">*</div> <br/>
        密码:<input type="password" name="password" onblur="checkpassword(this.value)" /> <div id="passwordspan">*</div> <br/>
        <input type="submit" value="注册" />
    </form>
</body>
</html>
