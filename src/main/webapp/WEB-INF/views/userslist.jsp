<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2016/7/14
  Time: 13:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查看用户</title>
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
            width: 140px;
            text-align: center;
            border: 1px solid;
            box-shadow: 0 0 2px #0F0;
            border-radius: 3px;
            margin: 0;
            cursor: pointer;
        }
        #users-list {
            width: 95%;
            position: absolute;
            left: 30px;
            top: 100px;
        }
    </style>
</head>
<body>
<%@include file="menu.jsp"%>
<table border=0 cellpadding="0" cellspacing="0" id="users-list">
    <thead>
    <tr><th>用户名</th>
        <th>员工姓名</th>
        <th>角色名称</th>
        <th>用户组名称</th></tr>
    </thead>
    <tbody>
    <c:forEach var="item" items="${requestScope.users}">
        <tr>
            <td>${item.userName}</td>
            <td>${item.employeeName}</td>
            <td>${item.roleByUserRoleId.roleName}</td>
            <td>${item.userGroupByUserGroupId.groupName}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
