<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>

<%-- 
    Document   : succ
    Created on : May 27, 2011, 10:39:15 PM
    Author     : ranveer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <p>Your name is:<bean:write name="AddBookForm" property="author" />.</p>
        <p>Your name is:<bean:write name="AddBookForm" property="ISBNNumber" />.</p>
        <p>Your name is:<bean:write name="AddBookForm" property="title" />.</p>
    </body>
</html>
