<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Categories of Group Activity</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
</head>
<style>
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
    .table{
        width: 71% !important;
    }
    a{
        text-decoration: none;
    }

</style>
<body>

            <nav class="navbar navbar-expand-lg navbar-light bg-light">
                <a class="navbar-brand" href="/home"><img class="logo" src="/img/logo.png" width="200px"></a>

                <p class="mini_nav">
                    <a class="logout" href="/algorithms/showTopics">Morning Algorithm</a>

                    <a class="logout" href="/groupActivity/showCategories">Group Activity</a>

                    <a class="logout" href="/index.html">Lobby</a>


                    <a class="logout" href="/logout">Logout</a>
                </p>
            </nav>
            <br><br>
<center>
            <label path="groups">Generate Groups of </label>
            <input path="groups" type="text"/>
            <button class="btn btn-primary">Go</button>
            <br><br>
            <form:form action="/groupActivity/new" method="post" modelAttribute="groupActivity">

            <form:label path="title">Group Activity Name</form:label>
            <form:input path="title"/>

            <form:label path="description">Group Activity Description</form:label>
            <form:textarea path="description"></form:textarea>

            <form:label path="category">Category</form:label>
            <form:select  path="category">
                <c:forEach items="${allCategories}" var="ctg">
                    <option value="${ctg.id}"><c:out value="${ctg.name}"/></option>
                </c:forEach>
            </form:select>
             <button class="btn btn-primary">Add</button>
        </form:form>
            <button class="btn btn-primary"><a href="/addCategory" style="color: white">Add a Category</a></button>
            <br><br>
            <h2>Categories</h2>
                <table class="table table-bordered">
                    <thead>
                         <tr>
                             <th scope="col">Category</th>
                             <th scope="col"></th>
                         </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${allCategories}" var="c">
                        <tr>
                            <td><a href="/groupActivities/${c.id}">${c.name}</a></td>
                            <td>Delete</td>
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
