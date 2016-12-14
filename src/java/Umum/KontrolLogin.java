/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Umum;

import Database.Koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Bona
 */
public class KontrolLogin {
    Connection connection;
    Koneksi database = new Koneksi();
    public String[] CekLogin(String username, String password) throws SQLException{
        String[] data=new String[3];
        connection = null;
        PreparedStatement stmt;
        ResultSet resultSet;
        try {
            connection = database.getConnection();
            stmt = connection.prepareStatement("SELECT idpenjual, password from "
                    + "penjual WHERE idpenjual= ? and password= ?");
            stmt.setInt(1, Integer.parseInt(username));
            stmt.setString(2, password);
            resultSet = stmt.executeQuery();
            if(resultSet.next()){
                data[0]=username;
                data[1]=password;
                data[2]="penjual";
            }
        }catch (SQLException | NumberFormatException e){
            
        }
        try{
            connection = database.getConnection();
            stmt = connection.prepareStatement("SELECT IDADMIN, "
                    + "Password from admin "
                    + "WHERE IDADMIN= ? and password= ?");
            stmt.setString(1, username);
            stmt.setString(2, password);
            resultSet = stmt.executeQuery();
            
            if(resultSet.next()){
                data[0]=username;
                data[1]=password;
                data[2]="admin";
            }
        }catch (SQLException e){
            
        }
        return data;
    }
    
}
