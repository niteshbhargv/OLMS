<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<head>

<title>Online Library</title>

<meta http-equiv="content-type" content="application/xhtml+xml; charset=UTF-8" />
<meta name="author" content="Erwin Aligam - styleshout.com" />
<meta name="description" content="Site Description Here" />
<meta name="keywords" content="keywords, here" />
<meta name="robots" content="index, follow, noarchive" />
<meta name="googlebot" content="noarchive" />

<link rel="stylesheet" type="text/css" media="screen" href="images/BrightSide.css" />

</head>

<body>
<!-- wrap starts here -->

<div id="wrap">
	
  <div id="header">				
			
		<h1 id="logo">Online Library</h1>	
		 
		
    <form method="post" class="searchform" action="#">
			<p><input type="text" name="search_query" class="textbox" />
      <input type="submit" name="search" class="button" value="Search" /></p>
	  </form>
			
		<!-- Menu Tabs -->
<ul>
			<li id="current"><a href="index.html"><span>Home</span></a></li>
			<li><a href="index.html"><span>Profile</span></a></li>			
			<li><a href="index.html"><span>Log Out</span></a></li>
						
    </ul>
  <img src="images/header.jpg" width="820" height="184" alt="headerphoto" class="header-photo" /></div>	

	<!-- content-wrap starts here -->
	<div id="content-wrap">
	  <div id="sidebar" >							
				
	    <h1>&nbsp;</h1>
	    <h1>&nbsp;</h1>
	    <h1>&nbsp;</h1>
	    <h1>Sidebar Menu</h1>
	    <ul class="sidemenu">
		  <li><a href="index.html">Home</a></li>
				<li><a href="#TemplateInfo">Request book purchase</a></li>
				<li><a href="#SampleTags">Sample Tags</a></li>
				<li><a href="http://www.styleshout.com/">More Free Templates</a></li>
				<li><a href="" title="Web Templates">Web Templates</a></li>
</ul>		
				
			<h1>&nbsp;</h1>
<h1>Wise Words</h1>
			<p>
                     
                            &quot;Men are disturbed, not by the things that happen,
			but by their opinion of the things that happen.&quot;</p>		
				
			<p class="align-right">- Epictetus</p>					
		
	  </div>
			
		<div id="main">	
			
			<a name="TemplateInfo"></a>
		  <h1>&nbsp;</h1>
										
			<a name="SampleTags"></a>
	    <h1>&nbsp;</h1>
	    <h1>Profile<span class="green"></span></h1>
            
			<h3>Your Name : </h3>
                        <h3><bean:write name="SearchForm" property="databaseQuery" filter="false" format="" /></h3>
			<h3> LoginID : </h3>
          <h3> Email ID : </h3>
<h3>Example Form :</h3>
<h3> Current Project : </h3>
<h3> current Organisation : </h3>
<p>&nbsp;</p>
			<form action="#">		
				<p>				
				<label>OLD PASSWORD</label>
				<input name="dname" value="OLD PASSWORD" type="password" size="30" />
				<label>new password</label>
				<input name="demail" value="Your Email" type="password" size="30" />
			<label>new password again</label>
				<input name="demail" value="Your Email" type="password" size="30" />
            	<br>
				<input class="button" type="submit" />		
				</p>		
			</form>				
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
<h1>Book of the Day</h1>
			<p>Java how to program by deitel and deitel</p>
			
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
