<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2016/7/15
  Time: 16:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加商品</title>
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
    <form method="post" action="/wareadd">
        <label>商品名称</label><input type="text" class="input-box" name="wareName" required><br>
        <label>编码</label><input type="text" class="input-box" name="wareCode" required><br>
        <label>进价</label><input required placeholder="整数" pattern="^[0-9]*$" type="text" class="input-box" name="wareBasePrice"><br>
        <label>类型</label><input required type="text" class="input-box" name="wareType"><br>
        <label>规格</label><input required type="text" class="input-box" name="wareNorm"><br>
        <label>单位</label><input required type="text" class="input-box" name="wareUnit"><br>
        <input id="submit" type="submit" value="提交">
    </form>
</div>
</body>
</html>
