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
                            <td><a href="/groupActivities/${c.id}">${c.name}</a></td>
                            <td>Delete</td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
</body>
</html>
