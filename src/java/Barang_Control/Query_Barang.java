package Barang_Control;

import Database.Koneksi;
import Penjual_Control.Query_Penjual;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bona
 */
public class Query_Barang {
    private Connection connection;
    private Koneksi database;
    
    public void TambahBarang(String kode_brg, String kode_pnjual, String nama, String kode_ktgori, String harga, String deskripsi, String gambar){
        PreparedStatement stmt = null;
        String sql = "INSERT INTO BARANG VALUES (?,?,?,?,?,?,?)"; //<--- cek lagi
        connection = database.getConnection();
        try {
            stmt = connection.prepareStatement(sql);
        stmt.setString(1, kode_brg);
        stmt.setString(2, nama);
        stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Query_Penjual.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(Query_Penjual.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}