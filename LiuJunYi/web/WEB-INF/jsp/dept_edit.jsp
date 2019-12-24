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
    <title>修改部门</title>
</head>
<body>
    <form action="deptupdate.do" method="post">
        <input type="hidden" name="deptid" value="${old_dept.deptid}" >
        部门名:<input type="text" name="deptname" value="${old_dept.deptname}" /><br/>
        部门编号:<input type="text" name="deptcode" value="${old_dept.deptcode}" /><br/>
        创建时间:<input type="text" name="create_time" value="${old_dept.create_time}" /><br/>
        <input type="submit" value="修改" />
    </form>
</body>
</html>
