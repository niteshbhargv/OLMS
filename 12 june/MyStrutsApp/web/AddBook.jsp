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
        <script language="javascript" src="clearform.js">

        </script>
        <link rel="stylesheet" type="text/css" href="stylesheet.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>AddBook</title>
    </head>
    <body>
        <html:form action="/AddBook">
            <table border="1">
                <tbody>
                       <tr>
                        <td colspan="2">
                         <bean:write name="AddBookForm" property="error" filter="false"/>
                    &nbsp;</td>		
                    </tr>
                     <tr>
                         <td>ISBN </td>
                         <td><html:text property = "ISBNNumber"/> 
                         <html:messages id = "error" property="ISBNNumber" ><bean:write name = "error" />
                                </html:messages></td> 
                     </tr>
                    <tr>
                        <td> Title</td>
                        <td><html:text property="title" />
                        <html:messages id = "error" property="title" ><bean:write name = "error" />
                                </html:messages></td>
                    </tr>
                    <tr>
                        <td> Author</td>
                        <td><html:text property="author"/>
                        <html:messages id = "error" property="author" ><bean:write name = "error" />
                                </html:messages></td>
                    </tr>
                    <tr>
                        <td>Publication</td>
                        <td><html:text property="publication"/>
                            <html:messages id = "error" property="Publication" ><bean:write name = "error" />
                                </html:messages></td>
                        
                    </tr>
                    <tr>
                        <td>Edition</td>
                        <td><html:text property="edition" />
                        <html:messages id = "error" property="Edition" ><bean:write name = "error" />
                                </html:messages></td>
                    </tr>
                    <tr>
                        <td>Category</td>
                        <td><html:text property="category"/>
                        <html:messages id = "error" property="Category" ><bean:write name = "error" />
                                </html:messages></td>
                    </tr>
                   
                    <tr>
                        <td>Price</td>
                        <td><html:text property="price"/>
                        <html:messages id = "error" property="Price" ><bean:write name = "error" />
                                </html:messages></td>
                    </tr>
                    
                    <tr>
                        <td></td>
                        <td><html:submit value="save"/><html:button property = "name" value = "clear" onclick="clearForm()" onfocus="clearForm()"/></td>
                    </tr>
                     <tr>
                        <td colspan="2">
                            <bean:write name="AddBookForm" property="message" filter = "false"/>
                         </td>
                    </tr>
                </tbody>
            </table>

            

        </html:form>
    </body>
</html>
