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
        <title>Registration</title>
    </head>
    <body>
    <h2>Registration Form</h2>
        <html:form action="/Registration">
            <table width="194" border="0"  >
                <tbody>
                    <tr>
                        <td>LoginID </td>
                        <td><html:text styleClass="textbox" property = "loginID"/> 
                            <html:messages id = "error" property="loginID" ><bean:write name = "error" />
                            </html:messages><html:messages id = "error" property="loginIDPresent" ><bean:write name = "error" />
                            </html:messages></td> 
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td><html:password styleClass="textbox" property="password"/>
                            <html:messages id = "error" property="password" ><bean:write name = "error" />
                            </html:messages></td>

                    </tr>
                    <tr>
                        <td> FirstName</td>
                        <td><html:text styleClass="textbox" property="firstname" />
                            <html:messages id = "error" property="firstname" ><bean:write name = "error" />
                            </html:messages></td>
                    </tr>
                    <tr>
                        <td>LastName</td>
                        <td><html:text styleClass="textbox" property="lastname"/>
                            <html:messages id = "error" property="lastname" ><bean:write name = "error" />
                            </html:messages></td>
                    </tr>

                    <tr>
                        <td>EmailID</td>
                        <td><html:text styleClass="textbox" property="emailID" />
                            <html:messages id = "error" property="emailid" ><bean:write name = "error" />
                            </html:messages></td>
                    </tr>
                    <tr>
                        <td>DOB</td>
                        <td><html:text styleClass="textbox" property="dob"/><html:link href="javascript:showCal('Calendar4')">Select Date</html:link>
                            <html:messages id = "error" property="dob" ><bean:write name = "error" />
                            </html:messages></td>
                    </tr>


                    <tr>
                        <td></td>
                        <td><html:submit value="Register"/><html:button property = "arbitrary" value = "clear" onclick="clearform()" /></td>
                    </tr>
                    <tr>
                        <td colspan="2">
                            <bean:write name="RegistrationForm" property="message" filter = "false"/>
                        </td>
                    </tr>
                </tbody>
            </table>



        </html:form>
    </body>
</html>
