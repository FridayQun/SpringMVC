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
    #menu .menu-first {
        width: 99.5%;
        height: 28px;
        border: 1px solid #66afe9;
        border-radius: 3px;
        box-shadow: 0 0 2px #2aabd2;
    }
    #menu .list-first {
        float: left;
        width: 25%;
        height: 100%;
        list-style-type: none;
    }
    #menu .list-first a {
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
    .menu-second {
        display: none;
        border-radius: 5px;
        border-top-left-radius: 0;
        border-top-right-radius: 0;
        width: 99%;
        border: 1px solid #66afe9;
        box-shadow: 0 0 5px greenyellow;
        overflow: hidden;
    }
    .list-first:hover .menu-second {
        display: block;
    }
    .list-second {
        border: 1px solid #66afe9;
    }

    #menu .list-second a {
        width: 100%;
        height: 100%;
        line-height: 28px;
        background-color: red;
        color: #FFFFFF;
        margin: 0;
        font-size: 12px;
        display: inline-block;
        text-align: center;
        text-decoration: none;
    }
</style>
<div id="menu">
    <ul class="menu-first">
        <li class="list-first">
            <a href="#" style="margin-left: 0; width: 99.5%;">账户管理</a>
            <ul class="menu-second">
                <li class="list-second"><a href="/usersadd">增加用户</a></li>
                <li class="list-second"><a href="/userslist">浏览用户</a></li>
                <li class="list-second"><a href="/roleadd">增加角色</a></li>
                <li class="list-second"><a href="/rolelist">浏览角色</a></li>
                <li class="list-second"><a href="/groupadd">增加组</a></li>
                <li class="list-second"><a href="/grouplist">浏览组</a></li></ul></li>
        <li class="list-first"><a href="#">订单管理</a>
            <ul class="menu-second">
                <li class="list-second"><a href="#">增加货物</a></li>
                <li class="list-second"><a href="#">浏览货物</a></li>
                <li class="list-second"><a href="#">二级栏目</a></li>
                <li class="list-second"><a href="#">二级栏目</a></li></ul></li>
        </li>
        <li class="list-first"><a href="#">信息管理</a>
            <ul class="menu-second">
                <li class="list-second"><a href="#">二级栏目</a></li>
                <li class="list-second"><a href="#">二级栏目</a></li>
                <li class="list-second"><a href="#">二级栏目</a></li>
                <li class="list-second"><a href="#">二级栏目</a></li></ul></li>
        </li>
        <li class="list-first"><a href="#" style="margin-right: 0; width: 99.5%;">商品管理</a>
            <ul class="menu-second">
                <li class="list-second"><a href="/wareadd">增加货物</a></li>
                <li class="list-second"><a href="/warelist">浏览货物</a></li>、</ul></li>
        </li>
    </ul>
</div>
