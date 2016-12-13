package Barang_Control;
/* Kelas ini untuk memproses input yang dimasukan user pada form 
   tambah barang untuk kemudian di simpan ke database barang
*/
import Penjual_Control.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(name="HapusBarang", urlPatterns = {"/HapusBarang"})
public class HapusBarang extends HttpServlet {

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
        String kode_brng=request.getParameter("kode"); //<--- pakai ?kode=(kodenya)
        
        Query_Barang barang = new Query_Barang();
        barang.hapusBarang(kode_brng);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
