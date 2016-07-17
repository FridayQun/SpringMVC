<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2016/7/14
  Time: 12:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加用户组</title>
    <style>
        label {
            display: inline-block;
            width: 100px;
        }
        #submit {
            margin-left: 210px;
            margin-top: 7px;
            display: inline-block;
            height: 30px;
            width: 64px;
            border-radius: 15px;
            box-shadow: 0 0 3px #0F0;
        }
        .input-box {
            margin: 4px 2px;
            box-shadow: 0 0 3px #0F0;
            border-radius: 3px;
            display: inline-block;
            height: 30px;
        }
        #box {
            position: absolute;
            width: 300px;
            left: 530px;
            top: 190px;
        }
    </style>
</head>
<body>
<%
    if(request.getAttribute("success") != null) {
        out.print("<script>alert('插入成功');</script>");
    }
%>
<%@include file="menu.jsp"%>
<div id="box">
<form method="post" action="/groupadd">
    <label>组类型</label><input type="text" class="input-box" name="type"><br>
    <label>组名字</label><input type="text" class="input-box" name="name"><br>
    <label>组长</label><input type="text" class="input-box" name="leader"><br>
    <label>组权限</label><input type="text" class="input-box" name="desc"><br>
    <input id="submit" type="submit" value="提交">
</form>
</div>
</body>
</html>
