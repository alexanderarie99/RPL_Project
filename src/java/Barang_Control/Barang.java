/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Barang_Control;

import java.util.Date;

/**
 *
 * @author Bona
 */
public class Barang {
    private String kode_barang;
    private String nama;
    private String kategori;
    private int harga;
    private Date kadalursa;

    public String getKode_barang() {
        return kode_barang;
    }

    public void setKode_barang(String kode_barang) {
        this.kode_barang = kode_barang;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public Date getKadalursa() {
        return kadalursa;
    }

    public void setKadalursa(Date kadalursa) {
        this.kadalursa = kadalursa;
    } 
}
