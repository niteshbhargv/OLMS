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
public class AddBookAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "AddBook";
    private static final String FAILURE = "succ";

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

        AddBookForm formBean = (AddBookForm) form;
        ArrayList<String> array = new ArrayList<String>();
        String title = formBean.gettitle();
        String author = formBean.getauthor();
        String ISBN = formBean.getISBNNumber();
        String Publication = formBean.getPublication();
        String Category = formBean.getCategory();
        int Edition = formBean.getEdition();
        float Price = formBean.getPrice();
        int insert_books = 0;
        String books_value = null;
        



        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/olms", "root", "bhanu");

        Statement statatment = connection.createStatement();
        Statement statement = connection.createStatement();

        books_value = "select ISBN from books";


        ResultSet result_books = statement.executeQuery(books_value);
        
        while (result_books.next()) {
            String string = (result_books.getString(1).toString());
            array.add(string);
        }
        
        if (array.contains(ISBN)) {
            errors.add("ISBN", new ActionMessage("ISBN.name"));

        }
        
        else {
            insert_books = statatment.executeUpdate("insert into books values ('" + title + "','" + author + "','" + ISBN + "','" + Edition + "','" + Publication + "','" + Price + "','" + Category + "')");
        }
        saveErrors(request, errors);
        
        statement.close();
        statatment.close();
        connection.close();
        
        
        if (!(errors.isEmpty())) {

            formBean.setError();
            return mapping.findForward(FAILURE);
        } 
        
        else {

            formBean.setMessage();
            return mapping.findForward(SUCCESS);
        }
    }
}