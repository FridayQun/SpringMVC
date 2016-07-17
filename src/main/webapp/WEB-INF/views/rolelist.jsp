<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2016/7/14
  Time: 13:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查看角色</title>
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
    <tr><th>角色名称</th>
        <th>角色权限</th>
        <th>对用户操作权限</th>
        <th>对角色操作权限</th>
        <th>对组操作权限</th></tr>
    </thead>
    <tbody>
    <c:forEach var="item" items="${roles}">
        <tr>
            <td>${item.roleName}</td>
            <td>${item.roleDesc}</td>
            <td>
                <c:choose>
                    <c:when test="${fn:substring(item.userRole, 0, 1) eq '1'}">
                        <input type="checkbox" disabled="disabled" checked>增
                    </c:when>
                    <c:otherwise>
                        <input type="checkbox" disabled="disabled">增
                    </c:otherwise>
                </c:choose>
                <c:choose>
                    <c:when test="${fn:substring(item.userRole, 1, 2) eq '1'}">
                        <input type="checkbox" disabled="disabled" checked>删
                    </c:when>
                    <c:otherwise>
                        <input type="checkbox" disabled="disabled">删
                    </c:otherwise>
                </c:choose>
                <c:choose>
                    <c:when test="${fn:substring(item.userRole, 2, 3) eq '1'}">
                        <input type="checkbox" disabled="disabled" checked>查
                    </c:when>
                    <c:otherwise>
                        <input type="checkbox" disabled="disabled">查
                    </c:otherwise>
                </c:choose>
                <c:choose>
                    <c:when test="${fn:substring(item.userRole, 3, 4) eq '1'}">
                        <input type="checkbox" disabled="disabled" checked>改
                    </c:when>
                    <c:otherwise>
                        <input type="checkbox" disabled="disabled">改
                    </c:otherwise>
                </c:choose>
            </td>
            <td>
                <c:choose>
                    <c:when test="${fn:substring(item.userRole, 0, 1) eq '1'}">
                        <input type="checkbox" disabled="disabled" checked>增
                    </c:when>
                    <c:otherwise>
                        <input type="checkbox" disabled="disabled">增
                    </c:otherwise>
                </c:choose>
                <c:choose>
                    <c:when test="${fn:substring(item.userRole, 1, 2) eq '1'}">
                        <input type="checkbox" disabled="disabled" checked>删
                    </c:when>
                    <c:otherwise>
                        <input type="checkbox" disabled="disabled">删
                    </c:otherwise>
                </c:choose>
                <c:choose>
                    <c:when test="${fn:substring(item.userRole, 2, 3) eq '1'}">
                        <input type="checkbox" disabled="disabled" checked>查
                    </c:when>
                    <c:otherwise>
                        <input type="checkbox" disabled="disabled">查
                    </c:otherwise>
                </c:choose>
                <c:choose>
                    <c:when test="${fn:substring(item.userRole, 3, 4) eq '1'}">
                        <input type="checkbox" disabled="disabled" checked>改
                    </c:when>
                    <c:otherwise>
                        <input type="checkbox" disabled="disabled">改
                    </c:otherwise>
                </c:choose>
            </td>
            <td>
                <c:choose>
                    <c:when test="${fn:substring(item.userRole, 0, 1) eq '1'}">
                        <input type="checkbox" disabled="disabled" checked>增
                    </c:when>
                    <c:otherwise>
                        <input type="checkbox" disabled="disabled">增
                    </c:otherwise>
                </c:choose>
                <c:choose>
                    <c:when test="${fn:substring(item.userRole, 1, 2) eq '1'}">
                        <input type="checkbox" disabled="disabled" checked>删
                    </c:when>
                    <c:otherwise>
                        <input type="checkbox" disabled="disabled">删
                    </c:otherwise>
                </c:choose>
                <c:choose>
                    <c:when test="${fn:substring(item.userRole, 2, 3) eq '1'}">
                        <input type="checkbox" disabled="disabled" checked>查
                    </c:when>
                    <c:otherwise>
                        <input type="checkbox" disabled="disabled">查
                    </c:otherwise>
                </c:choose>
                <c:choose>
                    <c:when test="${fn:substring(item.userRole, 3, 4) eq '1'}">
                        <input type="checkbox" disabled="disabled" checked>改
                    </c:when>
                    <c:otherwise>
                        <input type="checkbox" disabled="disabled">改
                    </c:otherwise>
                </c:choose>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
