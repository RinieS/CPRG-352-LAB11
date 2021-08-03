/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import services.AccountService;

/**
 *
 * @author 840979
 */
public class ForgotPasswordServlet extends HttpServlet {

    

   
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/forgot.jsp").forward(request, response);
       
    }

   
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        AccountService as = new AccountService();
        String email = request.getParameter("email");
        
        if (email == null || email.equals("")){
            response.sendRedirect("forgot");
            
            request.setAttribute("msg", "To retrieve your password enter your email");
            return;
        }
        else {
        try{
            as.forgotPassword(email, getServletContext().getRealPath("/WEB-INF"));
        }
       catch (Exception e){
           
       }
        response.sendRedirect("login");
        }
        
        
    }

   
    

}
