<%--
  Created by IntelliJ IDEA.
  User: xm
  Date: 2018/9/28
  Time: 3:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="a" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="zh">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>monkey1024</title>
    <link href="/css/bootstrap.css" rel="stylesheet">

</head>
<body>
<div class="container theme-showcase" role="main">
    <div class="page-header">
        <form id="query-by-id" action="/findById.do" method="post">
            <input type="text" id="inputId" name="id" placeholder="请输入id" value="${id}">
            <button id="query" type="button" class="btn btn-sm btn-primary">查询</button>
            <a id="add" type="button" class="btn btn-sm btn-success" href="/jsp/user_add.jsp">添加</a>
        </form>
    </div>
    <div class="row">
        <div class="">
            <table class="table table-striped">
                <thead>
                <tr>
                    <th>编号</th>
                    <th>姓名</th>
                    <th>手机</th>
                    <th>生日</th>
                    <th>地址</th>
                    <th>操作</th>
                </tr>
                </thead>
                <tbody>
                <a:forEach items="${allUser}" var="user">
                    <tr>
                        <td>${user.key}</td>
                        <td>${user.value.name}</td>
                        <td>${user.value.phone}</td>
                        <td>${user.value.birthday}</td>
                        <td>${user.value.address}</td>
                        <td>
                            <button type="button" class="btn btn-sm btn-info">删除</button>
                            <button type="button" class="btn btn-sm btn-warning">修改</button>
                        </td>
                    </tr>
                </a:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>
<script src="/js/jquery-3.3.1.min.js"></script>
<script src="/js/bootstrap.js"></script>
<script>
    $(function () {
        $("#query").click(function () {
            var userid = $("#inputId").val();
            if(userid == ""){
                $(location).attr("href","/findAll.do");
            }else {
                $("#query-by-id").submit();
            }
        })
    });
</script>
</body>
</html>
