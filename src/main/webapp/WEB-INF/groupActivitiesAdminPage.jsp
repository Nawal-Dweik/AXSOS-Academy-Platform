<%--
  Created by IntelliJ IDEA.
  User: nd2
  Date: 23/01/2021
  Time: 12:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Group Activities Page</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          rel="stylesheet"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
          crossorigin="anonymous">
</head>
<body>
<h2>${selectedCategory.name}</h2>
<table class="n table table-striped">
    <thead>
    <tr>
        <th scope="col">Title</th>
        <th scope="col"></th>
        <th scope="col"></th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${categoryGroupActivities}" var="ga">
        <tr>
            <td>${ga.title}</td>
            <td>View</td>
            <td>Delete</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
