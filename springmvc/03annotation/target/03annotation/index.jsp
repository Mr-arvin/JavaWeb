<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Hello World!</h2>
<form action="/test/requestGet.do" method="get">
    <input type="text" name="arvinGet">
    <input type="text" age="12">
    <input type="submit" value="get请求">
</form>
<br>
<form action="/test/requestPost.do" method="post">
    <input type="text" name="arvinPost">
    <input type="text" age="22">
    <input type="submit" value="post请求">
</form>
</body>
</html>
