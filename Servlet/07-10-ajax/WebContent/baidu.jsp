<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 用户输入框 -->
	<div id="divSearch">
		<input type="text" name="name" id="name" style="width:160px">
		<input type="submit" value="搜索">
	</div>
	

	<!-- 下拉提示框 -->
	<div id="tips" style="display:none; border: 1px solid #dddddd; backgoround-color:gray; width:164px">
		小猴子1024
	</div>
</body>
<script type="text/javascript" src="${pageContext.request.contextPath }/MyAjax.js"></script>
<script>
	window.onload=function(){
		var searchElement = document.getElementById("name");
		var tipsELement = document.getElementById("tips");
		searchElement.onkeyup = function(){
			//获取输入框的值
			var name = this.value;
			if(name == ""){
				tipsELement.style.display = "none";
				return;
			}
			
			//获取XMLHttpRrequet对象
			var xhr = getXMLHttpRequest();
			
			//回调函数
			xhr.onreadystatechange = function(){
				console.log("222")
				if(xhr.readyState == 4){
					if(xhr.status == 200){
						var str = xhr.responseText;//获取服务器返回的数据
						console.log("sdf")
						if(str == ""){
							return;
						}
						//返回数据格式以"，"区分的字符串，例如：monkey，小猴子，1024						
						var result = str.split(",");
						//result:{"monkey","小猴子","1024"}
						var childDivs = "";
						
						//循环把数据放到div中
						for(var i=0; i<result.length; i++){
							childDivs +="<div onclick='writeText(this)' onmouseover='changeBackground_over(this)' onmouseout='changeBackground_out(this)'>"+result[i]+"</div>"
						}
						//把多个childDivs放在tips中
						tipsELement.innerHTML = childDivs;
						tipsELement.style.display = "block";	
					}
				}
			}
			
			//创建连接
			xhr.open("get","${pageContext.request.contextPath }/search?name="+name);
			//发送请求
			xhr.send(null);
						
		}			
	}
	
	//将文本填充到搜索框
    function writeText(div){
        //得到搜索框
        var searchElement = document.getElementById("name");
        searchElement.value = div.innerHTML;//把div中的文本添加到搜索框中
        div.parentNode.style.display="none";//把context1的div隐藏
    }
	
 	//鼠标悬浮时，改变背景色
    function changeBackground_over(div){
        div.style.backgroundColor = "orange";
    }
 	
    //鼠标离开时，恢复背景色
    function changeBackground_out(div){
        div.style.backgroundColor = "";
    }
	

</script>
</html>