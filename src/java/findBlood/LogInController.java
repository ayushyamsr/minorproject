/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findBlood;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author dell
 */
public class LogInController extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        RequestDispatcher rd=null;
        try (PrintWriter out = response.getWriter()) {
            
            String emailId=request.getParameter("emailId");
            String password=request.getParameter("password");
            String type=LogInDAO.searchId(emailId,password);
            System.out.println(type+"hi");
            if(type.equals("none"))
            {  
                //include("index.html");
                /*
                 out.println("<div class='alert alert-warning alert-dismissible'>");
                 out.println("<button type='button' class='close' data-dismiss='alert'>&times;</button>");
                 out.println("<strong>Invalid Username/Password</strong>");
                 out.println("</div>");
                 rd=request.getRequestDispatcher("showerror.jsp");
                 out.println("<script> alert('Invalid Username/Password');</script>");*/
             
                 
                 rd=request.getRequestDispatcher("rough.html");
                 rd.include(request, response);
                 rd=request.getRequestDispatcher("index.html");
                 rd.include(request, response); 
            }
            if(type.equals("Hospital"))
            {
                String name=LogInDAO.searchHospital(emailId);
                System.out.println(name);
                HttpSession session=request.getSession();
                rd=request.getRequestDispatcher("hospHome.jsp");
                
                    session.setAttribute("hospName",name);
                
              
                rd.forward(request, response);
              
                
            }
            if(type.equals("BloodBank"))
            {
                String name=LogInDAO.searchBloodBank(emailId);
                System.out.println(name);
                HttpSession session=request.getSession();
                rd=request.getRequestDispatcher("bloodBankHome.jsp");
                session.setAttribute("bloodBankName",name);
                rd.forward(request, response);
                
            }
            
        
        }
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
        processRequest(request, response);
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
