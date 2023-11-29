import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Baskar
 */
public class Lelang {
    Scanner aaaa = new Scanner(System.in);
    private ArrayList<Integer> idPenawar = new ArrayList();
    private ArrayList<Integer> idBarang = new ArrayList();
    private ArrayList<Integer> hargaTawar = new ArrayList();
    
    public Lelang (){
        this.idPenawar.add(1);
        this.idPenawar.add(2);
        this.idBarang.add(1);
        this.idBarang.add(2);
    }
    
      
    public void prosesLelang(int indexbarang, Barang Barang, Masyarakat Masyarakat){
        String aa;
        int y;
        int x;
        indexbarang -=1;
        do{
            do {
            System.out.print("Masukkan ID : ");
            y = aaaa.nextInt();
                if (y > Masyarakat.getNameSize()||y<0) {
                    System.out.println("Invalid");
                }   
            } while (y > Masyarakat.getNameSize()||y<0);
            do {
                System.out.println("Masukkan Nominal uang : ");
                x = aaaa.nextInt();
                if(x<=Barang.getHarga(indexbarang)){
                    System.out.println("invalid masukkan uang lebih besar");
                }
                this.hargaTawar.add(x);
            } while (x<=Barang.getHarga(indexbarang));
            System.out.println("Penawar : "+Masyarakat.getNama(y-1));
            System.out.println("ID : "+this.idPenawar.get(y-1));
            System.out.println("Tawaran : "+this.hargaTawar.get(this.hargaTawar.size()-1));
            System.out.println("Mau Menawar Lagi ?? (y/n)");
            aa = aaaa.next();
        }while(aa.equalsIgnoreCase("y"));
        System.out.println("Barang "+Barang.getName(indexbarang)+" terjual dengan harga "+this.hargaTawar.get(this.hargaTawar.size()-1));
        System.out.println("Oleh "+Masyarakat.getNama(y-1));
        System.out.println("ID Penawar "+this.idPenawar.get(y-1));
        Barang.setStatus(indexbarang, false);
        
    }
    

    

}
