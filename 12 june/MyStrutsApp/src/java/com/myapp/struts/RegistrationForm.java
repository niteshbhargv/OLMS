/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.struts;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import java.lang.String;

/**
 *
 * @author ranveer
 */
public class RegistrationForm extends org.apache.struts.action.ActionForm {
    
    private String loginID;
    private String password;
    private String firstname;
    private String lastname;
    private String emailID;
    private String dob;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    private String message;
    
    

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getloginID() {
        return loginID;
    }

    public void setloginID(String loginID) {
        this.loginID = loginID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
     public boolean isAlpha(String input)
    {
        if(input!= null)
        {    
        if(input.matches("^[a-zA-Z0-9]+$"))
            return false;
            else
            return true;
        }
        
        else
            return true;
        
        }
                
     
    
    
     public boolean isValid(String input)
     {
         if(input.matches("^[a-zA-Z0-9]+$"))
         {
             return true;
         }
          else 
         {
             return false;
         }
     }
     
     public boolean isvalidEmail(String input_email)
     {
         	if(input_email.indexOf("@") == -1)
                {
                    return true;
                }
                
                else 
                    return false;

     }

    /**
     * @return
     */
   
    public RegistrationForm() {
        super();
        // TODO Auto-generated constructor stub
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
        
         if(isAlpha(getloginID()) || loginID.length()<3)
        {
             errors.add("loginID", new ActionMessage("error.loginID.required"));
        }
         
         if(password.length()<5)
         {
             errors.add("password", new ActionMessage("error.password.required"));
         }
         
         
          if(isAlpha(getFirstname()) || firstname.length()<3)
        {
             errors.add("firstname", new ActionMessage("error.firstname.required"));
        }
            if(isAlpha(getLastname()) || firstname.length()<3)
        {
             errors.add("lastname", new ActionMessage("error.lastname.required"));
        }
                if( emailID.length()<3 || isvalidEmail(getEmailID()))
        {
             errors.add("emailid", new ActionMessage("error.emailid.required"));
        }
                 if( dob.length()<3 )
        {
             errors.add("dob", new ActionMessage("error.dob.required"));
        }
                          
        
        return errors;
    }
    void setMessage(){
        this.message = "<span style ='color:red'>successfully registered</span>";
    }
}
