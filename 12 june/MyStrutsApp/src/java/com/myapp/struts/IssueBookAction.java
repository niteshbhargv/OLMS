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
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMessage;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author ranveer
 */
public class IssueBookAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";
    private static final String FAILURE = "failure";

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
        ActionErrors errors = new ActionErrors();
        IssueBookForm formBean = (IssueBookForm) form;
        ArrayList<String> arraybooks = new ArrayList<String>();
        ArrayList<String> arrayissue = new ArrayList<String>();
        ArrayList<String> arrayloginID = new ArrayList<String>();
        String ISBNNumber = formBean.getISBNNumber();
        String loginID = formBean.getloginID();
        String adminID = formBean.getadminID();
        String duedate = formBean.getduedate();
        String issuedate = formBean.getissuedate();
        
        int value = 0;
        String val = null;
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/olms", "root", "bhanu");
        Statement statement1 = con.createStatement();        
        Statement statement = con.createStatement();
        Statement statement2 = con.createStatement();
        val = "select ISBN from issuedeposit";
        ResultSet result_issue = statement.executeQuery(val);
        String val1 = "select ISBN from books";
        ResultSet result_books = statement1.executeQuery(val1);
        String val2 = "select LoginID from studentaccount";
        ResultSet result_loginID = statement2.executeQuery(val2);
        //ResultSet result_books = statement.executeQuery(books_value);
        
        while (result_books.next()) {
            String string = (result_books.getString(1).toString());
            arraybooks.add(string);
        }
        
        while (result_loginID.next()) {
            String string1 = (result_loginID.getString(1).toString());
            arrayloginID.add(string1);
        }
        
        while (result_issue.next()) {
            String str = (result_issue.getString(1).toString());
            arrayissue.add(str);
        }
        
        
        if ((arraybooks.contains(ISBNNumber)) & (!(arrayissue.contains(ISBNNumber))) & (arrayloginID.contains(loginID)))
        {
            value = statement.executeUpdate("insert into issuedeposit values ('" + ISBNNumber + "','" + adminID + "','" + loginID + "','" + duedate + "','" + issuedate + "')");
        }
        
        if (!(arraybooks.contains(ISBNNumber))) {
            errors.add("ISBN", new ActionMessage("error.required.ISBN"));
            
        }
        if (arrayissue.contains(ISBNNumber)) {
            errors.add("ISBNPresent", new ActionMessage("error.ISBNPresent"));
        }
        if (!(arrayloginID.contains(loginID))) {
            errors.add("loginIDPresent", new ActionMessage("error.loginIDPresent"));
        }
        
        saveErrors(request, errors);




        //   ResultSet result = statement.executeQuery("select ISBN from issuedeposit");

        con.close();



        // if ( value ==0 || loginID.equals("") || adminID.equals("") || duedate.equals("") || issuedate.equals("") || ISBNNumber == 0) {

        
        if (!(errors.isEmpty())) {
            //   formBean.setError();

            return mapping.findForward(FAILURE);
        } else {
            formBean.setMessage();
            return mapping.findForward(SUCCESS);
        }
        
    }
}
