package Admin_Control;

import Barang_Control.Query_Barang;
import Database.Koneksi;
import Penjual_Control.Query_Penjual;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Tampil {
    private Connection conn;
    private Koneksi db;
    
    public void TampilkanBarang(String kode_brg, String kode_pnjual, String nama, String kode_ktgori, String harga, String deskripsi, String gambar) throws SQLException{
    PreparedStatement statement = null;
    String sql = "SELECT * FROM Barang";
    conn = db.getConnection();
        try{
            statement = conn.prepareStatement(sql);
            statement.setString(1, kode_brg);
            statement.setString(2, nama);
            statement.executeUpdate();
     
        }
        catch(SQLException ex){
            Logger.getLogger(Query_Barang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}