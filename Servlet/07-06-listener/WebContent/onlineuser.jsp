<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>统计当前系统在线用户数量</title>
</head>
<body>
	该系统平台目前共有在线用户${ipMap.size() }个<br>
	<a href="${pageContext.request.contextPath }/logout">安全退出</a>
</body>
</html>
