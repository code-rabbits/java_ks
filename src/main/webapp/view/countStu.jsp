<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <title>Title</title>
    <!-- 引入 ECharts 文件 -->
    <script src="./js/echarts.min.js"></script>
    <script type="text/javascript" src="./js/jquery-3.4.1.min.js" ></script>

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

        <main role="main" class="col-md-6 ml-sm-auto col-lg-10 pt-3 px-4">

            <!-- 为ECharts准备一个具备大小（宽高）的Dom -->
            <div id="main" style="width: 600px;height:400px;"></div>

            <script type="text/javascript">

                $(function (){
                    $.ajax({
                        "url":"/countMale",
                        "type":"POST",
                        "success":function (data) {

                            // 基于准备好的dom，初始化echarts实例
                            var myChart = echarts.init(document.getElementById('main'));

                            // 指定图表的配置项和数据
                            var option = {
                                title: {
                                    text: '学生统计',
                                    left: 'center'
                                },
                                tooltip: {
                                    trigger: 'item'
                                },
                                legend: {
                                    orient: 'vertical',
                                    left: 'left',
                                },
                                series: [
                                    {
                                        name: '学生统计',
                                        type: 'pie',
                                        radius: '50%',
                                        data: data,
                                        emphasis: {
                                            itemStyle: {
                                                shadowBlur: 10,
                                                shadowOffsetX: 0,
                                                shadowColor: 'rgba(0, 0, 0, 0.5)'
                                            }
                                        }
                                    }
                                ]
                            };

                            // 使用刚指定的配置项和数据显示图表。
                            myChart.setOption(option);

                        }
                    })
                })


            </script>

        </main>


    </div>
</div>

</body>
</html>
