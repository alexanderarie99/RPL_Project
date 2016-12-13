package Barang_Control;

import Database.Koneksi;
import Penjual_Control.Query_Penjual;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bona
 */
public class Query_Barang {
    private Connection connection;
    private Koneksi database;
    
    public void TambahBarang(String kode_brg,String kode_ktgori,int kode_pnjual,String nama,int harga,String gambar,String deskripsi,String kedaluarsa){
        PreparedStatement stmt = null;
        String sql = "INSERT INTO BARANG VALUES (?,?,?,?,?,?,?,?)"; //<--- cek lagi
        connection = database.getConnection();
        try {
            stmt = connection.prepareStatement(sql);
        stmt.setString(1, kode_brg);
        stmt.setString(2, kode_ktgori);
        stmt.setInt(3, kode_pnjual);
        stmt.setString(4, nama);
        stmt.setInt(5, harga);
        stmt.setString(6, gambar);
        stmt.setString(7, deskripsi);
        stmt.setString(8, kedaluarsa);
        stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Query_Barang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void EditBarang(String kode_brg, String kode_pnjual, String nama, String kode_ktgori, String harga, String deskripsi, String gambar){
        PreparedStatement stmt = null;
        String sql = "update barang set NAMABARANG=?, KODEKATEGORI=?, "
                + "SATUAN=?, QTYMIN=?, QTYMAX=?, "
                + " RITELSEBELUM=?, RITELSETELAH=?, BELISEBELUM=?, BELISETELAH=? "
                + "where Kode_Barang =?";  //<--- cek lagi
        connection = database.getConnection();
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, kode_brg);
            stmt.setString(2, nama);
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Query_Barang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    

    

   
}