/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Model.*;
import Service.LoginService;

/**
 *
 * @author j.a.rodriguez.lopez
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String userId = request.getParameter("user");
        String password = request.getParameter("password");
        LoginService loginService = new LoginService();
        boolean result = loginService.authenticateUser(userId, password);
        if (result) {
            User user = loginService.getUserByUserId(userId);
            String currentUser = loginService.getFullName(userId);
            char userType = loginService.getUserType(userId);
            switch (userType) {
                case 'A':
                    request.getSession().setAttribute("user", user);
                    request.getSession().setAttribute("currentUser", currentUser);
                    request.getSession().setAttribute("currentUserId", userId);
                    response.sendRedirect("admin.jsp");
                    break;
                case 'D':
                    request.getSession().setAttribute("user", user);
                    request.getSession().setAttribute("currentUser", currentUser);
                    request.getSession().setAttribute("currentUserId", userId);
                    response.sendRedirect("doctor.jsp");
                    break;
                case 'P':
                    request.getSession().setAttribute("user", user);
                    request.getSession().setAttribute("currentUser", currentUser);
                    request.getSession().setAttribute("currentUserId", userId);
                    response.sendRedirect("patient.jsp");
                    break;
            }
        } else {
            response.sendRedirect("error.jsp");
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
