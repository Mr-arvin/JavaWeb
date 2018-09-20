<%--
  Created by IntelliJ IDEA.
  User: xm
  Date: 2018/9/20
  Time: 上午9:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="/js/jquery-3.3.1.min.js"></script>
</head>
<body>
    <button type="submit" id="objectReturnString">object-String</button>
</body>
<script>
    $(function () {
        $("#objectReturnString").click(function () {
            $.ajax({
                method:"post",
                url:"/returnString.do",
                // data:{name:"monkey",age:"24"},
                success:function (result) {
                    console.log(result)
                }
            })
        })
    });
</script>
</html>
