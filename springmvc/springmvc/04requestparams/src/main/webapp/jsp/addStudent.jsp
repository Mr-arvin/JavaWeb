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
<form action="/student/add1.do" method="post">
    姓名：<input type="text" name="name">
    <br>
    年龄：<input type="text" name="age">
    <input type="submit" value="提交">
</form>

<br>

<form action="/student/add2.do" method="post">
    姓名：<input type="text" name="name">
    <br>
    年龄：<input type="text" name="age">
    <br>
    <%--要写成对象属性.属性的方式--%>
    学校名称：<input type="text" name="school.schoolName">
    <br>
    学校地址：<input type="text" name="school.address">
    <br>
    <input type="submit" value="提交">
</form>
</body>
</html>
