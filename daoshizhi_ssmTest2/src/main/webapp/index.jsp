<%--
  Created by IntelliJ IDEA.
  User: z'y'f
  Date: 2020/9/11
  Time: 19:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>登录页面</title>
    <link rel="stylesheet" type="text/css" href="/daoshizhi_ssmTest2_war_exploded/css/login.css"/>
    <script src="https://cdn.jsdelivr.net/npm/vue/dist/vue.js"></script>
<%--    <script type="text/javascript" src="/daoshizhi_ssmTest2_war_exploded/js/login.js"></script>--%>
    <!-- 开发环境版本，包含了有帮助的命令行警告 -->

    <script src="https://unpkg.com/axios/dist/axios.min.js"></script>

</head>
<body>
<div id="login_frame">

    <!--
     <p id="image_logo"><img src="img/login/img1.jpg"></p>
  -->
<%--    <form  method="post" action="account/saveAccount">--%>
        <p id="title">元器件管理系统</p>
        <p><label class="label_input">学号</label><input type="text" v-model="username" id="username" name="username" class="text_field"/></p>
        <p><label class="label_input">密码</label><input type="text" v-model="password" id="password" name="password" class="text_field"/></p>
        <div id="login_control">
            <input type="button" id="btn_login" value="登录" @click="login"/>
            <a id="register" href="/daoshizhi_ssmTest2_war_exploded/html/register.html">注册</a>
            <a id="forget_pwd" href="/daoshizhi_ssmTest2_war_exploded/html/forget_pwd.html">忘记密码？</a>
        </div>
<%--    </form>--%>
</div>
<script type="text/javascript"  src="/daoshizhi_ssmTest2_war_exploded/js/login.js"></script>
</body>
</html>
