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
 * @author TheSpecialisT
 */
public class LoginForm extends org.apache.struts.action.ActionForm {
    
    private String name;
    private int number;
    private String email;
    private String error;
    private String date;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEmail() {
        return email;
    }

  public String getError() {
        return error;
    }

   /* public void setError() {
        this.error =
        "<span style='color:red'>Please provide valid entries for both fields</span>";
    }*/

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * @param string
     */
    public void setName(String string) {
        name = string;
    }

    /**
     * @return
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param i
     */
    public void setNumber(int i) {
        number = i;
    }

    /**
     *
     */
    public LoginForm() {
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
        
        if (getName() == null || name.length()<3){
            errors.add("name", new ActionMessage("error.name"));}
            // TODO: add 'error.name.required' key to your resources
       
        if(getEmail() == null || email.length()<3){
            errors.add("email",new ActionMessage("error.email"));}
        return errors;
    }
    @Override
        public void reset(ActionMapping mapping, HttpServletRequest request) {

		// reset properties
		name = "";
		email = "";

	}
    
// this is not necessary
    void setError() {
        this.error =  "<span style='color:red'>LoginID/Email Invalid</span>";
    }
    }
    
