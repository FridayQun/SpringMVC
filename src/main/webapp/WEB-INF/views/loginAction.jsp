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
    <title>Login</title>
</head>
<style>
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
        margin: 2px;
        box-shadow: 0 0 3px #0F0;
        border-radius: 3px;
        display: inline-block;
        height: 30px;
    }

    #login-box {
        position: absolute;
        width: 300px;
        left: 530px;
        top: 190px;
    }
</style>
<body>

<div>
    <%@include file="/WEB-INF/views/menu.jsp"%>
    <div id="login-box">
    <div><h1>LOGIN</h1></div>
    <form method="post" action="/loginAction">
        <label style="display: inline-block; width: 100px;">用户名</label><input class="input-box" name="userName"><br/>
        <label style="display: inline-block; width: 100px;">密码</label><input class="input-box" type="password" name="passWord"><br/>
        <input id="submit" type="submit" value="提交">
    </form>
    </div>
</div>

</body>
</html>
