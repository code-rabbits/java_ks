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
                    <a class="btn btn-primary" href="${pageContext.request.contextPath}/voList">显示全部选修</a>
                </div>

            </div>


            <div class="table-responsive">
                <table class="table table-striped table-sm">
                    <thead>
                    <tr>
                        <th>学生姓名</th>
                        <th>课程名</th>
                        <th>成绩</th>

                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="vo" items="${voList}">
                        <tr >
                            <td>${vo.sname}</td>
                            <td>${vo.cname}</td>
                            <td>${vo.grade}</td>

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
