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
public class FeedbackAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "FeedbackSuccess";
    private static final String FAILURE = "FeedbackFailure";
    
    
    
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
       FeedbackForm formbean = (FeedbackForm)form;
       String EmailID = formbean.getEmailid();
       String Feedback = formbean.getFeedback();
       if((EmailID == null)|| (EmailID.indexOf("@")== -1)||( Feedback == null))
        {
            formbean.setError();
            return mapping.findForward(FAILURE);
          }
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/olms", "root", "bhanu");
        Statement statatment = con.createStatement();
        System.out.println("dfref");
        String InsertFeedback = "insert into feedback(EmailID,Feedback,Mydate) values ('"+EmailID+"','"+Feedback+"',now())";
         statatment.executeUpdate(InsertFeedback);
        formbean.setFeedback(Feedback);
        return mapping.findForward(SUCCESS);
    }
}
