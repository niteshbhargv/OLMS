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
public class SearchAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "SearchSuccess";
    private static final String FAILURE = "SearchFailure";

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
        
        SearchForm formBean = (SearchForm)form;
        String SearchString = formBean.getSearchString();
        
      
        if((SearchString == null)|| SearchString.equals(""))
        {
            formBean.setError();
            return mapping.findForward(FAILURE);
          }
        formBean.setDatabaseQuery(SearchString);
        return mapping.findForward(SUCCESS);
    }
}
