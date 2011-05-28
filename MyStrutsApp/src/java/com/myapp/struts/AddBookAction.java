/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.struts;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import java.sql.*;
/**
 *
 * @author ranveer
 */
public class AddBookAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "succ";
private static final String FAILURE = "fail";
    /**
     * This is the action called from the Struts framework.
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        AddBookForm formBean = (AddBookForm)form;
String title = formBean.gettitle();
String author = formBean.getauthor();
String ISBN = formBean.getISBNNumber();
String insert = null;
int val = 0;
Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/olms","root","bhanu");
        //PreparedStatement pstmt = null;
        
         /*String query = "insert into books(title,author,ISBN) values(?, ?, ?)";
          pstmt = con.prepareStatement(query);
           pstmt.setString(1, "title");
           pstmt.setString(2, "author");
            pstmt.setString(3, "ISBN");
            
             pstmt.executeUpdate();
          pstmt.close();*/
          
           Statement statatment = con.createStatement() ;
        
     // String insert = "select * from userinfo";
        //String insert  =  "select email from userinfo where name =('" + name + "')";       
      //  insert = "insert into books values('title','author',ISBN)";
        //ResultSet result = statatment.updateQuery(insert);
           val =   statatment.executeUpdate("update books1 set Title ='"+title+"',Author = '"+author+"' where ISBN ='"+ISBN+"'");
     //   val = statatment.executeUpdate("INSERT INTO books VALUES("+title+","+author+","+ISBN+")");
                // int val =   statatment.executeUpdate("insert into books values('title','author','ISBN')");
     System.out.println(author);
       con.close();
       
         if(title =="")
         {
             return mapping.findForward(FAILURE);
         }
         else
        return mapping.findForward(SUCCESS);
    }
}
