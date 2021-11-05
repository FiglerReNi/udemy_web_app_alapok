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
    System.out.println(request.getParameter("name"));
    Date date = new Date();
%>
    <div>Current date is <%=date%> </div>
    My First JSP</br>
    name = ${name}</br>
    type = ${type}</br>
    </br>
    <form action="/login.do.jsp" method="post">
        <p style="color:red">${errorMessage}</p>
        Enter your name:        <input type="text" name="name"/>
        Enter your password:    <input type="password" name="password"/>
        <input type="submit" value="Login">
    </form>
</body>
</html>
