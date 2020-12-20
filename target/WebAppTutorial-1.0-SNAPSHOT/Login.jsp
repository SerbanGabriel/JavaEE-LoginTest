<%--
  Created by IntelliJ IDEA.
  User: maria
  Date: 12/20/2020
  Time: 7:36 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
    <h1>Welcome, please login</h1>
    <form action="/WebAppTutorial_war_exploded/login" method="post">
        login Name: <input type="text" name="loginName" width="30"/>
        password: <input type="password" name="Password" width="10"/>
        <input type="submit" value="login">
    </form>
<h2>${errorMessage}</h2>
</body>
</html>
