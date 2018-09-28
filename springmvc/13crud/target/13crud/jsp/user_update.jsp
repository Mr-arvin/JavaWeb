<%--
  Created by IntelliJ IDEA.
  User: xm
  Date: 2018/9/28
  Time: 3:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="zh">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>monkey1024</title>
    <link href="css/bootstrap.css" rel="stylesheet">
</head>
<body>
<div class="page-header"></div>
<div class="container">
    <form action="" method="post" style="max-width: 330px;padding: 15px;margin: 0 auto;">
        <div class="form-group">
            <label for="name">姓名:</label>
            <input type="text" class="form-control" id="name">
        </div>
        <div class="form-group">
            <label for="phone">手机:</label>
            <input type="text" class="form-control" id="phone">
        </div>
        <div class="form-group">
            <label for="birthday">生日:</label>
            <input type="date" class="form-control" id="birthday">
        </div>
        <div class="form-group">
            <label for="address">地址:</label>
            <input type="text" class="form-control" id="address">
        </div>

        <input type="submit" value="提交">
    </form>
</div>
<script src="js/jquery-3.3.1.min.js"></script>
<script src="js/bootstrap.js"></script>
</body>
</html>