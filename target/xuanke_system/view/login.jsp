<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>学生选修课程系统</title>
    <!-- Bootstrap core CSS -->
    <link href="./css/bootstrap.min.css" rel="stylesheet">
    <!-- Custom styles for this template -->
    <link href="./css/signin.css" rel="stylesheet">
</head>

<body class="text-center">

<form class="form-signin" action="login" method="post">
<%--    <h1 class="h3 mb-3 font-weight-normal">学生选修课程系统</h1>--%>
    <img class="mb-4" src="./img/bootstrap-solid.svg" alt="" width="72" height="72">
    <h1 class="h3 mb-3 font-weight-normal">请登录</h1>
    <span style="color: red">${msg}</span>
    <label class="sr-only">用户名</label>
    <input type="text" class="form-control" name="username" placeholder="请输入用户名" required="" autofocus="">
    <label class="sr-only">密码</label>
    <input type="password" class="form-control" name="password" placeholder="请输入密码" required="">

    <button class="btn btn-lg btn-primary btn-block" type="submit">登录</button>
    <p class="mt-5 mb-3 text-muted">© 2020-2021</p>
</form>

</body>

</html>
