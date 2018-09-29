<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>首页</title>
</head>
<body>
${msg }
	<form action="${pageContext.request.contextPath }/loginn" method="post">
		<table>
			<tr>
				<td>用户名：</td><td><input type="text" name="name"/></td>
			</tr>
			<tr>
				<td>密&nbsp;&nbsp;&nbsp;码：</td><td><input type="password" name="password"/></td>
			</tr>
		</table>
		<input type="submit" value="登录"/><br/>
	</form>
	没有用户名?点此<a href="${pageContext.request.contextPath }/regist.jsp">注册</a>
</body>
</html>