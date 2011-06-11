<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>login and signup</title>
<script type="text/javascript" src="http://ajax.googleapis.com/
ajax/libs/jquery/1.5/jquery.min.js"></script>
<script type="application/javascript">
$(document).ready(function()
{

$(".tab").click(function()
{
var X=$(this).attr('id');
 
if(X=='signup')
{
$("#login").removeClass('select');
$("#signup").addClass('select');
$("#loginbox").slideUp();
$("#signupbox").slideDown();
}
else
{
$("#signup").removeClass('select');
$("#login").addClass('select');
$("#signupbox").slideUp();
$("#loginbox").slideDown();
}
 
});

});
</script>
<style>
body
{
	font-family:"Lucida Sans Unicode", "Lucida Grande", sans-serif;
	font-size:12px;
	background-image:url(images/cozy-library-maroon-stripes.jpg);
}
#container
{
	position:relative;
	left: 805px;
	top: 80px;
	width:350px


}
#tabbox
{
	position:relative;
	right:5px;
	height:40px

}
#panel
{
	background-image:url(images/plain-brown.jpg);
	height:auto;
	border-radius:8px;
}
.tab
{
background: #FFF	;
display: block;
height: 40px;
line-height: 40px;
text-align: center;
width: 80px;
float: right;
font-weight: bold;
-webkit-border-top-left-radius: 5px;
-webkit-border-top-right-radius: 5px;
-moz-border-radius: 4px 4px 0px 0px;
}
a
{
color: #000;

margin: 0;
padding: 0;
text-decoration:none;
}
.signup
{
	margin-left:5px;

}
.select
{
	background-color: #ADA96E;
}
#loginbox
{
	height:300px;
	padding:10px;


}
#signupbox
{
	height:auto;
	padding:10px;
	display:none;

}
#textbox
{
    width:150px;
    height:30px;
    border-radius:7px;
}


</style>
</head>

<body>

<div style="margin:40px">
<div id="container">
<div id="tabbox">
<a href="#" id="signup" class="tab signup">Signup</a>
<a href="#" id="login" class="tab select">Login</a>
</div>
<div id="panel">
<div id="loginbox">
<h1>Login Form</h1>
<div id ="loginbox"> <html:form action= "/login">
        <table border="0" cellspacing="10px" cellpadding="2px" >
                <tbody>
                    <tr>
                        <td colspan="2">
                         <bean:write name="LoginForm" property="error" filter="false"/>
                    &nbsp;</td>		
                    </tr>
                    <tr>
                        <td>Enter Your Name</td>
                        <td><html:text  styleId="textbox" property = "name"/>
                        <html:messages id = "error" property="name" ><bean:write name = "error" />
                        </html:messages><html:messages id = "error" property="name1" ><bean:write name = "error" />
                        </html:messages></td>
                          
                       
                     </tr>
                    <tr>
                        <td>Enter your password</td>
                        <td><html:password styleId="textbox" property="email" maxlength = "40"/>
                             </td> 
                    </tr>
                    

                    <tr>
                        
                        <td><html:submit value="Login"/></td>
                        <td><html:messages id = "error" property="email">
                             <bean:write name = "error"/>
                            </html:messages> </td>
                    </tr>
                </tbody>
            </table>

                                       

        </html:form>
</div>
</div>
<div id="signupbox">
<h1>Sign Up Form</h1>
<div> <html:form action="/Registration">
            <table border="0">
                <tbody>
                    <tr>
                        <td>LoginID </td>
                        <td><html:text styleId="textbox" property = "loginID"/> 
                            <html:messages id = "error" property="loginID" ><bean:write name = "error" />
                            </html:messages><html:messages id = "error" property="loginIDPresent" ><bean:write name = "error" />
                            </html:messages></td> 
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td><html:password styleId="textbox" property="password"/>
                            <html:messages id = "error" property="password" ><bean:write name = "error" />
                            </html:messages></td>

                    </tr>
                    <tr>
                        <td> FirstName</td>
                        <td><html:text styleId="textbox" property="firstname" />
                            <html:messages id = "error" property="firstname" ><bean:write name = "error" />
                            </html:messages></td>
                    </tr>
                    <tr>
                        <td>LastName</td>
                        <td><html:text styleId="textbox" property="lastname"/>
                            <html:messages id = "error" property="lastname" ><bean:write name = "error" />
                            </html:messages></td>
                    </tr>

                    <tr>
                        <td>EmailID</td>
                        <td><html:text styleId="textbox" property="emailID" />
                            <html:messages id = "error" property="emailid" ><bean:write name = "error" />
                            </html:messages></td>
                    </tr>
                    <tr>
                        <td>DOB</td>
                        <td><html:text styleId="textbox" property="dob"/><html:link href="javascript:showCal('Calendar4')">Select Date</html:link>
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
</div>


</div>
</div>
</body>
</html>