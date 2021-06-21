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

            <div class="row">
                <div class="col-md-4 column">
                    <a class="btn btn-primary" href="${pageContext.request.contextPath}/toAddCourse">添加课程</a>
                    <a class="btn btn-primary" href="${pageContext.request.contextPath}/courseList">显示全部课程信息</a>
                </div>

                <div class="col-md-4 column">
                    <form action="${pageContext.request.contextPath}/getByCno" method="post" class="form-inline">

                        <input type="text" name="cno" class="form-control"  placeholder="请输入要查询课程的课程代码">

                        <button type="submit" class="btn btn-primary">查询</button>
                        <span style="color: red;font-weight: bold">${msg}</span>
                    </form>

                </div>


                <div class="col-md-4 column">
                    <form action="${pageContext.request.contextPath}/getByCname" method="post" class="form-inline">

                        <input type="text" name="cname" class="form-control"  placeholder="请输入要查询课程的课程名称">

                        <button type="submit" class="btn btn-primary">查询</button>
                        <span style="color: red;font-weight: bold">${error}</span>
                    </form>

                </div>


            </div>


            <div class="table-responsive">
                <table class="table table-striped table-sm">
                    <thead>
                    <tr>
                        <th>课程代码</th>
                        <th>课程名称</th>
                        <th>课程性质</th>
                        <th>总学时</th>
                        <th>学分</th>
                        <th>开课学期</th>
                        <th>选修人数</th>

                        <th>操作</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="course" items="${courses}">
                        <tr >
                            <td>${course.cno}</td>
                            <td>${course.cname}</td>
                            <td>${course.nature}</td>
                            <td>${course.hours}</td>
                            <td>${course.credit}</td>
                            <td>${course.open}</td>
                            <td>${course.number}</td>

                            <td>
                                <a class="btn btn-sm btn-primary" href="${pageContext.request.contextPath}/toUpdateCourse?cno=${course.cno}">编辑</a>
                                <a class="btn btn-sm btn-primary" href="${pageContext.request.contextPath}/delCourse/${course.cno}">删除</a>
                            </td>
                        </tr>
                    </c:forEach>

                    </tbody>
                </table>
            </div>
        </main>

    </div>
</div>

<!-- Bootstrap core JavaScript-->
<script type="text/javascript" src="./js/jquery-3.2.1.slim.min.js" ></script>
<script type="text/javascript" src="./js/popper.min.js" ></script>
<script type="text/javascript" src="./js/bootstrap.min.js" ></script>

</body>

</html>
