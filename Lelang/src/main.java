
import java.util.Scanner;

/**
 *
 * @author Baskar
 */
public class main {

    public static void main(String[] args) {
        Scanner aaa = new Scanner(System.in);
        int x;
        Barang bar = new Barang();
        Masyarakat mas = new Masyarakat();
        Petugas pet = new Petugas();
        Lelang lel = new Lelang();
        System.out.println("- Data Masyarakat -");
        mas.showData();
        System.out.println("- Data Petugas -");
        pet.showData();

        System.out.println("Selamat datang di Lelang");
        System.out.println("Barang apa yang ingin ditawar?\n1."+bar.getName(0)+"\n2."+bar.getName(1));
        x = aaa.nextInt();
        switch(x){
            case 1 : bar.getInfo(x);
            lel.prosesLelang(x,bar, mas);
            break;
            case 2 : bar.getInfo(x);
            lel.prosesLelang(x,bar, mas);
            break;
            default : System.out.println("Invalid Input");
            break; 
           }
            bar.getInfo(x);

    }
    
}
