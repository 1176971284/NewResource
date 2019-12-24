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
    <title>添加部门</title>
</head>
<body>
    <form action="insertNewDept.do" method="post">
        部门名:<input type="text" name="deptname"/><br/>
        部门编号:<input type="text" name="deptcode"/><br/>
        创建时间:<input type="text" name="create_time"/><br/>
        <input type="submit" value="修改" />
    </form>
</body>
</html>
