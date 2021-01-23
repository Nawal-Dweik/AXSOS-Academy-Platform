<%--
  Created by IntelliJ IDEA.
  User: nd2
  Date: 22/01/2021
  Time: 16:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Add Category</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
    <link rel="stylesheet" href="css/style.css">
</head>

<style>

    .logo{
        margin-left: 20px;
    }

</style>

<body>

        <nav class="navbar navbar-expand-lg navbar-light bg-light">
        </nav>

        <a class="navbar-brand" href="/home"><img class="logo" src="/img/logo.png" width="200px"></a>

            <form:form action="/addCategory" method="post" modelAttribute="category">

                <form:label path="name"><h2>Name of category</h2></form:label>
                <%--<form:errors path="title"/>--%>
                <form:input path="name" type="text"/>
                    <br>
                <form:button>Add</form:button>
            </form:form>
</body>
</html>

