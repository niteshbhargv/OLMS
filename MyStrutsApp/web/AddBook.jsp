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
        <title>AddBook</title>
    </head>
    <body>
        <html:form action="AddBook">
            <table border="1">
                <tbody>
                     <tr>
                         <td>ISBN </td>
                         <td><html:text property = "ISBNNumber"/> </td> 
                     </tr>
                    <tr>
                        <td>Enter title</td>
                        <td><html:text property="title" /></td>
                    </tr>
                    <tr>
                        <td>Enter author</td>
                        <td><html:text property="author"/></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><html:submit value="save"/></td>
                    </tr>
                </tbody>
            </table>

            

        </html:form>
    </body>
</html>
