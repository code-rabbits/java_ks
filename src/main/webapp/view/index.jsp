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
                    <a class="btn btn-primary" href="${pageContext.request.contextPath}/toAddStudent">添加学生</a>
                    <a class="btn btn-primary" href="${pageContext.request.contextPath}/studentList">显示全部学生</a>
                </div>

                <div class="col-md-4 column">
                    <form action="${pageContext.request.contextPath}/getBySno" method="post" class="form-inline">

                        <input type="text" name="sno" class="form-control"  placeholder="请输入要查询学生的学号">

                        <button type="submit" class="btn btn-primary">查询</button>
                        <span style="color: red;font-weight: bold">${msg}</span>
                    </form>

                </div>


                <div class="col-md-4 column">
                    <form action="${pageContext.request.contextPath}/getBySname" method="post" class="form-inline">

                        <input type="text" name="sname" class="form-control"  placeholder="请输入要查询学生的姓名">

                        <button type="submit" class="btn btn-primary">查询</button>
                        <span style="color: red;font-weight: bold">${error}</span>
                    </form>

                </div>


            </div>


            <div class="table-responsive">
                <table class="table table-striped table-sm">
                    <thead>
                    <tr>
                        <th>学号</th>
                        <th>姓名</th>
                        <th>性别</th>
                        <th>年龄</th>
                        <th>系别</th>
                        <th>班级</th>
                        <th>联系方式</th>

                        <th>操作</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="student" items="${students}">
                        <tr >
                            <td>${student.sno}</td>
                            <td>${student.sname}</td>
                            <td>${student.sex}</td>
                            <td>${student.age}</td>
                            <td>${student.sdept}</td>
                            <td>${student.clas}</td>
                            <td>${student.phone}</td>

                            <td>
                                <a class="btn btn-sm btn-primary" href="${pageContext.request.contextPath}/toUpdateStudent?sno=${student.sno}">编辑</a>
                                <a class="btn btn-sm btn-primary" href="${pageContext.request.contextPath}/delStu/${student.sno}">删除</a>
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
