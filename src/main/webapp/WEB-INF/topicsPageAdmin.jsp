<%--
  Created by IntelliJ IDEA.
  User: nd2
  Date: 21/01/2021
  Time: 14:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Topics of Algorithms</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">

</head>
<style>
    .logo{
        margin-left: 20px;
    }

</style>
<body>
<div>
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
</div>

<br/>
<form:form action="/algorithms/new" method="post" modelAttribute="algorithm">
<div>
    <form:label path="topic">Topic</form:label>
    <form:select  path="topic">
        <c:forEach items="${allTopics}" var="tpc">
            <option value="${tpc.id}"><c:out value="${tpc.title}"/></option>
        </c:forEach>
    </form:select>

    <a href="/addTopic">Add a Topic</a>

</div>
Upload Files


    <form:label path="title">Algorithm title</form:label>
    <form:input path="title" type="text"/>

<form:label path="question">Algorithm</form:label>
<form:input path="question" type="text"/>

<form:label path="answer">Answer</form:label>
<form:input path="answer" type="text"/>
    <form:button>Add Algorithm</form:button>
</form:form>

    <table class="n table table-striped">
        <thead>
        <tr>
            <th scope="col">Title</th>
            <th scope="col"></th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${allTopics}" var="t">
        <tr>
            <td><a href="/algorithms/${t.id}">${t.title}</a></td>
            <td>Delete</td>
        </tr>
        </c:forEach>
        </tbody>
    </table>

</body>
</html>
