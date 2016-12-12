package Penjual_Control;
/* Kelas ini untuk memproses input yang dimasukan user pada form 
   sign up untuk kemudian di simpan ke database
*/
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Kontrol_SignUp extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nama=request.getParameter("nama");
        int nim=Integer.parseInt(request.getParameter("nim"));
        String email=request.getParameter("email");
        String password=request.getParameter("password");
        int hp=Integer.parseInt(request.getParameter("nohp"));
        String line=request.getParameter("line");
        String bbm=request.getParameter("bbm");
        
        Query_Penjual penjual = new Query_Penjual();
        penjual.TambahPenjual(nim, nama, email, password, hp, line, bbm);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
