<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <link href="./css/dashboard.css" rel="stylesheet">

</head>

<body>
<nav class="navbar navbar-dark sticky-top bg-dark flex-md-nowrap p-0">
    <a class="navbar-brand col-sm-3 col-md-2 mr-0" href="#">学生选修课程系统</a>

    <ul class="navbar-nav px-3">
        <li class="nav-item text-nowrap">
            <a class="nav-link" href="${pageContext.request.contextPath}/">注销</a>
        </li>
    </ul>
</nav>

<div class="container-fluid">
    <div class="row">

        <jsp:include page="common.jsp"></jsp:include>

        <main role="main" class="col-md-9 ml-sm-auto col-lg-10 pt-3 px-4">

            <!--    添加学生的表单-->
            <form class="form-horizontal" action="${pageContext.request.contextPath }/addStudent" method="post">
                <div class="form-group">
                    <label class="col-sm-2 control-label">学号</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" placeholder="请输入学号" name="sno" required>
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-sm-2 control-label">姓名</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" placeholder="请输入姓名" name="sname" required>
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-sm-2 control-label">性别</label>
                    <div class="col-sm-offset-2 col-sm-10">
                        <label>
                            <input type="radio" name="sex" checked value="男">&nbsp;男
                        </label>
                        &nbsp;&nbsp;&nbsp;
                        <label>
                            <input type="radio" name="sex" value="女">&nbsp;女
                        </label>
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-sm-2 control-label">年龄</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" placeholder="请输入年龄" name="age" required>
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-sm-2 control-label">系别</label>
                    <div class="col-sm-10">
                        <select class="form-control" name="sdept">
                            <option value="电子信息系">电子信息系</option>
                            <option value="计算机系">计算机系</option>
                            <option value="经管系">经管系</option>
                            <option value="历史系">历史系</option>
                            <option value="中文系">中文系</option>
                            <option value="表演系">表演系</option>
                            <option value="体育系">体育系</option>
                        </select>
                    </div>
                </div>


                <div class="form-group">
                    <label class="col-sm-2 control-label">班级</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" placeholder="请输入班级" name="clas" required>
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-sm-2 control-label">联系方式</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" placeholder="请输入联系方式" name="phone" required>
                    </div>
                </div>

                <div class="form-group">
                    <div class="col-sm-offset-2 col-sm-10">
                        <button class="btn btn-lg btn-success " type="submit">添加</button>
                    </div>
                </div>


            </form>

        </main>
    </div>
</div>

<!-- Bootstrap core JavaScript-->

<script type="text/javascript" src="./js/jquery-3.2.1.slim.min.js"></script>
<script type="text/javascript" src="./js/popper.min.js"></script>
<script type="text/javascript" src="./js/bootstrap.min.js"></script>

</body>

</html>
