<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Group Activity</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">

</head>
<style>
    .logo{
        margin-left: 20px;
    }
    .logout{
        margin: 0px 70px;
        color: gray;
        text-decoration: none;
    }

    p{
        margin-top: 0 !important;
        margin-bottom: 0rem !important;
        margin-inline: auto !important;
    }

    .text-center p-3{
        background-color: #f8f9fa!important;
    }
    a{
        text-decoration: none;
    }

</style>
<body>
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <a class="navbar-brand" href="/home"><img class="logo" src="/img/logo.png" width="200px"></a>

            <p class="mini_nav">
                <a class="logout" href="/algorithmsProcess">Morning Algorithm</a>

                <a class="logout" href="/groupActivitiesProcess">Group Activity</a>

                <a class="logout" href="/index.html">Lobby</a>


                <a class="logout" href="/logout">Logout</a>
                <img src="/img/alg7.png" width="45px">
            </p>
        </nav>
        <br><br>

<center>
        <h2>${selectedGroupActivity.title}</h2>

        <label>Group Activity Description:</label><br>
        <output>${selectedGroupActivity.description}</output>
</center>
        <br><br><br><br><br><br><br><br><br><br>

        <footer class="bg-light text-center text-lg-start">
            <!-- Copyright -->
            <div class="text-center p-3">
                © 2021 Copyright:
                <a class="text-dark" href="https://academy.axsos.ps/">Axsos Acadmy</a>
            </div>
            <!-- Copyright -->
        </footer>
</body>
</html>
