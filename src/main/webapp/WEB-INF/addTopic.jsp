<%--
  Created by IntelliJ IDEA.
  User: nd2
  Date: 21/01/2021
  Time: 21:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Add Topic</title>
</head>
<body>
<form:form action="/addTopic" method="post" modelAttribute="topic">

        <form:label path="title">Title of topic</form:label>
        <%--<form:errors path="title"/>--%>
    <form:input path="title" type="text"/>

    <form:button>Add</form:button>
</form:form>
</body>
</html>
