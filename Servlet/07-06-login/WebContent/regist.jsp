<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>注册</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/regist" method="post">
	${msg }
	<table>
		<tr>
			<td>用&nbsp;户&nbsp;名&nbsp;：</td><td><input type="text" name="name" value=""/></td>
		</tr>
		<tr>
			<td>密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码&nbsp;：</td><td><input type="password" name="password" /></td>
		</tr>
		<tr>
			<td>确认密码：</td><td><input type="password" name="repassword"/></td>
		</tr>
		<tr>
			<td>邮&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;箱&nbsp;：</td><td><input type="text" name="email" /></td>
		</tr>
		<tr>
		<!--  
			<td>生&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;日&nbsp;：</td><td><input type="text" name="birthday" /></td>
		-->
			<td>生&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;日&nbsp;：</td><td><input type="date" name="birthday" /></td>
		</tr>
	</table>
		<input type="submit" value="注册"/><br/>
	</form>
</body>
</html>