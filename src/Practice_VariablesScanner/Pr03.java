package Practice_VariablesScanner;

import java.util.Scanner;

public class Pr03 {
    public static void main(String[] args) {

        //Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip, dikdortgenin alanini yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Dikdortgenin uzun kenarini girin: ");
        double lng_edge=scan.nextDouble();
        System.out.println("Dikdortgenin kisa keanirini girin: ");
        double sht_edge= scan.nextDouble();

        System.out.println("Dikdortgenin alani: " + (lng_edge*sht_edge));


    }

}
