package Admin_Control;

public class Admin {
    private int idadmin;
    private String nama_admin;
    private String email;
    private String password;
    private String jenis_kelamin;
    
    public Admin(int idadm, String nm_adm, String em, String pass, String jk){
        this.idadmin=idadm;
        this.nama_admin=nm_adm;
        this.email=em;
        this.password=pass;
        this.jenis_kelamin=jk;
    }
    public int getIdadmin() {
        return idadmin;
    }

    public void setIdadmin(int idadmin) {
        this.idadmin = idadmin;
    }

    public String getNama_admin() {
        return nama_admin;
    }

    public void setNama_admin(String nama_admin) {
        this.nama_admin = nama_admin;
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
    
    
}
