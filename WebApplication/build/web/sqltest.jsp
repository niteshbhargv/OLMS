<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="java.sql.*" %>

<html>
<head>
<title>MySQL Database creation</title>
</head>
<body>

<h2>Creation of a books database</h2>

<%Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/boos","root","bhanu");
        Statement statatment = con.createStatement() ;
        ResultSet result = statatment.executeQuery("select * from user");
        while(result.next()){
        out.println(result.getString(1)+ "" + result.getString(2));
        }
%> 
</body>
</html>