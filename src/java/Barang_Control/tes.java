/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Barang_Control;

import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class tes {
    public static void main(String[] args) {
        Query_Barang barang=new Query_Barang();
                
     
            //        barang.TambahBarang("brg04","K001",145314077,"apem",9999,"halo","deskripsi","12-12-12");
//        barang.Hapus("brg01");
//System.out.println(barang.kodeBarangOtmtis());
//        for (int i = 0; i < 10; i++) {
            
//        }
System.out.println(getTanggal());
    }
    private static String getTanggal() { 
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss"); 
        Date date = new Date(); 
        return dateFormat.format(date); 
    }}
