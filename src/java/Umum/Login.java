package Umum;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {
    KontrolLogin Login=new KontrolLogin();
    String [] DataLogin;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session=request.getSession();
        
        if(session.getAttribute("DataLogin")!=null){
            DataLogin=(String[]) session.getAttribute("DataLogin");
            if(DataLogin[2].equals("penjual")){
                response.sendRedirect("/ProjectWEB/store.html");
            }else if(DataLogin[2].equals("admin")){
                response.sendRedirect("/ProjectWEB/store.html");
            }
        }else{
            request.getRequestDispatcher("/ProjectWEB/store.html").forward(request, response);
        }
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session=request.getSession();
        if(session.getAttribute("LoginData")!=null){
            DataLogin =(String[]) session.getAttribute("LoginData");
        }else{
            try {
                DataLogin=Login.CekLogin(request.getParameter("username"),request.getParameter("password"));
            } catch (SQLException ex) {
            }
            
            if(DataLogin[2]==null ){
                response.sendRedirect("/ProyekPRL/account.html");
            }
            else if(DataLogin[2].equals("penjual")){
                session.setAttribute("DataLogin", DataLogin);
                response.sendRedirect("/ProyekPRL/store.html");
            }
            else if(DataLogin[2].equals("admin")){
                session.setAttribute("DataLogin", DataLogin);
                response.sendRedirect("/ProyekPRL/store.html");
            }
        }
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
