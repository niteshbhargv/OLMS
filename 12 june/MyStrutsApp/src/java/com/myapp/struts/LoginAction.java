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
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMessage;
import java.util.ArrayList;

public class LoginAction extends org.apache.struts.action.Action {

    private final static String SUCCESS = "success";
    private final static String FAILURE = "failure";

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response) throws Exception {

        ActionErrors errors = new ActionErrors();
        LoginForm formBean = (LoginForm) form;
        String name = formBean.getName();
        String email = formBean.getEmail();
        String date = formBean.getDate();
        ArrayList<String> array_usernames = new ArrayList<String>();
        String error;
        ResultSet email_result = null;
        ResultSet username_result = null;
        String username_string = null;
        String email_string = null;


        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/olms", "root", "bhanu");

        Statement statement = con.createStatement();
        Statement stat = con.createStatement();

        String query_username = "select LoginID from studentaccount";

        String query_email = "select emailID from studentaccount where LoginID =('" + name + "')";

        username_result = stat.executeQuery(query_username);

        while (username_result.next()) {
            username_string = ((username_result.getString(1)).toString());
            array_usernames.add(username_string);
        }


        if (array_usernames.contains(name)) {

            email_result = statement.executeQuery(query_email);

            while (email_result.next()) {
                email_string = email_result.getString(1);
            }
        } else {
            errors.add("name1", new ActionMessage("error.name1"));
        }

        saveErrors(request,errors);
        
        // perform validation
        /*if (((name == null) ||             // name parameter does not exist
        email == null  ||             // email parameter doems not exist
        name.equals("") ||            // name parameter is empty
        
        email.indexOf("") == -1)) {   // email lacks '@'*/

        if (!(errors.isEmpty()) || (!(email_string.equals(email)))) {

           formBean.setError();
            return mapping.findForward(FAILURE);
        } else {
            return mapping.findForward(SUCCESS);
        }

    }
}
