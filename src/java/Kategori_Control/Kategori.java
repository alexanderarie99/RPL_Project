package Kategori_Control;


public class Kategori {
  private String idkategori;
  private String nama_kategori;

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

    public void setNama_kategori(String nama_kategori) {
        this.nama_kategori = nama_kategori;
    }
  
}
