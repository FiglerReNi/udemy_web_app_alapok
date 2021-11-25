<%@ page import="java.util.Date" %>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Servlet Example</title>
</head>
<body>
<%
    System.out.println("Servlet Example");
    Date date = new Date();
%>
    <div>Current date is <%=date%> </div>
    My First JSP<br>
    <br>
    <form action="" method="post">
        <p style="color:red">${errorMessage}</p>
        <label for="name">Enter your name:</label>        <input type="text" id="name" name="name"/>
        <label for="password">Enter your password:</label>    <input type="password" id="password" name="password"/>
        <input type="submit" value="Login">
    </form>
</body>
</html>
