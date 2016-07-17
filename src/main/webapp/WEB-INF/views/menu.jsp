<%@page language="java" pageEncoding="UTF-8" %>
<style>
    #menu {
        width: 100%;
        height: 30px;
    }
    #menu * {
        margin: 0;
        padding: 0;
    }
    #menu ul {
        width: 99.5%;
        height: 28px;
        border: 1px solid #66afe9;
        border-radius: 3px;
        box-shadow: 0 0 2px #2aabd2;
    }
    #menu li {
        float: left;
        width: 25%;
        height: 100%;
        list-style-type: none;
    }
    #menu a {
        width: 99%;
        height: 100%;
        line-height: 28px;
        background-color: red;
        color: #FFFFFF;
        margin: 0 0.5%;
        font-size: 12px;
        display: inline-block;
        text-align: center;
        text-decoration: none;
    }
</style>
<div id="menu">
    <ul>
        <li><a href="#" style="margin-left: 0; width: 99.5%;">账户管理</a></li>
        <li><a href="#">订单管理</a></li>
        <li><a href="#">信息管理</a></li>
        <li><a href="#" style="margin-right: 0; width: 99.5%;">商品管理</a></li>
    </ul>
</div>