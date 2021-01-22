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
</head>
<body>
<label path="groups">Generate Groups of </label>
<input path="groups" type="text"/>
<button>Go</button>
<br/>
<label path="topic">Topic</label>
<select  path="topic">
    <c:forEach items="${allTopics}" var="tpc">
        <option value="${tpc.id}"><c:out value="${tpc.title}"/></option>
    </c:forEach>
   <%-- <option value="addTopic"><a href="/addTopic">Add a Topic</a></option>--%>
</select>

<a href="/addTopic">Add a Topic</a>

    <table class="table">
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
