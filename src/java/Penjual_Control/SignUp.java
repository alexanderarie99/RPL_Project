package Penjual_Control;
/* Kelas ini untuk memproses input yang dimasukan user pada form 
   sign up untuk kemudian di simpan ke database
*/
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(name="Register", urlPatterns = {"/Register2"})
public class SignUp extends HttpServlet {

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
        String kelamin;
        if(request.getParameter("jenisKelamin").equals("m")){
            kelamin="Laki-Laki";
        }else{
            kelamin="Perempuan";
        }
        String nama=request.getParameter("nama");
        int nim=Integer.parseInt(request.getParameter("nim"));
        String email=request.getParameter("email");
        String password=request.getParameter("password");
        int hp=Integer.parseInt(request.getParameter("nohp"));
        String alamat=request.getParameter("alamat");
        String line=request.getParameter("line");
        String bbm=request.getParameter("bbm");
        

        Query_Penjual penjual = new Query_Penjual();
        penjual.TambahPenjual(nim, nama, email, password, kelamin, hp, alamat, line, bbm);
        response.sendRedirect("/ProyekPRL/index.html"); //<--- ubah lagi
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
