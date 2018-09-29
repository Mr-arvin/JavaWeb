<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.monkey1024.com/jsp/monkeyTld" prefix="monkeyfn"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	${pageContext.request }
	<br>
	<hr>
	${pageContext.request.contextPath }
	<form action="${pageContext.request.contextPath }/login.do">
	</form>
	<br>
	<hr>
	${param.name }
	<br>
	<hr>
	${paramValues.name[0] }
	${paramValues.name[1] }
	<br>
	<hr>
	<!-- 获取web.xml中的初始化参数的值 -->
	${initParam.admin }
	<%-- ${"abc" + "def" } --%> <!-- 会报错 -->
	<br>
	<hr>
	${monkeyfn:toUpper("monsdf") }
</body>
</html>