package minggu11;

public class MainKendaraan extends Kendaraan {
    private int kondisiAwal;

    @Override
    public void nyalakan() {
        kondisiAwal=0;
        System.out.println("Kecepatan awal sebelum dinyalakan adalah "+kondisiAwal+" km/jam");
    }

    public static void main(String[] args) {
        MainKendaraan panggil=new MainKendaraan();
        panggil.nyalakan();

        //
        Sepeda ambilSepeda=new Sepeda();
        ambilSepeda.nyalakan();
        System.out.print("Tipe sepeda kita adalah ");
        ambilSepeda.jenis();
        System.out.println();
        
    }
}