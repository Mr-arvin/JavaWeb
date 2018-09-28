<%--
  Created by IntelliJ IDEA.
  User: xm
  Date: 2018/9/28
  Time: 1:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<%--当访问该页面的时候，表示已经登陆了，这里直接setAttribute给他设置session了--%>
<%
    request.getSession().setAttribute("user","monkey1024");
%>
</body>
</html>
