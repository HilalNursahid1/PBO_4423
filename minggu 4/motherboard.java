import java.util.Scanner;

class MotherBoard {
    // static nested class
    static class USB{
        int getTotalPorts(int usb2,int usb3){
            return usb2 + usb3;
        }
    }
}

public class motherboardmain {
    public static void main(String[] args) {
        // create an object of the static nested class
        // using the name of the outer class
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan jumlah usb2 = ");
        int usb2 = input.nextInt();
        System.out.print("Masukan jumlah usb3 = ");
        int usb3 = input.nextInt();
        MotherBoard.USB usb = new MotherBoard.USB();
        int totalPorts = usb.getTotalPorts(usb2,usb3);
        System.out.println("Total Ports = " + totalPorts);
    }