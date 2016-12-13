package Barang_Control;

import Database.Koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Kategori {
  private String idkategori;
  private String nama_kategori;

  private Koneksi database;
  Connection conn = database.getConnection();
  
    public Kategori(String idk, String nama_k) {
        this.idkategori = idk;
        this.nama_kategori = nama_k;
    }
  

    public String getIdkategori() {
        return idkategori;
    }

    public void setIdkategori(String idkategori) {
        this.idkategori = idkategori;
    }

    public String getNama_kategori() {
        return nama_kategori;
    }
    public String getNama_kategori(String nm) {
        String hasil=null;
      try {
          PreparedStatement stmt=conn.prepareStatement("Select NAMA_KATEGORI FROM KATEGORI WHERE IDKATEGORI="+nm);
          ResultSet resultSet = stmt.executeQuery();
          while (resultSet.next()) {
              hasil = resultSet.getString(1);
          }     
      } catch (SQLException ex) {
          Logger.getLogger(Kategori.class.getName()).log(Level.SEVERE, null, ex);
      }return hasil;
    }
    public void setNama_kategori(String nama_kategori) {
        this.nama_kategori = nama_kategori;
    }
  
}
