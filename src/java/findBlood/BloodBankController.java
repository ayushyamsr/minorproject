/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findBlood;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author dell
 */
@WebServlet(name = "BloodBankController", urlPatterns = {"/BloodBankController"})
public class BloodBankController extends HttpServlet {

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
            
            
            int Opos=Integer.parseInt(request.getParameter("Opos"));
           
            int Apos=Integer.parseInt(request.getParameter("Apos"));
            int Bpos=Integer.parseInt(request.getParameter("Bpos"));
            int ABpos=Integer.parseInt(request.getParameter("ABpos"));
            int Oneg=Integer.parseInt(request.getParameter("Oneg"));
            int Aneg=Integer.parseInt(request.getParameter("Aneg"));
            int Bneg=Integer.parseInt(request.getParameter("Bneg"));
            int ABneg=Integer.parseInt(request.getParameter("ABneg"));
            HttpSession session=request.getSession();
            String bloodBankName=(String)session.getAttribute("bloodBankName");
            System.out.println(bloodBankName);
            boolean update=BloodBankDAO.updateBloodDetails(Opos,Apos,Bpos,ABpos,Oneg,Aneg,Bneg,ABneg,bloodBankName);
            if(update)
            {
                out.println("<script>alert('Successfully Updated');</script>");
                rd=request.getRequestDispatcher("bloodBankHome.jsp");
                rd.include(request,response);
                
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
