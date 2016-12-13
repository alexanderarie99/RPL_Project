/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Barang_Control;

import java.io.IOException;
import java.io.PrintWriter;
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
        String kodeBarang="brg09";
        String kodeKategori="K001";
        int kodePenjual=145314077;
        String nama=request.getParameter("namabarang");
        
        int harga=0;
        String hrg=request.getParameter("hargabarang");
        harga=Integer.parseInt(hrg);
        
        String gambar="gambar";
        String deskripsi=request.getParameter("deskripsi");
        String tgl="tanggal";
        Query_Barang barang=new Query_Barang();
        barang.TambahBarang(kodeBarang,kodeKategori,kodePenjual,nama,harga,gambar,deskripsi,tgl);
        response.sendRedirect("/ProyekPRL/Store.html");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
