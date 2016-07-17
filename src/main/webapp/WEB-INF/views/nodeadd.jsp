<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2016/7/15
  Time: 17:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加售货机</title>
    <style>
        label {
            display: inline-block;
            width: 100px;
        }
        .radio-box {
            width: 170px;
            margin: 5px;
            margin-left: 4px;
        }
        .radio-box label {
            width: 55px;
        }
        .radio-box input {
            margin-top: 9px;
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
        .input-box-select{
            margin-left: 0;
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
    <form method="post" action="/nodeadd">
        <label>设备编号</label><input required placeholder="整数" pattern="^[0-9]*$" type="text" class="input-box" name="nodeId"><br>
        <label>设备铭牌号</label><input required placeholder="整数" pattern="^[0-9]*$" type="text" class="input-box" name="nodeName"><br>
        <label>请选择货道组</label>
        <select class="input-box input-box-select" name="versionName">
            <c:forEach var="item" items="${versions}">
                <option value="${item.versionName}">${item.versionName}</option>
            </c:forEach>
        </select>
        <br>
        <label>请选择设备组</label>
        <select class="input-box input-box-select" name="nodeGroupId">
            <c:forEach var="item" items="${nodeGroups}">
                <option value="${item.nodeGroupId}">${item.nodeGroupName}</option>
            </c:forEach>
        </select>
        <br>
        <label>主板号</label><input required type="text" class="input-box" name="macAddr"><br>
        <label>SIM卡号</label><input required type="text" class="input-box" name="simNo"><br>
        <label>机器类型</label>
        <select class="input-box input-box-select" name="machineType">
            <c:forEach var="item" items="${machineTypes}">
                <option value="${item}">${item}</option>
            </c:forEach>
        </select>
        <br>
        <label>是否专卖</label>
        <span class="input-box radio-box">
        <input required type="radio" name="monopoly" value="0" checked />
            <label>不专卖</label>
        <input required type="radio" name="monopoly" value="1" />
            <label>专卖</label>
        </span>
        <br>
        <label>机器地址</label><input required type="text" class="input-box" name="nodeAddr"><br>
        <input id="submit" type="submit" value="提交">
    </form>
</div>
</body>
</html>
