<%--
  Created by IntelliJ IDEA.
  User: xm
  Date: 2018/9/1
  Time: 下午11:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>requestparams</title>
</head>
<body>
/user/params01do:
<form action="/user/params01do" method="post">
    姓名：<input type="text" name="username">
    <br>
    年龄：<input type="text" name="age">
    <input type="submit" value="提交">
</form>
<br>
<br>
/user/params01do:
<form action="/user/params02.do" method="post">
    姓名：<input type="text" name="username">
    <br>
    年龄：<input type="text" name="age">
    <input type="submit" value="提交">
</form>
</body>
</html>
