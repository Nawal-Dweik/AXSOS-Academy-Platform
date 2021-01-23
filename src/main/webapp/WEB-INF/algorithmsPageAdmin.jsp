<%--
  Created by IntelliJ IDEA.
  User: nd2
  Date: 23/01/2021
  Time: 04:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Algorithms Page</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          rel="stylesheet"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
          crossorigin="anonymous">
</head>
<style>

    .table{
        width: 71% !important;
    }

    .logo{
        margin-left: 20px;
    }
    .logout{
        margin: 0px 70px;
        color: gray;
        text-decoration: none;
    }

    p{
        margin-top: 0 !important;
        margin-bottom: 0rem !important;
        margin-inline: auto !important;
    }

</style>
<body>

        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <a class="navbar-brand" href="/home"><img class="logo" src="/img/logo.png" width="200px"></a>

            <p class="mini_nav">
                <a class="logout" href="/algorithmsProcess">Morning Algorithm</a>

                <a class="logout" href="/groupActivitiesProcess">Group Activity</a>

                <a class="logout" href="/index.html">Lobby</a>


                <a class="logout" href="/logout">Logout</a>
                <img src="/img/alg7.png" width="45px">
            </p>
        </nav>
        <br>


<center>
    <h2>${selectedTopic.title}</h2>
<table class="n table table-striped">
    <thead>
    <tr class="bg-danger">
        <th scope="col">Title</th>
        <th scope="col">Algorithm Question</th>
        <th scope="col">Algorithm Answer</th>
        <th scope="col"></th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${topicAlgorithms}" var="alg">
        <tr class="bg-warning">
            <td>${alg.title}</td>
            <td>Download</td>
            <td>Download</td>
            <td><a href="/algorithms/${selectedTopic.id}/${alg.id}/delete">Delete</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</center>

        <footer class="bg-light text-center text-lg-start">
            <!-- Copyright -->
            <div class="text-center p-3">
                © 2021 Copyright:
                <a class="text-dark" href="https://academy.axsos.ps/">Axsos Acadmy</a>
            </div>
            <!-- Copyright -->
        </footer>
</body>
</html>
