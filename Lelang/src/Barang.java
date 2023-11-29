import java.util.ArrayList;

/**
 *
 * @author Baskar
 */
public class Barang {
    private ArrayList<Integer> idMasyarakat = new ArrayList();
    private ArrayList<String> namaBarang = new ArrayList();
    private ArrayList<Integer> hargaAwal = new ArrayList();
    private ArrayList<Boolean> status = new ArrayList();
    
    public Barang(){
        this.namaBarang.add("Mistsplitter Reforged");
        this.hargaAwal.add(150000);
        this.status.add(Boolean.TRUE);
        this.namaBarang.add("Rare Statue");
        this.hargaAwal.add(100000);
        this.status.add(Boolean.TRUE);
    }
    
    public void setStatus(int x, boolean y){
        this.status.set(x,y);
    }
    
    public boolean getStatus(int x){
        return this.status.get(x);
    }
    
    public String getName(int name){
        return this.namaBarang.get(name);
    }
    
    public int getsizeBarang(){
        return this.namaBarang.size();
    }
    
    public int getHarga(int x){
        return this.hargaAwal.get(x);
    }
    
    public void getInfo(int a){
        a -= 1;
        System.out.println("Nama : "+this.namaBarang.get(a));
        System.out.println("Harga Awal : "+this.hargaAwal.get(a));
        if(this.status.get(a) == true){
            System.out.println("Status : bisa ditawar");
        }else{
            System.out.println("Status : terjual");
        }
    }
    
    public void setId(Masyarakat Masyarakat){
        int x = Masyarakat.getNameSize();
        for(int i = 0; i<=x;i++){
            this.idMasyarakat.set(i, Integer.parseInt(Masyarakat.getNama(i)));
        }  
    }
    
}
