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
public class DeleteBookAction extends org.apache.struts.action.Action {

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
        DeleteBookForm formBean = (DeleteBookForm) form;
        ArrayList<String> arraybooks = new ArrayList<String>();
        ArrayList<String> arrayissue = new ArrayList<String>();
        String ISBNNumber = formBean.getISBNNumber();
        int value =0;
        String val = null;
        String val1 = null;
        
        
         Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/olms", "root", "bhanu");
        Statement statement = con.createStatement();
        Statement statement1 = con.createStatement();

        val = "select ISBN from books";
        val1 = "select ISBN from issuedeposit";
        ResultSet result_issue = statement.executeQuery(val1);
         ResultSet result_delete = statement1.executeQuery(val);
         
          while (result_delete.next()) {
            String string = (result_delete.getString(1).toString());
            arraybooks.add(string);
        }
          
          while(result_issue.next())
          {
              String str = (result_issue.getString(1).toString());
              arrayissue.add(str);
          }

        if(arraybooks.contains(ISBNNumber) &  (!arrayissue.contains(ISBNNumber)) )
        {
            value = statement.executeUpdate("DELETE from books where ISBN= '"+ISBNNumber+"'");
        }
                
       if((!arraybooks.contains(ISBNNumber)))
        {
            errors.add("ISBNDelete", new ActionMessage("error.required.ISBNDelete"));
        }
       if(arrayissue.contains(ISBNNumber))
       {
           errors.add("ISBNIssue", new ActionMessage("error.required.ISBNIssue"));
       }        
           saveErrors(request, errors);
           
           con.close();
           
      if(!(errors.isEmpty()))
          
          return mapping.findForward(FAILURE);
      
      else{
        formBean.setMessage();
        
        return mapping.findForward(SUCCESS);
    }
}
}