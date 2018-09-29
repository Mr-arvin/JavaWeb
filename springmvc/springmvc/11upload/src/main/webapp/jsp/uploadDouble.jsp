<%--
  Created by IntelliJ IDEA.
  User: xm
  Date: 2018/9/27
  Time: 2:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>上传</title>
</head>
<style>
    html,body {
        background: gray;
    }
</style>
<body>
<form enctype="multipart/form-data" method="post" action="/upload2.do">

    图片1:<input type="file" name="photos"><br>
    图片2:<input type="file" name="photos"><br>
    图片3:<input type="file" name="photos"><br>
    <input type="submit" value="上传">
</form>
</body>
</html>
