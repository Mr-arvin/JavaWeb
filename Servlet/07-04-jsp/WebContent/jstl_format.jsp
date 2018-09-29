<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	    Date date = new Date();
	    pageContext.setAttribute("date", date);
	%>
	
	<form action="">
	    <!-- 在页面中直接显示 -->
	    <fmt:formatDate value="${date }" pattern="yyyy-MM-dd"/>
	    <br>
	    <!-- 将格式化后的日期显示在表格中 -->
	    <fmt:formatDate value="${date }" var="birth" pattern="yyyy-MM-dd"/>
	    <input type="text" name="birthdat" value="${birth }">
	</form>
	
	<hr>
	<br>
	
	<%
	    String date2 = "2017-10-03";
	    pageContext.setAttribute("date", date2);
	%>
	<!-- 将转换后的日期直接输出在页面中 -->
	<fmt:parseDate value="${date }" pattern="yyyy-MM-dd"></fmt:parseDate>
	<br>
	
	<!-- 将转换后的日期存放在指定变量中 -->
	<fmt:parseDate value="${date }" var="birth" pattern="yyyy-MM-dd"></fmt:parseDate>
	${birth }
</body>
</html>