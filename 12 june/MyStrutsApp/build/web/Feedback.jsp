
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<%-- 
    Document   : Feedback
    Created on : Jun 6, 2011, 2:19:27 PM
    Author     : TheSpecialisT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Feedback</title>
    </head>
 <html:form action ="/feedback">
            <table border="0">
                <tbody>
                   
                    <tr>
                        <td>EmailID</td>
                        <td><html:text property = "emailid" />
                        </td>
                          
                       
                     </tr>
                    <tr>
                        <td>Feedback</td>
                        <td><html:textarea property="feedback" cols="50" rows="10"  />
                              </td> 
                    </tr>
                   

                    <tr>
                        <td></td>
                        <td><html:submit value="submit"/></td>
                    </tr>
                </tbody>
            </table>

                                       

        </html:form>
    </body>
</html>