<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <title>添加用户</title>
    <style>
        #submit-id {
            margin-left: 210px;
            margin-top: 7px;
            display: inline-block;
            height: 30px;
            width: 64px;
            border-radius: 15px;
            box-shadow: 0 0 3px #0F0;
        }
        .input-box-select{
            margin-left: 0;
        }
        .input-box {
            margin: 4px 2px;
            box-shadow: 0 0 3px #0F0;
            border-radius: 3px;
            display: inline-block;
            height: 30px;
            width: 170px;
        }

        #box {
            position: absolute;
            width: 300px;
            left: 530px;
            top: 190px;
        }
        label {
            display: inline-block;
            width: 100px;
        }
    </style>
</head>
<body>
<%
    if(request.getAttribute("success") != null) {
        out.print("<script>alert('导入成功');</script>");
    }
%>
<%@include file="menu.jsp"%>
<div id="box">
    <form id="form" method="post" action="/usersadd">
        <label>用户名</label><input type="text" class="input-box" name="name"><br>
        <label>员工名称</label><input type="text" class="input-box" name="employee_name"><br>
        <label>密码</label><input id="password" type="password" class="input-box" name="passWord"><br>
        <label>密码确认</label><input id="password_confirm" type="password" class="input-box"><br>
        <label>角色选择</label>
        <select class="input-box input-box-select" name="role">
            <c:forEach var="item" items="${roles}">
                <option value="${item.roleId}">${item.roleName}</option>
            </c:forEach>
        </select><br>
        <label>用户组选择</label>
        <select class="input-box input-box-select" name="group">
            <c:forEach var="item" items="${groups}">
                <option value="${item.groupId}">${item.groupName}</option>
            </c:forEach>
        </select><br>
        <input id="submit-id" type="button" value="提交">
    </form>
</div>
<script>
    var sbtn = document.getElementById('submit-id');
    sbtn.addEventListener('click', function () {
        var psd = document.getElementById('password').value;
        var psd_confirm = document.getElementById('password_confirm').value;
        if(psd != psd_confirm) {
            alert('两次密码不同');
        } else {
            document.getElementById('form').submit();
        }
    });
</script>
</body>
</html>
