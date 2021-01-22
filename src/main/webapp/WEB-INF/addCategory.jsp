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
</head>
<body>
<form:form action="/addCategory" method="post" modelAttribute="category">

    <form:label path="name">Name of category</form:label>
    <%--<form:errors path="title"/>--%>
    <form:input path="name" type="text"/>

    <form:button>Add</form:button>
</form:form>
</body>
</html>

