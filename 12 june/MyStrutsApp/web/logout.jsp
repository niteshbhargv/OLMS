<%-- 
    Document   : logout
    Created on : Jun 7, 2011, 12:16:08 PM
    Author     : TheSpecialisT
--%>

<%@page import="java.util.*" %>

<%session.invalidate();%>
You have logged out. Please
<a href="login.jsp"><b>Login</b></a>


