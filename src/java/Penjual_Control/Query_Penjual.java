/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Penjual_Control;
import Database.Koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bona
 */
public class Query_Penjual {
    private Connection connection;
    private Koneksi database;

    public Query_Penjual() {
        database = new Koneksi();
    }
    public void TambahPenjual(int NIM, String nama, String email, String pass, 
            String j_kelamin, int hp, String alamat, String line, String bbm)
             {
        PreparedStatement stmt = null;
        String sql = "INSERT INTO PENJUAL VALUES (?,?,?,?,?,?,?,?,?)"; //<--- cek lagi
        connection = database.getConnection();
        try {
            stmt = connection.prepareStatement(sql);
        stmt.setInt(1, NIM); //idpenjual
        stmt.setString(2, nama);
        stmt.setString(3, email);
        stmt.setString(4, pass);
        stmt.setString(5, j_kelamin);
        stmt.setInt(6, hp);
        stmt.setString(7, alamat);
        stmt.setString(8, line);
        stmt.setString(9, bbm);
        stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Query_Penjual.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void TambahPenjual(Penjual p){
        PreparedStatement stmt = null;
        String sql = "INSERT INTO PENJUAL VALUES (?,?,?,?,?,?,?,?,?)"; //<--- cek lagi
        connection = database.getConnection();
        try {
            stmt = connection.prepareStatement(sql);
        stmt.setInt(1, p.getNIM()); //idpenjual
        stmt.setString(2, p.getNama());
        stmt.setString(3, p.getEmail());
        stmt.setString(4, p.getEmail());
        stmt.setString(5, p.getJenis_kelamin());
        stmt.setInt(6, p.getNo_hp());
        stmt.setString(7, p.getAlamat());
        stmt.setString(8, p.getLine());
        stmt.setString(9, p.getBbm());
        stmt.executeUpdate();
        stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Query_Penjual.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
