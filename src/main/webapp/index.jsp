<%@ page import="java.util.Date" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Web App Tutorial</title>
</head>
<body>
<h1>Hello World</h1>
<p> this is my first web App</p>
<%
    Date date = new Date();
    out.println("<h2>" + date + "</h2>");
%>

</body>
</html>