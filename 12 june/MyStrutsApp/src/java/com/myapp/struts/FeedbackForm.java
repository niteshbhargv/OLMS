/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.struts;

import javax.servlet.http.HttpServletRequest;
import java.sql.*;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author TheSpecialisT
 */
public class FeedbackForm extends org.apache.struts.action.ActionForm {
    
    private String emailid;
    private String feedback;
    private String Error;
    private String SetFeedback;

    public String getSetFeedback() {
        return SetFeedback;
    }

    public void setSetFeedback(String SetFeedback) throws SQLException, ClassNotFoundException {
        
        this.SetFeedback = SetFeedback;
        
    }

    public String getError() {
        return Error;
    }

    public void setError() {
        this.Error = "Error";
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
    
    public FeedbackForm() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * This is the action called from the Struts framework.
     * @param mapping The ActionMapping used to select this instance.
     * @param request The HTTP Request we are processing.
     * @return
     */
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (getEmailid() == null || getEmailid().length() < 1) {
            errors.add("name", new ActionMessage("error.name.required"));
            // TODO: add 'error.name.required' key to your resources
        }
        return errors;
    }
}
