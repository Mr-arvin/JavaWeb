<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<body>
<h2>Hello World!</h2>
<form action="/test/requestGet.do" method="get">
    <input type="text" name="name">
    <input type="text" age="age">
    <input type="submit" value="get请求">
</form>
<br>
<form action="/test/requestPost.do" method="post">
    <input type="text" name="name">
    <input type="text" age="age">
    <input type="submit" value="post请求">
</form>
</body>
