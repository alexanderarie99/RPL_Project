/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Barang_Control;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Bona
 */
@WebServlet(name = "TambahBarang", urlPatterns = {"/TambahBarang"})
public class TambahBarangProses extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        
        Query_Barang barang=new Query_Barang();
        String kodeBarang=barang.kodeBarangOtmtis();
        
        String kodeKategori=request.getParameter("kategori");  //barang.kodeKtgoriOtmts() <-- untuk kategori baru
        int kodePenjual=145314077; //diambil dari cookie login
        String nama=request.getParameter("namabarang");
        
        int harga=0;
        String hrg=request.getParameter("hargabarang");
        harga=Integer.parseInt(hrg);
        
        String gambar="gambar";
        String deskripsi=request.getParameter("deskripsi");
        
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss"); 
        Date date = new Date();
        dateFormat.format(date);
        dateFormat.toString();
        
        String tgl="tanggal";
        barang.TambahBarang(kodeBarang,kodeKategori,kodePenjual,nama,harga,gambar,deskripsi,tgl);
        response.sendRedirect("/ProyekPRL/store.html");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
