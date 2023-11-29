import java.util.ArrayList;

/**
 *
 * @author Baskar
 */
public class Masyarakat implements InterfaceLelang{
    
    private ArrayList<String> namaMasyarakat = new ArrayList();
    private ArrayList<String> alamat = new ArrayList();
    private ArrayList<String> telepon = new ArrayList();
    
    public Masyarakat(){
        this.namaMasyarakat.add("Sandi");
        this.alamat.add("Mars");
        this.telepon.add("088099890880");
        this.namaMasyarakat.add("eyang");
        this.alamat.add("Uranus");
        this.telepon.add("088232290880");
    }
    
    public int getNameSize(){
        return this.namaMasyarakat.size();
    }

    @Override
    public void setNama(String nama) {
        this.namaMasyarakat.add(nama);
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
        return this.namaMasyarakat.get(nama);
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
        for(int i =0; i < this.namaMasyarakat.size();i++){
            System.out.println("Nama : "+this.getNama(i));
            System.out.println("Telepon : "+this.getTelepon(i));
            System.out.println("Alamat : "+this.getAlamat(i));
        }
    }
    
}
