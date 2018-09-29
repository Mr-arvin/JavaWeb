<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="Student.*,java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>EL表达式</title>
</head>
<body>
	<% 
		pageContext.setAttribute("name", "dogPage"); 
		request.setAttribute("name", "dogRequest");
		request.setAttribute("name1", "dogRequest2");	
		session.setAttribute("name2", "dogSession");
	%>
	
	${name}
	<br>
	${name1}
	<br>
	${name2}
	
	<br>
	<hr>
	
	<% 
		pageContext.setAttribute("age", "age11"); 
		request.setAttribute("age", "age12");
		session.setAttribute("age", "age13");
		application.setAttribute("age", "age13");
	%>
	
	${pageScope.age }
	${requestScope.age }
	${sesstionScope.age }
	${applicationScope.age }
	
	<hr> 
	
	<!-- 访问bean属性 -->
<%
	Student s = new Student("张三",21);
	request.setAttribute("s", s);
%>
${s.age};
${s.name};
${requestScope.s.name};
${s["age"]};

<hr>

<%
	School school = new School("清华大学",s);
	request.setAttribute("school", school);	
%>

${school.stu.name};
${school.stu.age};
${school.name};

<hr>

<% 
	List<Student> list  = new ArrayList<>(); 
	list.add(new Student("李四",24));
	list.add(new Student("王五",25));
	list.add(new Student("赵州桥",44));
	request.setAttribute("list",list);
%>

${list[1].name };
${list[1].age };
${list[2].age };

<!-- 从map中获取数据 -->
<%
	Map<String,String> map  = new HashMap<>();
	map.put("name", "monkey1024");
	map.put("password", "asdasdasd");
	request.setAttribute("map",map);
%>

${map.name};
${map.password};

<hr>
<!-- 运算符 -->
${2 > 1 };
${2 == 1 };
${2+2 };

<hr>

<!-- empty运算符 -->
<%
	request.setAttribute("name11", "");
	request.setAttribute("name22", "asdfasdf");
	request.setAttribute("student11", null);
%>
${empty name11 };
${empty name22 };
${empty noname };
${empty student11 };
	
</body>
</html>