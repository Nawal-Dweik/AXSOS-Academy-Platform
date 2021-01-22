<%--
  Created by IntelliJ IDEA.
  User: nd2
  Date: 22/01/2021
  Time: 14:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Categories of Group Activity</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          rel="stylesheet"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
          crossorigin="anonymous">
</head>
<body>
<label path="groups">Generate Groups of </label>
<input path="groups" type="text"/>
<button>Go</button>
<br/>
<label path="category">Category</label>
<select  path="category">
    <c:forEach items="${allCategories}" var="ctg">
        <option value="${ctg.id}"><c:out value="${ctg.name}"/></option>
    </c:forEach>
</select>

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
