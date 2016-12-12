package Penjual_Control;
public class Penjual {
    private int NIM;
    private String nama;
    private String email;
    private String password;
    private String jenis_kelamin;
    private int no_hp;
    private String alamat;
    private String line;
    private String bbm;

    public Penjual(int ni, String nm, String em, String pass, String jk, int np, String almt, String ln, String bm){
        this.NIM=ni;
        this.nama=nm;
        this.email=em;
        this.password=pass;
        this.jenis_kelamin=jk;
        this.no_hp=np;
        this.alamat=almt;
        this.line=ln;
        this.bbm=bm;
        
    }
    public int getNIM() {
        return NIM;
    }

    public void setNIM(int NIM) {
        this.NIM = NIM;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJenis_kelamin() {
        return jenis_kelamin;
    }

    public void setJenis_kelamin(String jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }

    public int getNo_hp() {
        return no_hp;
    }

    public void setNo_hp(int no_hp) {
        this.no_hp = no_hp;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public String getBbm() {
        return bbm;
    }

    public void setBbm(String bbm) {
        this.bbm = bbm;
    }
    
    
}
