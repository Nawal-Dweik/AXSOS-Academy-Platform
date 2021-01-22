<%--
  Created by IntelliJ IDEA.
  User: nd2
  Date: 21/01/2021
  Time: 14:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Topics of Algorithms</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          rel="stylesheet"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
          crossorigin="anonymous">
    <style>
        body {
            width: 100%;
            height: 100%;
            background-color: #f1ebeb;
            animation-name: example;
            animation-duration: 9s;
        }

        @keyframes example {
            0%   {background-color: #f1ebeb;}
            0%   {background-color: #bbb8b8;}
            25%  {background-color: #dcc6c6;}
            25%  {background-color: #f1ebeb;}
            50%  {background-color: #f6d9ff;}
            50%  {background-color: #bbb8b8;}
            50%  {background-color: #d8cddc;}
            100% {background-color: #ebdfef;}
            100% {background-color: #dcc6c6;}
            100% {background-color: #f6d9ff;}
            100% {background-color: #ebdfef;}

        }
        div{
            margin-left: 300px;
        }
        .n{
            width: 1000px;
            margin-left: 300px;
        }

    </style>
</head>
<body>
<div>
    <label path="groups">Generate Groups of </label>
    <input path="groups" type="text"/>
    <button>Go</button>
</div>
<br/>
<div>
    <label path="topic">Topic</label>
    <select  path="topic">
        <c:forEach items="${allTopics}" var="tpc">
            <option value="${tpc.id}"><c:out value="${tpc.title}"/></option>
        </c:forEach>
    </select>

    <a href="/addTopic">Add a Topic</a>

</div>


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
            <td>${t.title}</td>
            <td>Delete</td>
        </tr>
        </c:forEach>
        </tbody>
    </table>

</body>
</html>
