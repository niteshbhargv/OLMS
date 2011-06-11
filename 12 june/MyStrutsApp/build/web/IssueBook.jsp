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
        <script language="javascript" src="cal2.js">

        </script>
        <script language="javascript" src="cal_conf2.js"></script>
        <link rel="stylesheet" type="text/css" href="stylesheet.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <title>IssueBook</title>
    </head>
    <body>
        <html:form action= "/IssueBook">
            <table border="1">
                <tbody>
                    <tr>
                        <td colspan="2">
                            
                            Issue Book</td>
                    </tr>
                    <tr>
                        <td>ISBN Number</td>
                        <td><html:text property="ISBNNumber" />
                            <html:messages id = "error" property="ISBNNumber" ><bean:write name = "error" />
                        </html:messages>
                        <html:messages id = "error" property="ISBNPresent" ><bean:write name = "error" />
                        </html:messages><html:messages id = "error" property="ISBN" ><bean:write name = "error" />
                        </html:messages></td>
                    </tr>
                    <tr>
                        <td>LoginID</td>
                        <td><html:text property="loginID" />
                            <html:messages id = "error" property="loginID" ><bean:write name = "error" />
                        </html:messages><html:messages id = "error" property="loginIDPresent" ><bean:write name = "error" />
                        </html:messages></td>
                    </tr>
                    <tr>
                        <td>AdminID</td>
                        <td><html:text property="adminID" />
                            <html:messages id = "error" property="adminID" ><bean:write name = "error" />
                        </html:messages></td>
                    </tr>


                    <tr>
                        <td>IssueDate</td>                      
                        <td><html:text property="issuedate" /><html:link href="javascript:showCal('Calendar1')">Select Date</html:link></td>
                    </tr>
                    <tr>
                        <td>DueDate</td>                      
                        <td><html:text property="duedate" /><html:link href="javascript:showCal('Calendar2')">Select Date</html:link>
                        <html:messages id = "error" property="duedate" ><bean:write name = "error" />
                        </html:messages></td>
                    </tr>
                    

                    <tr>
                        <td></td>
                        <td><html:submit value="save"/><html:button property = "arbitrary" value = "clear" onclick="clearForm()" /></td>
                    </tr>
                    
                    <bean:write name="IssueBookForm" property="message" filter="false"/>
                     
                </tbody>
            </table>



        </html:form>
    </body>
</html>
