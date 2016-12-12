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
    Connection connection;
    Koneksi database;

    public Query_Penjual() {
        database = new Koneksi();
    }
    public void TambahPenjual(int NIM, String nama, String email, String pass, int hp, String line, String bbm)
             {
        PreparedStatement stmt = null;
        String sql = "INSERT INTO PENJUAL VALUES (?,?,?,?,?,?)"; //<--- cek lagi
        connection = database.getConnection();
        try {
            stmt = connection.prepareStatement(sql);
        stmt.setInt(1, NIM);
        stmt.setString(2, nama);
        stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Query_Penjual.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void TambahPenjual(Penjual p){
        PreparedStatement stmt = null;
        String sql = "INSERT INTO PENJUAL VALUES (?,?,?,?,?,?)"; //<--- cek lagi
        connection = database.getConnection();
        try {
            stmt = connection.prepareStatement(sql);
        stmt.setInt(1, p.getNIM());
        stmt.setString(2, p.getNama());
        stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Query_Penjual.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
