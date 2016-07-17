<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2016/7/6
  Time: 12:45
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
    <meta http-equiv="content-type" content="text/html"; charset="utf-8">
    <title>ADD ROLE</title>
    <link href="<c:url value="/static/css/bootstrap.css"></c:url>" rel="stylesheet">
    <link href="<c:url value="/static/css/app.css"></c:url>" rel="stylesheet">
</head>

<body>
<%
    if(request.getAttribute("success") != null) {
        out.print("<script>alert('导入成功');</script>");
    }
%>
<%@include file="menu.jsp"%>
<div class="generic-container">
    <div class="well lead">ROLE ADD</div>
    <form:form method="post" modelAttribute="role" class="form-horizontal" action="/roleadd">

        <div class="row">
            <div style="display:inline-block">
                <label class="col-md-3 control-label" for="roleName" style="width: 200px;">角色名称：</label>
            </div>
            <div style="display:inline-block">
                <form:input path="roleName" type="text" id="roleName" class="form-control input-sm"></form:input>
                <div class="has-error">
                    <form:errors path="roleName" class="help=inline"></form:errors>
                </div>
            </div>
        </div>

        <div class="row">
                <div style="display:inline-block">
                    <label class="col-md-3 control-label" for="roleDesc" style="width: 200px;">角色描述：</label>
                </div>
            <div style="display:inline-block">
                <form:input path="roleDesc" type="text" id="roleDesc" class="form-control input-sm"></form:input>
                <div class="has-error">
                    <form:errors path="roleDesc" class="help=inline"></form:errors>
                </div>
            </div>
        </div>

        <div class="row">
            <div style="display:inline-block">
                <label class="col-md-3 control-label" style="width: 200px;" >角色权限：</label>
            </div>
            <div style="display:inline-block">
                <label class="checkbox-inline">
                    <input type="checkbox" name="userRole" value="0">编辑
                </label>
                <label class="checkbox-inline">
                    <input type="checkbox" name="userRole" value="1">添加
                </label>
                <label class="checkbox-inline">
                    <input type="checkbox" name="userRole" value="2">删除
                </label>
                <label class="checkbox-inline">
                    <input type="checkbox" name="userRole" value="3">查看
                </label>
            </div>
        </div>

        <div class="row">
            <div class="form-action floatRight">
                <c:choose>
                    <c:when test="${edit}">
                        <input type="submit" value="Update" class="btn btn-primary btn-sm"/> or <a href="<c:url value='/list' />">Cancel</a>
                    </c:when>
                    <c:otherwise>
                        <input type="submit" value="Add" class="btn btn-primary btn-sm"/> or <a href="<c:url value='/list' />">Cancel</a>
                    </c:otherwise>
                </c:choose>
            </div>
        </div>
    </form:form>
</div>

</body>
</html>
