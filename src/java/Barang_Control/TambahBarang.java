package Barang_Control;
/* Kelas ini untuk memproses input yang dimasukan user pada form 
   tambah barang untuk kemudian di simpan ke database barang
*/
import Penjual_Control.*;
import java.io.IOException;
import java.sql.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(name="Tambahbarang", urlPatterns = {"/Tambahbarang"})

public class TambahBarang extends HttpServlet {

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
      
        String namabarang=request.getParameter("namabarang");
        String idbarang=request.getParameter("idbarang");
        String idkat=request.getParameter("idkat");
        int idpenjual=Integer.parseInt(request.getParameter("idpenjual"));
        String email=request.getParameter("email");
//        String gambar="EMPTY_BLOB";       
        String gambar=request.getParameter("gambar");       
        int hargabarang=Integer.parseInt(request.getParameter("hargabarang"));
        String deskripsi=request.getParameter("deskripsi");
        String  kedaluarsa=request.getParameter("kedaluarsa");
        
        
        Query_Barang barang= new Query_Barang();
//        barang.TambahBarang("brg01","001",14531477,namabarang,1999,"halo",deskripsi,"12,12,2006");
        barang.TambahBarang("brg01","001",14531477,"apem",1999,"halo","deskripsi","12,12,2006");
        response.sendRedirect("/ProyekPRL/store.html"); //<--- ubah lagi
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}