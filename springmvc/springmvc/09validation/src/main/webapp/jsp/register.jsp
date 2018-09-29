<%--
  Created by IntelliJ IDEA.
  User: xm
  Date: 2018/9/27
  Time: 8:59 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/user/register.do" method="post">
    姓名：<input type="text" name="name">${nameError}<br>
    年龄：<input type="text" name="age">${ageError}<br>
    手机号：<input type="text" name="phone">${phoneError}<br>
    <input type="submit" value="提交">
</form>
</body>
</html>
