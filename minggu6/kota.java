package minggu6;
import java.util.Scanner;
import java.util.Stack;

public class kotasiswa{
    Stack<String> wadahKota = new Stack<String>();

    Scanner IsiKota = new Scanner(System.in);

    String kotaAsal;

    public String mintaKotaAsal() {
        System.out.print("masukkan kota asal = ");
        kotaAsal = IsiKota.nextLine();
        return kotaAsal;

    }

    void pushkeWadahKota() {
        wadahKota.push(kotaAsal);
    }

    boolean apakahKosong() {
        boolean cekIsi;
        cekIsi=wadahKota.empty();
        return cekIsi;
    }

    void popKotaAsal() {
        if (!wadahKota.empty()) {
            //
            String anggotaTerhapus;
            //
            anggotaTerhapus = (String) wadahKota.pop();

            //
            System.out.println("anggota dari stack yang terhapus = " + anggotaTerhapus);
        } else {
            System.out.println("stack sudah kosong");
        }

    }

    //
    void tampilkanAnggotaDicari() {
        String cariKota;
        int tampilkanKotaDicari;
        System.out.print("anggota stack yang dicari = ");
        cariKota = IsiKota.nextLine();
        System.out.println();
        tampilkanKotaDicari = wadahKota.search(cariKota);
        System.out.println("kota yang dicari ada di index = " + tampilkanKotaDicari);
    }

    void intipAnggotaPalingAtas(){
        if (wadahKota.empty()){
           System.out.println("stack sudah kosong. tidak ada anggota paling atas dari stack");
        }else {
            String intipAnngota;
            intipAnngota= (String) wadahKota.peek();
            System.out.println("anggota paling atas dari stack sekarang = "+intipAnngota);
        }
    }
}