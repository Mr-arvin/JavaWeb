<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<td>序号</td>
			<td>用户</td>
			<td>操作</td>				
		</tr>
		<c:forEach items="${applicationScope.map }" var="m" varStatus="obj">
			<tr style="background-color:${obj.index%2 == 0?'orange':'red'}">
				<td>${obj.count }</td>
				<td>${m.key }</td>
				<td><a href="${pageContext.request.contextPath }/deleteUser?username=${m.key }">删除</a></td>				
			</tr>
			
		</c:forEach>
	</table>
</body>
</html>