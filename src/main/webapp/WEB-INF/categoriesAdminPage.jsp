<%--
  Created by IntelliJ IDEA.
  User: nd2
  Date: 22/01/2021
  Time: 14:07
  To change this template use File | Settings | File Templates.
--%>
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

</style>
<body>
            <nav class="navbar navbar-expand-lg navbar-light bg-light">
                <a class="navbar-brand" href="#"><img class="logo" src="/img/logo.png" width="200px"></a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
            </nav>
        <br><br>
            <label path="groups">Generate Groups of </label>
            <input path="groups" type="text"/>
            <button>Go</button>
            <br/>
<form:form action="/groupActivity/new" method="post" modelAttribute="groupActivity">

    <form:label path="title">Group Activity Name</form:label>
    <form:input path="title"/>
    <br/>
    <form:label path="description">Group Activity Description</form:label>
    <form:textarea path="description"></form:textarea>

            <form:label path="category">Category</form:label>
            <form:select  path="category">
                <c:forEach items="${allCategories}" var="ctg">
                    <option value="${ctg.id}"><c:out value="${ctg.name}"/></option>
                </c:forEach>
            </form:select>
    <form:button>Add</form:button>
</form:form>
            <a href="/addCategory">Add a Category</a>

            <h2>Categories</h2>
                <table class="table">
                    <thead>
                         <tr>
                             <th scope="col">Category</th>
                             <th scope="col"></th>
                         </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${allCategories}" var="c">
                        <tr>
                            <td>${c.name}</td>
                            <td>Delete</td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>

</body>
</html>
