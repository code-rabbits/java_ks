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

            <!--    添加课程的表单-->
            <form class="form-horizontal" action="${pageContext.request.contextPath }/addCourse" method="post">
                <div class="form-group">
                    <label class="col-sm-2 control-label">课程代码</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" placeholder="请输入课程代码" name="cno" required>
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-sm-2 control-label">课程名称</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" placeholder="课程名称" name="cname" required>
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-sm-2 control-label">课程性质</label>
                    <div class="col-sm-offset-2 col-sm-10">
                        <label>
                            <input type="radio" name="nature" checked value="必修课">&nbsp;必修课
                        </label>
                        &nbsp;&nbsp;&nbsp;
                        <label>
                            <input type="radio" name="nature" value="选修课">&nbsp;选修课
                        </label>
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-sm-2 control-label">总学时</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" placeholder="请输入课程总学时" name="hours" required>
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-sm-2 control-label">学分</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" placeholder="请输入课程学分" name="credit" required>
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-sm-2 control-label">开课学期</label>
                    <div class="col-sm-10">
                        <select class="form-control" name="open">
                            <option value="大学一年级第一学期">大学一年级第一学期</option>
                            <option value="大学一年级第二学期">大学一年级第二学期</option>
                            <option value="大学二年级第一学期">大学二年级第一学期</option>
                            <option value="大学二年级第二学期">大学二年级第二学期</option>
                            <option value="大学三年级第一学期">大学三年级第一学期</option>
                            <option value="大学三年级第二学期">大学三年级第二学期</option>
                            <option value="大学四年级第一学期">大学四年级第一学期</option>
                            <option value="大学四年级第二学期">大学四年级第二学期</option>
                        </select>
                    </div>
                </div>




                <div class="form-group">
                    <label class="col-sm-2 control-label">选修人数</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" placeholder="请输入课程选修人数" name="number" required>
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
