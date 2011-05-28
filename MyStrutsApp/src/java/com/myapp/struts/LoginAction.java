/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.struts;
import java.sql.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author TheSpecialisT
 */
public class LoginAction extends org.apache.struts.action.Action {

    private final static String SUCCESS = "success";
    private final static String FAILURE = "failure";

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        // extract user data
        LoginForm formBean = (LoginForm)form;
        String name = formBean.getName();
        String email = formBean.getEmail();
           String rt = null;
Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/boos","root","bhanu");
        Statement statatment = con.createStatement() ;
     // String insert = "select * from userinfo";
        String insert  =  "select email from user where name =('" + name + "')";       
        ResultSet result = statatment.executeQuery(insert);
       // System.out.println(name);
       while(result.next()){
        //System.out.println(email);
        
         rt = (result.getString(1)).toString();
         
        
        }
        
        
        // perform validation
        /*if (((name == null) ||             // name parameter does not exist
            email == null  ||             // email parameter doems not exist
            name.equals("") ||            // name parameter is empty
               
            email.indexOf("") == -1)) {   // email lacks '@'*/
        if(!(rt.equals(email)))
        {
                
            formBean.setError();
            //return mapping.findForward(SUCCESS);
            return mapping.findForward(FAILURE);
        }
        
            else
            return mapping.findForward(SUCCESS);

    }
}