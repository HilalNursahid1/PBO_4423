package minggu6;
import java.util.Scanner;

public class maininfosiswa {
    public static void main(String[] args) {
        
        Scanner mengisiStack = new Scanner(System.in);

        kotasiswa aksesKota = new kotasiswa();

        siswa aksesNama = new siswa();

        nilaisiswa aksesNilai = new nilaisiswa();

        int isiNama, isiNilai, isiKota;

        System.out.println("=====Stack nama siswa dengan arraylist=====");
        System.out.print("ingin isi nama berapa kali? (1,2,3,dst...) = ");
        isiNama = mengisiStack.nextInt();
        for (int i = 0; i < isiNama; i++) {
            aksesNama.mintaNama();
            aksesNama.pushKeDaftarNama();
        }
        System.out.println("stack nama siswa = " + aksesNama.daftarNama);
        System.out.println("apakah stack sudah kosong sekarang? = " + aksesNama.isEmpty());
        aksesNama.popNama();
        aksesNama.intipAnggotaPalingAtas();
        System.out.println("stack nama siswa = " + aksesNama.daftarNama);
        System.out.println();
        aksesNama.searchAnggota();
        System.out.println("=====akhir dari program nama siswa=====");

        System.out.println();
        System.out.println("=====Stack nilai siswa dengan arraylist=====");
        System.out.print("ingin isi nilai berapa kali? (1,2,3,dst...) = ");
        isiNilai = mengisiStack.nextInt();
        for (int i = 0; i < isiNilai; i++) {
            aksesNilai.mintaNilai();
            aksesNilai.pushKeDaftarNilai();
        }
        System.out.println("stack nilai siswa = " + aksesNilai.daftarNilai);
        System.out.println("apakah stack sudah kosong sekarang? = " + aksesNilai.isEmpty());
        aksesNilai.popNilai();
        System.out.print("anggota stack yang paling atas sekarang = " + aksesNilai.intipAnggotaPalingAtas());
        System.out.println();
        System.out.println("stack nilai siswa = " + aksesNilai.daftarNilai);
        System.out.println();
        aksesNilai.searchAnggota();
        System.out.println("=====akhir dari program nilai siswa=====");

        System.out.println();
        System.out.println("=====Stack kota asal siswa dengan class Stack bawaan java=====");
        System.out.print("ingin isi kota asal berapa kali? (1,2,3,dst...) = ");
        isiKota = mengisiStack.nextInt();
        for (int i = 0; i < isiKota; i++) {
            aksesKota.mintaKotaAsal();
            aksesKota.pushkeWadahKota();
        }
        System.out.println("stack kota asal siswa = " + aksesKota.wadahKota);
        System.out.print("apakah stack sudah kosong sekarang? = " + aksesKota.apakahKosong());
        System.out.println();
        aksesKota.popKotaAsal();
        aksesKota.intipAnggotaPalingAtas();
        System.out.println("stack kota asal siswa = " + aksesKota.wadahKota);
        aksesKota.tampilkanAnggotaDicari();
        System.out.println("=====akhir dari program kota asal siswa=====");

        mengisiStack.close();

    }
}