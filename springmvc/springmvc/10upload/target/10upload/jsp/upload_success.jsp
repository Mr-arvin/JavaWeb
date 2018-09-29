<%--
  Created by IntelliJ IDEA.
  User: xm
  Date: 2018/9/27
  Time: 3:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>上传成功</title>
</head>
<style>
    html,body {
        background: gray;
    }
</style>
<body>
上传成功！
<img src="${pageContext.request.contextPath}/upload/${filename}" alt="">
</body>
</html>
