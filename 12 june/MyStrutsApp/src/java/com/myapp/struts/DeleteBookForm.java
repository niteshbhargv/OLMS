/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.struts;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author ranveer
 */
public class DeleteBookForm extends org.apache.struts.action.ActionForm {
    private String error;
    private String message;
    private String ISBNNumber;
    
    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = "Enter correct value";
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = "succesfully deleted";
    }

    public String getISBNNumber() {
        return ISBNNumber;
    }

    public void setISBNNumber(String ISBNNumber) {
        this.ISBNNumber = ISBNNumber;
    }
    
   
        public boolean isAlpha(String input)
    {
        if(input.matches("^[0-9]+$"))
            return false;
        else 
            return true;
    }
           public boolean isInteger(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
   
    @Override
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        
        
        
          if (!(isInteger(getISBNNumber())) || isAlpha(getISBNNumber())) {
            errors.add("ISBNNumber", new ActionMessage("error.ISBNNumber.required"));
        }
        return errors;
    }
        void setError(){
        this.error= "enter proper value";
    }

    void setMessage() {
       this.message= "<span style ='color:red'>successfully deleted</span>";
    }
}
