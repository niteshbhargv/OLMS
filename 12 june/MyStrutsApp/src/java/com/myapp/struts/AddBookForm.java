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
public class AddBookForm extends org.apache.struts.action.ActionForm {

    private String title;
    private String ISBNNumber;
    private String error;
    private String[] str = new String[5];

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getISBNNumber() {
        return ISBNNumber;
    }

    public void setISBNNumber(String ISBNNumber) {
        this.ISBNNumber = ISBNNumber;
    }
    private String Publication;
    private String Category;
    private int Edition;
    private float Price;
    private String Message;

    public String getMessage() {
        return Message;
    }

    public void setMessage(String Message) {
        this.Message = "Succesfully added";
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public int getEdition() {
        return Edition;
    }

    public void setEdition(int Edition) {
        this.Edition = Edition;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float Price) {
        this.Price = Price;
    }

    public String getPublication() {
        return Publication;
    }

    public void setPublication(String Publication) {
        this.Publication = Publication;
    }

    public String getauthor() {
        return author;
    }

    public void setauthor(String author) {
        this.author = author;
    }

    public String gettitle() {
        return title;
    }

    public void settitle(String title) {
        this.title = title;
    }
    private String author;

    /**
     * @return
     */
    public AddBookForm() {
        super();
        // TODO Auto-generated constructor stub
    }

    public boolean isIntegeer(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isDigit(String input) {


        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                return true;
            }

        }

        return false;

    }
    
    
    public boolean isAlpha(String input)
    {
       
        if(input.matches("^[a-zA-Z]+$"))
        {
            return false;
        }
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
    
    
    public boolean isInteger(double input)
    {
        int test = (int) input;
        if(test == input){
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

       if (isAlpha(gettitle()) || title.length()<3) {
            errors.add("title", new ActionMessage("error.title.required"));
        }
       
       if (isAlpha(getauthor()) || author.length()<3) {
            errors.add("author", new ActionMessage("error.author.required"));
        }
       
       if (isAlpha(getPublication()) ){ //|| Publication.length()<1) {
            errors.add("Publication", new ActionMessage("error.Publication.required"));
        }
       
       if (isAlpha(getCategory()) || Category.length()<3) {
            errors.add("Category", new ActionMessage("error.Category.required"));
        }
       
       if (!(isInteger(getEdition()))) {
            errors.add("Edition", new ActionMessage("error.Edition.required"));
        }
       if (!(isIntegeer(getISBNNumber())) || isAlph(getISBNNumber())) {
            errors.add("ISBNNumber", new ActionMessage("error.ISBNNumber.required"));
        }
       /*if(isInteger(getPrice()))
       {
           if (isAlpha(gettitle()) || title.length()<=3) {
            errors.add("Price", new ActionMessage("error.Price.required"));
        }*/
       
       
       
        return errors;
    }

    void setMessage() {
        this.Message = "Successfully added";
    }

    @Override
    public void reset(ActionMapping mapping, HttpServletRequest request) {

        // reset properties

        title = "";
        Publication = "";
        author = "";
        Category = "";
      //  Edition = 0;
        //Price = 0;
        ISBNNumber = "";
    }

    void setError() {
        this.error = "<span style='color:red'>ISBN Number already exist</span>";
    }
}
