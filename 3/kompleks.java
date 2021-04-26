// NAMA : Hilal Alba N.
// NIM  : A11.2019.12306
public class Kompleks {
    double real, imag;

    public Kompleks(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }
public static void main(String[] args) {
    Kompleks bil_1 = new Kompleks(2.3, 4.5);
    Kompleks bil_2 = new Kompleks(3.4, 5.0);
    Kompleks temp;

    temp = add(bil_1, bil_2);

    System.out.printf("Jumlah = %.1f +%.1fi\n", temp.real, temp.imag);
    }
public static Kompleks add(Kompleks bil_1, Kompleks bil_2) {
    Kompleks temp = new Kompleks(0.0, 0.0);

    temp.real = bil_1.real + bil_2.real;
    temp.imag = bil_1.imag + bil_2.imag;

    return temp;
    }
}