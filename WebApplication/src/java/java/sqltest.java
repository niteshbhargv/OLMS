/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package java;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author TheSpecialisT
 */

public class sqltest {

   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
     static final String database_URL  = "jdbc:mysql://localhost/boos";
     
    public sqltest()
    {}
             
                  
     public void getvalue () throws SQLException, ClassNotFoundException
     {
         Connection connection = null;
         Statement statement  = null;
       
            Class.forName(JDBC_DRIVER);
       
        try {
            connection =  DriverManager.getConnection(
           "jdbc:mysql://localhost:3306/boos","root","bhanu");
        } catch (SQLException ex) {
            Logger.getLogger(sqltest.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            statement = connection.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(sqltest.class.getName()).log(Level.SEVERE, null, ex);
        }
                 
                  ResultSet result = null;
        try {
            result = statement.executeQuery("select * from user");
        } catch (SQLException ex) {
            Logger.getLogger(sqltest.class.getName()).log(Level.SEVERE, null, ex);
        }
                  
                  ResultSetMetaData mt = null;
        try {
            mt = result.getMetaData();
        } catch (SQLException ex) {
            Logger.getLogger(sqltest.class.getName()).log(Level.SEVERE, null, ex);
        }
                  int num_columns = 0;
        try {
            num_columns = mt.getColumnCount();
        } catch (SQLException ex) {
            Logger.getLogger(sqltest.class.getName()).log(Level.SEVERE, null, ex);
        }
                  
                  for(int i=1;i<=num_columns;i++)
                  {
            try {
                System.out.println(mt.getColumnName(i));
            } catch (SQLException ex) {
                Logger.getLogger(sqltest.class.getName()).log(Level.SEVERE, null, ex);
            }
                      
                  }
        try {
            while(result.next())
            {
                for(int i=1;i<=num_columns;i++)
                {
                    System.out.println(result.getObject(i));
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(sqltest.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(sqltest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            statement.close();
        
        
                  
     }
}
    

