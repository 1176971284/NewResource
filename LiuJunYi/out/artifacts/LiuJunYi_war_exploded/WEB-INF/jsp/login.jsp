<%--
  Created by IntelliJ IDEA.
  User: Sans
  Date: 2019/12/20
  Time: 09:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登录</title>
</head>
<body>
    <h1>欢迎使用刘俊熠教学系统</h1>
    <form method="post" action="loginsystem.do">
            用户名:<input type="text" name="username" onblur="checkusername(this.value)" /> <div id="usernamespan">*</div> <br/>
            密码:<input type="password" name="password" onblur="checkpassword(this.value)" /> <div id="passwordspan">*</div> <br/>
        <input type="submit" value="登录" />
    </form>
    <a href="reg.do">
        注册
    </a>
</body>
<script type="text/javascript">
    var checkuser="^[\D][a-zA-Z_0-9]{7}$";
    var zz=new RegExp(checkuser)
    function checkusername(username){
        if(zz.exec(username)){
            document.getElementById("usernamespan").innerHTML = "用户名不符合要求";
        }else{
            document.getElementById("usernamespan").innerHTML = "";
        }
    }
    function checkpassword(password){
        if(password==null||password==""){
            document.getElementById("passwordspan").innerHTML = "密码不能为空";
        }else{
            document.getElementById("passwordspan").innerHTML = "";
        }
    }
</script>
</html>
