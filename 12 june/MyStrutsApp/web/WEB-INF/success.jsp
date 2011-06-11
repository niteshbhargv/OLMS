<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %> 
<%-- 
    Document   : success
    Created on : May 25, 2011, 2:04:59 AM
    Author     : TheSpecialisT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <link rel="stylesheet" type="text/css" href="stylesheet.css">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="content-type" content="application/xhtml+xml; charset=UTF-8" />
<meta name="author" content="Erwin Aligam - styleshout.com" />
<meta name="description" content="Site Description Here" />
<meta name="keywords" content="keywords, here" />
<meta name="robots" content="index, follow, noarchive" />
<meta name="googlebot" content="noarchive" />

<link rel="stylesheet" type="text/css" media="screen" href="images/BrightSide.css" />
<link rel="stylesheet" href="flyout.css" type="text/css" />
<script type="text/javascript" src="flyout.js"></script>

</head>
<body>
    
    
    
    
   

   
  
        
    
      

    
   
    <div id="wrap">
	
  <div id="header">				
			
		<h1 id="logo">Online Library</h1>	
                <html:form styleClass="searchform" action="/SearchBooks"> 
   <html:text property="searchString" />
 <input type="submit" value="Submit" />               
 </html:form>	 
		
    
			
		<!-- Menu Tabs -->
<ul>
			<li id="current"><a href="index.html"><span>Home</span></a></li>
			<li><a href="index.html"><span>Profile</span></a></li>			
			<li><a href="logout.jsp"><span>Log Out</span></a></li>
						
    </ul>
  <img src="images/header.jpg" width="820" height="184" alt="headerphoto" class="header-photo" /></div>	

	<!-- content-wrap starts here -->
    
    
	<div id="content-wrap">
	  <div id="sidebar" >							
				
	    <h1>&nbsp;</h1>
	    <h1>&nbsp;</h1>
	    <h1>&nbsp;</h1>
	    <h1>Sidebar Menu</h1>
	    <ul class="sidemenu" >
        
  <dl class="dropdown">
  <a> <dt id="two-ddheader" class="upperdd" onmouseover="ddMenu('two',1)" onmouseout="ddMenu('two',-1)">Book Preferences</dt></a>
<dd id="two-ddcontent" onmouseover="cancelHide('two')" onmouseout="ddMenu('two',-1)">
          			<ul>
                    <li><a href="AddBook.jsp" class="underline">Add Book</a></li>
                    <li><a href="#" class="underline">Edit Book</a></li>
                    <li><a href="DeleteBook.jsp">Delete Book</a></li>
                    </ul>
                    </dd>
                 

                    
		<a>	<dt id="three-ddheader" class="upperdd" onmouseover="ddMenu('three',1)" onmouseout="ddMenu('three',-1)">Issue Book</dt></a>
    <dd id="three-ddcontent" onmouseover="cancelHide('three')" onmouseout="ddMenu('three',-1)">
                <ul>
                     <li><a href="IssueBook.jsp" class="underline">Issue Book</a></li>
                    <li><a href="Deposit.jsp">Deposit Book</a></li>
            </ul>
          </dd>
          </dl>
                    



				
				<li><a href="Feedback.jsp">Feedback </a></li>
				<li><a href="http://www.styleshout.com/">Purchase Request </a></li>
				<li><a href="" title="Web Templates"> User Details</a></li>
                <li><a href="" title="Web Templates"> Delete User</a></li>
</ul>		


				
			<h1>&nbsp;</h1>
<h1>Wise Words</h1>
			<p>&quot;Men are disturbed, not by the things that happen,
			but by their opinion of the things that happen.&quot;</p>		
				
			<p class="align-right">- Epictetus</p>					
		
	  </div>
			
		<div id="main">	
			 <h1>&nbsp;</h1>
                          <h1>&nbsp;</h1>
                           <h1>&nbsp;</h1>
                            <h1>&nbsp;</h1>
			<a name="TemplateInfo"></a>
		  <h1><p>You have successfully logged in.</p>

    <p>Your name is:<bean:write name="LoginForm" property="name" />.</p>

    <p>your email is:<bean:write name="LoginForm" property="email" />.</p>
    <p>Date:<bean:write name="LoginForm" property="date" />.</p></h1>
										
			<a name="SampleTags"></a>
	    <h1>&nbsp;</h1>
	 
<p>&nbsp;</p>
							
			<br />		
							
		</div>	
			
		<div id="rightbar">
			
			<h1>&nbsp;</h1>
			<h1>&nbsp;</h1>
			<h1>&nbsp;</h1>
			<h1>&nbsp;</h1>
			<h1>New Arrivals</h1>
			<p><img src="images/newarrivals1.gif" alt="" width="125" height="121" /></p>
			<p>List of books for new arrivals.</p>

			
	  </div>			
			
	<!-- content-wrap ends here -->		
  </div>

<!-- footer starts here -->	
<div id="footer">
	
	<div class="footer-left">
		<p class="align-left">			
		&copy; 2011 Impetus |
		<a href="http://www.bluewebtemplates.com/" title="Website Templates">website by Ranveer &amp; Nitesh</a></p>		
	</div>
	
	<div class="footer-right">
		<p class="align-right">
		<a href="index.html">Home</a> |
  		<a href="index.html">SiteMap</a> |
   	    <a href="index.html">RSS Feed</a> |
        <a href="http://validator.w3.org/check/referer">XHTML</a> |
		<a href="http://jigsaw.w3.org/css-validator/check/referer">Help</a>
		</p>
	</div>
	
</div>
<!-- footer ends here -->
	
<!-- wrap ends here -->
</div>
</body>
</html>
