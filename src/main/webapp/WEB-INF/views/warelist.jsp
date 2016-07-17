<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2016/7/15
  Time: 20:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查看商品</title>
    <style>
        th {
            width: 140px;
            border: solid 1px black;
            margin: 0;
            padding: 0;
            border-radius: 3px;
            box-shadow: 0 0 3px #0F0;
            cursor: pointer;
            font-size: 20px;
            font-weight: bold;
            height: 30px;
        }
        th:HOVER {
            background-color: #2aabd2;
        }
        td:HOVER {
            background-color: #2aabd2;
        }
        td {
            height: 26px;
            cursor: pointer;
            width: 140px;
            text-align: center;
            border: 1px solid;
            box-shadow: 0 0 2px #0F0;
            border-radius: 3px;
            margin: 0;
        }
        #role-list {
            border: solid 1px;
            box-shadow: 0 0 3px #0f0;
            width: 95%;
            position: absolute;
            left: 30px;
            top: 100px;
        }
    </style>
</head>
<body>
<%@include file="menu.jsp"%>
<table border=0 cellpadding="0" cellspacing="0" id="role-list">
    <thead>
    <tr><th>商品编码</th>
        <th>商品名称</th>
        <th>商品规格</th>
        <th>商品进价</th>
        <th>更新时间</th></tr>
    </thead>
    <tbody>
    <c:forEach var="item" items="${wares}">
        <tr>
            <td>${item.wareCode}</td>
            <td>${item.wareName}</td>
            <td>${item.wareNorm}</td>
            <td>${item.wareBasePrice}</td>
            <td>${item.lastTime}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
