/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.struts;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import java.util.Calendar;
import java.text.*; 
import java.util.Date;

/**
 *
 * @author ranveer
 */
public class IssueBookForm extends org.apache.struts.action.ActionForm {
     private String adminID;
    private String issuedate;
    private String duedate;
    private String error;
    private String admin;
    private String message;
    private String ISBNNumber;
    private String loginID;
    public String date1;
    public String date2;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = "succesfully updated";
    }
    

    public String getloginID() {
        return loginID;
    }

    public void setloginID(String loginID) {
        this.loginID = loginID;
    }
   
    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = "<span style='color:red'>Please provide valid entries for fields</span>";
    }

    public String getadminID() {
        return adminID;
    }

    public void setadminID(String adminID) {
        this.adminID = adminID;
    }

    public String getduedate() {
        return duedate;
    }

    public void setduedate(String duedate) {
        this.duedate = duedate;
    }

    public String getISBNNumber() {
        return ISBNNumber;
    }

    public void setISBNNumber(String ISBNNumber) {
        this.ISBNNumber = ISBNNumber;
    }

    public String getissuedate() {
        return issuedate;
    }

    public void setissuedate(String issuedate) {
        this.issuedate = issuedate;
    }

   
   
   
    public IssueBookForm() {
        super();
        // TODO Auto-generated constructor stub
    }
    public boolean isInteger(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean isAlpha(String input)
    {
        if(input.matches("^[a-zA-Z]+$"))
            return false;
        else 
            return true;
    }
     public boolean isAlph(String input)
    {
        if(input.matches("^[0-9]+$"))
            return false;
        else 
            return true;
    }
     public boolean diffDate() throws ParseException
     {
         date1 = getissuedate();
         date2 = getduedate();
             Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
       	SimpleDateFormat formatter1 = new SimpleDateFormat("yyyy/MM/dd"); //please notice the capital M
	Date date_old = formatter1.parse(date1);
	Date date_new = formatter1.parse(date2);
	long milis1 = date_old.getTime();
	long milis2 = date_new.getTime();

	long diff = milis2 - milis1;
        
         long diffDays = diff / (24 * 60 * 60 * 1000);
        if(  diffDays!=3 )
        {
            return true;
        }
        else 
        {
        
            return false;
        }
        
     }
    

    /**
     * This is the action called from the Struts framework.
     * @param mapping The ActionMapping used to select this instance.
     * @param request The HTTP Request we are processing.
     * @return
     */
    @Override
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        
        if(isAlpha(getloginID()) || loginID.length()<=3)
        {
             errors.add("loginID", new ActionMessage("error.loginID.required"));
        }
        
        if(isAlpha(getadminID()) || adminID.length()<=3)
        {
             errors.add("adminID", new ActionMessage("error.adminID.required"));
        }
         if (!(isInteger(getISBNNumber())) || isAlph(getISBNNumber())) {
            errors.add("ISBNNumber", new ActionMessage("error.ISBNNumber.required"));
        }
        try {
            if(diffDate())
            {
                errors.add("duedate", new ActionMessage("error.duedate.required"));
            }
        } catch (ParseException ex) {
            Logger.getLogger(IssueBookForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return errors;
    }

    void setError() {
       
         this.error =  "<span style='color:red'>Invalid Field</span>";
    }
    void setMessage(){
        this.message = "<span style ='color:red'>successfully updated</span>";
    }
}
