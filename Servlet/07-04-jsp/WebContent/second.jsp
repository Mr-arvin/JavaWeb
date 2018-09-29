<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>firstJSP</title>
</head>
<body>
	<% 
		Date d = new Date();		
		int i = 0;
	%>
	<div	>ok</div>
	<%
		out.write(d.toLocaleString());
	%>
	<%! 
		public void m1(){
			System.out.println("私发多少否则");
		}
	%>
	<%= i  %>
	<%= "邢淼"  %>
	
</body>
</html>   