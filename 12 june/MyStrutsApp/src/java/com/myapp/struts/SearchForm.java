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
public class SearchForm extends org.apache.struts.action.ActionForm {

    private String searchString;
    private String error;
    private String databaseQuery;

    public String getDatabaseQuery() {
        return databaseQuery;
    }

    public void setDatabaseQuery(String databaseQuery) throws ClassNotFoundException, SQLException {



        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/olms", "root", "bhanu");
        Statement statatment = con.createStatement();
        //   String search = "select * from feedback";
        //   String search = "select * from studentaccount where LoginID = '" + databaseQuery + "' or FirstName = '" + databaseQuery + "' or LastName = '" + databaseQuery + "'";
        String search = "select * from studentaccount where LoginID like '" + databaseQuery + "%' or FirstName like '" + databaseQuery + "%' or LastName like '%" + databaseQuery + "%'";
        ResultSet result = statatment.executeQuery(search);

        String Search_result = "";
        while (result.next()) {


            Search_result = Search_result + result.getString(1) + "<br>" + result.getString(2) + "<br>" + result.getString(3) + "<br>" + result.getString(4) + "<br>" + result.getString(5);


            //  Search_result =  Search_result + result.getString(1) + "<br>" + result.getString(2) + "<br>" + result.getString(3) +"<br>" + result.getString(4) ;
        }
        this.databaseQuery = Search_result;

    }

    public String getError() {
        return error;
    }

    public String getSearchString() {
        return searchString;
    }

    public void setSearchString(String searchString) {
        this.searchString = searchString;
    }

    /**
     * @return
     */
    /**
     * @return
     */
    /**
     *
     */
    public SearchForm() {
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
        if (getSearchString() == null || getSearchString().length() < 1) {
            errors.add("name", new ActionMessage("error.name.required"));
            // TODO: add 'error.name.required' key to your resources
        }
        return errors;
    }

    void setError() {
        this.error =
                "<span style='color:red'>Please provide valid entries for both fields</span>";
    }
}
