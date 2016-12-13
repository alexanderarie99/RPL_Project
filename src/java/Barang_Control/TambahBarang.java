package Barang_Control;
/* Kelas ini untuk memproses input yang dimasukan user pada form 
   tambah barang untuk kemudian di simpan ke database barang
*/
import Penjual_Control.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
        String kode_brng=request.getParameter("kodeBarang");
        String kode_penjual=request.getParameter("kodeBarang"); //<---- method kode barang
        String nama=request.getParameter("namaBarang");
        String kategori=request.getParameter("nim"); //<---- method untuk mengubah nama kategori ke kode
        String harga=request.getParameter("harga");
        String deskripsi=request.getParameter("deskripsi");
        String gambar=request.getParameter("gambar"); //method untuk gambar (?)
        
        Query_Barang barang = new Query_Barang();
        barang.TambahBarang(kode_brng, kode_penjual, nama, kategori, harga, deskripsi, gambar);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
