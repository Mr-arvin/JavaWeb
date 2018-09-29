<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*,Student.Student" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%  
	    pageContext.setAttribute("user", "admin");
	%>
	
	el表达式：${user }
	<br/>
	jstl中的out标签：<c:out value="${user }"></c:out>
	
	<br>
	<hr>
	
	<c:catch var="e">
	    ${pageContext.name };
	</c:catch>
	message = ${e.message }
	
	<br>
	<hr>
	
	
	<%  
	    pageContext.setAttribute("user", "admin");
	%>
	<c:if test="${user == 'admin' }" var="flag" scope="request">
	    欢迎登陆
	    ${flag }
	</c:if>
	
	<br>
	<hr>
	
	<% 
    pageContext.setAttribute("hobby", "basketball");
	%>
	<c:choose>
	    <c:when test="${hobby == 'basketball'}">
	        我喜欢打篮球
	    </c:when>
	    <c:when test="${hobby == 'football'}">
	        我喜欢踢足球
	    </c:when>
	    <c:when test="${hobby == 'volleyball'}">
	        我喜欢打排球
	    </c:when>
	    <c:otherwise>
	        我没什么爱好
	    </c:otherwise>
	</c:choose>
	
	<br>
	<hr>
	
	<br>---------------------遍历数组--------------------------<br>
	<% 
	    Object[] city = {"北京","上海","广州","天津"};
	    pageContext.setAttribute("city", city);
	%>
	<c:forEach items="${city }" var="c">
	    ${c }
	    <br>
	</c:forEach>
	
	<br>---------------------遍历List--------------------------<br>
	<%
	    List<String> name = new ArrayList<>();
	    name.add("刘德华");
	    name.add("张学友");
	    name.add("黎明");
	    name.add("郭富城");
	    pageContext.setAttribute("name", name);
	%>
	
	<c:forEach items="${name }" var="n">
	    ${n }
	    <br>
	</c:forEach>
	<br>---------------------遍历set--------------------------<br>
	<%
	    Set<String> program = new HashSet<>();
	    program.add("java");
	    program.add("c");
	    program.add("python");
	    program.add("php");
	    pageContext.setAttribute("program", program);
	%>
	
	<c:forEach items="${program }" var="p">
	    ${p }
	    <br>
	</c:forEach>
	
	<br>---------------------遍历map--------------------------<br>
	<%
	    Map<String,String> map = new HashMap<>();
	    map.put("第一名", "中国");
	    map.put("第二名", "美国");
	    map.put("第三名", "德国");
	    pageContext.setAttribute("map", map);
	%>
	
	<c:forEach items="${map }" var="m">
	    ${m.key } : ${m.value }
	    <br>
	</c:forEach>
	
	<br>
	<hr>
		<br>---------------------指定遍历起始及步长--------------------------<br>
	<%
	    Object[] country = {"0中国","1美国","2德国","3法国","4英国","5瑞士","6瑞典","7意大利"};
	    pageContext.setAttribute("country", country);
	%>
	
	<c:forEach items="${country }" var="c" begin="1" end="4">
	    ${c }
	    <br>
	</c:forEach>
	
	<hr>
	<br>---------------------指定遍历起始及步长--------------------------<br>
	<%
	    Object[] country2 = {"0中国","1美国","2德国","3法国","4英国","5瑞士","6瑞典","7意大利"};
	    pageContext.setAttribute("country", country2);
	%>
	
	<c:forEach items="${country }" var="c" begin="1" end="7" step="2">
	    ${c }
	    <br>
	</c:forEach>
	
	<br>
	<hr>
		<%
	    List<Student> student = new ArrayList<>();
	    student.add(new Student("马云",22));
	    student.add(new Student("马化腾",26));
	    student.add(new Student("李彦宏",21));
	    student.add(new Student("周鸿祎",20));
	    student.add(new Student("雷军",28));
	    student.add(new Student("陈一舟",25));
	    student.add(new Student("柳传志",30));
	    pageContext.setAttribute("student", student);
	%>
	<table border="1">
	    <tr>
	        <td>序号</td>
	        <td>姓名</td>
	        <td>年龄</td>
	    </tr>
	
	    <c:forEach items="${student }" var="s" varStatus="obj">
	        <tr>
	            <td>${obj.count }</td>
	            <td>${s.name }</td>
	            <td>${s.age }</td>
	        </tr>
	    </c:forEach>
	
	</table>
	
	<hr>
	<br>
	<table border="1">
	    <tr>
	        <td>序号</td>
	        <td>姓名</td>
	        <td>年龄</td>
	    </tr>
	
	    <c:forEach items="${student }" var="s" varStatus="obj">
	        <tr style="background-color: ${obj.index % 2 == 0? 'orange':'red'}">
	            <td>${obj.count }</td>
	            <td>${s.name }</td>
	            <td>${s.age }</td>
	        </tr>
	    </c:forEach>
	
	</table>
</body>
</html>