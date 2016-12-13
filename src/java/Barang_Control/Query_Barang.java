package Barang_Control;
import Database.Koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bona
 */
public class Query_Barang {
    private Connection connection;
    private Koneksi database;

    public Query_Barang() {
        database = new Koneksi();
    }
    public void TambahBarang(String kode_brg,String kode_ktgori,int kode_pnjual,
            String nama,int harga,String gambar,String deskripsi,String kedaluarsa){        
        PreparedStatement stmt = null;
        String sql = "INSERT INTO BARANG VALUES (?,?,?,?,?,?,?,?)";
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
//        connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(Query_Barang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void EditBarang(String kode_brg, String kode_pnjual, String nama, 
            String kode_ktgori, String harga, String deskripsi, String gambar){
        PreparedStatement stmt = null;
        String sql = "update barang set NAMABARANG=?, KODEKATEGORI=?, "
                + "SATUAN=?, QTYMIN=?, QTYMAX=?, "
                + " RITELSEBELUM=?, RITELSETELAH=?, BELISEBELUM=?, BELISETELAH=? "
                + "where Kode_Barang =?";
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
    public void HapusBarang(String kode_brg){
        PreparedStatement stmt = null;
        String sql = "DELETE BARANG WHERE IDBARANG=?"; //<--- cek lagi
        connection = database.getConnection();
        try {
            stmt = connection.prepareStatement(sql);
        stmt.setString(1, kode_brg);
        stmt.executeUpdate();
//        connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(Query_Barang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String kodeBarangOtmtis() {
        String kode = null;
        try {
        ResultSet rset = null;
        String sql = "select substr(IDBARANG, 4) from barang";
        connection = database.getConnection();
        Statement stat = connection.createStatement();
        rset = stat.executeQuery(sql);
            int bantu=1;
            while (rset.next()){
                if (!rset.getString(1).isEmpty()){
                    bantu=(Integer.parseInt(rset.getString(1))+1);
                } else {
                    bantu = 1;
                }
            }
            kode = "brg" + String.valueOf(bantu);
//            connection.close();
        } catch (SQLException e) {
            
        }
        return kode;
    }
    public String kodeKtgoriOtmts() {
        String kode = null;
        try {
        ResultSet rset = null;
        String sql = "select substr(IDKATEGORI, 2) from KATEGORI";
        connection = database.getConnection();
        Statement stat = connection.createStatement();
        rset = stat.executeQuery(sql);
            int bantu=1;
            while (rset.next()){
                if (!rset.getString(1).isEmpty()){
                    bantu=(Integer.parseInt(rset.getString(1))+1);
                } else {
                    bantu = 1;
                }
            }
            kode = "K" + String.valueOf(bantu);
            connection.close();
        } catch (SQLException e) {
            
        }
        return kode;
    }
    
}
