<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="">
		用户名：<input type="text" name="username" id="username"><span id="msg"></span>
	</form>
</body>
<script type="text/javascript" src="${pageContext.request.contextPath }/MyAjax.js"></script>
<script>
	window.onload=function(){
		var nameElement = document.getElementById("username");
		//绑定onblur事件
		nameElement.onblur = function(){
			//获取用户输入的值 this=》nameElement
			var name = this.value;
			console.info(name);
			
			//创建XMLHttpRequest对象
			var xhr = getXMLHttpRequest();
			
			//注册回调函数
			//编写回调函数处理函数计算结果 onreadystatechange就是告诉ajax引擎这个是回调函数 回调函数是由ajax引擎拿到计算结果数据之后开始调用的
			//当server端计算完毕之后，将结果发送给ajax引擎，ajax引擎才会调用回调函数
			xhr.onreadystatechange = function(){
				if(xhr.readyState == 4){//请求一切正常
					if(xhr.status == 200){//服务器响应一切正常
						document.getElementById("msg")
						if(xhr.responseText == "true"){//responseText可以获取servlet返回的
							msg.innerHTML = "<font color='red'>用户名已存在</font>"							
						}else{
							msg.innerHTML = "可以使用";
						}
					}
				}
			}
			
			//创建连接
			xhr.open("get","${pageContext.request.contextPath }/regist?name="+name);
			//发送请求
			xhr.send(null);
		}
	}
</script>
</html>