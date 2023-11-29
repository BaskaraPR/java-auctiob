import java.util.ArrayList;

/**
 *
 * @author Baskar
 */
public class Petugas implements InterfaceLelang{
    
    private ArrayList<String> namaPetugas = new ArrayList();
    private ArrayList<String> alamat = new ArrayList();
    private ArrayList<String> telepon = new ArrayList();
    
    public Petugas(){
        this.namaPetugas.add("Howard");
        this.alamat.add("Xianzhou");
        this.telepon.add("09009876534");
    }

    @Override
    public void setNama(String nama) {
        this.namaPetugas.add(nama);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }

    @Override
    public String getNama(int nama) {
        return this.namaPetugas.get(nama);
    }

    @Override
    public String getAlamat(int alamat) {
         return this.alamat.get(alamat);
    }

    @Override
    public String getTelepon(int telepon) {
        return this.telepon.get(telepon);
    }
    
    public void showData(){
        for(int i =0; i < this.namaPetugas.size();i++){
            System.out.println("Nama : "+this.getNama(i));
            System.out.println("Telepon : "+this.getTelepon(i));
            System.out.println("Alamat : "+this.getAlamat(i));
        }
    }
    
}
