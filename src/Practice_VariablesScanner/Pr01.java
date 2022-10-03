package Practice_VariablesScanner;

import java.util.Scanner;

public class Pr01 {
    public static void main(String[] args) {
        //Kullanicidan bir double, bir de int sayi alip bunlarin toplamini ve carpimini yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("integer deger girin: ");
        int num= scan.nextInt();
        System.out.println("double deger girin: ");
        double dbl=scan.nextDouble();

        System.out.println("giridiginiz deger " + num + " bir integer");
        System.out.println("girdinginiz degr " + dbl + " bir double");
    }
}
