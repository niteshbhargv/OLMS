<%-- 
    Document   : respnse
    Created on : May 24, 2011, 1:15:32 AM
    Author     : TheSpecialisT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <% String name  = request.getParameter("name") ;%>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>This is my second page!! <%=name%></h1>
    </body>
</html>
