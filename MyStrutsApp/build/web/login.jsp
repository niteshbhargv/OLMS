<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%-- 
    Document   : login
    Created on : May 25, 2011, 1:49:50 AM
    Author     : TheSpecialisT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="stylesheet.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <html:form action= "/login">
            <table border="1">
                <tbody>
                     <tr>
                <td colspan="2">
                    <bean:write name="LoginForm" property="error" filter="false"/>
                    Title Page;</td>
            </tr>
                    <tr>
                        <td>Enter Your Name</td>
                        <td><html:text property="name" /></td>
                    </tr>
                    <tr>
                        <td>Enter your Password</td>
                        <td><html:password property="email" maxlength = "40"/></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><html:submit value="Login"/></td>
                    </tr>
                </tbody>
            </table>

            

        </html:form>
    </body>
</html>
