<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2016/7/9
  Time: 20:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>User Login Form</title>
    <link href="<c:url value='/static/css/bootstrap.css' />" rel="stylesheet">
    <link href="<c:url value='/static/css/app.css' />" rel="stylesheet">
    <title>Title</title>
</head>
<body>

<div class="generic-container">
    <div class="well lead">LOGIN</div>
    <form:form method="get" modelAttribute="user" class="form-horizontal"
        action="loginAction">
        <!--user name-->
        <div class="row">
            <div style="display:inline-block">
                <label class="col-md-3 control-label" for="userName" style="width: 200px;">用户名称：</label>
            </div>
            <div style="display:inline-block">
                <form:input path="userName" type="text" id="userName" class="form-control input-sm"></form:input>
                <div class="has-error">
                    <form:errors path="userName" class="help=inline"></form:errors>
                </div>
            </div>
        </div>

        <!--pass word-->
        <div class="row">
            <div style="display:inline-block">
                <label class="col-md-3 control-label" for="passWord" style="width: 200px;">登陆密码：</label>
            </div>
            <div style="display:inline-block">
                <form:input path="passWord" type="password" id="passWord" class="form-control input-sm"></form:input>
                <div class="has-error">
                    <form:errors path="passWord" class="help=inline"></form:errors>
                </div>
            </div>
        </div>

        <!--role-->
        <div class="row">
            <div style="display:inline-block">
                <label class="col-md-3 control-label" for="roleByUserRoleId" style="width: 200px;">登录角色：</label>
            </div>

            <div style="display:inline-block; width: 177px; margin-top: 10px;" >
                <form:select path="roleByUserRoleId" items="${roles}" multiple="true" itemValue="roleId" itemLabel="roleName" class = "form-control input-sm"></form:select>
                <div class="has-error">
                    <form:errors path="roleByUserRoleId" class="help-inline"></form:errors>
                </div>
            </div>

        </div>

        <div class="row">
            <div class="form-action floatRight">
                <c:choose>
                    <c:when test="${edit}">
                        <input type="submit" name="submit" value="Update" class="btn btn-primary btn-sm"/> or <a href="<c:url value='/list' />">Cancel</a>
                    </c:when>
                    <c:otherwise>
                        <input type="submit" name="submit" value="Add" class="btn btn-primary btn-sm"/> or <a href="<c:url value='/list' />">Cancel</a>
                    </c:otherwise>
                </c:choose>
            </div>
        </div>
    </form:form>

</div>

</body>
</html>
