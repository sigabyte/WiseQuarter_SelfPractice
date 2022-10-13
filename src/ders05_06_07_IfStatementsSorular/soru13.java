package ders05_06_07_IfStatementsSorular;

import java.util.Scanner;

public class soru13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("kilonuzu KG giriniz: ");
        double kg=scan.nextDouble();
        System.out.println("boyunuzu cm giriniz: ");
        double boy=scan.nextDouble();

            double kitleEndex = (kg * 10000 / (boy * boy));
            System.out.println("Vucut kitle endeksiniz : " + kitleEndex);

            if (kitleEndex > 30) {
                System.out.println("Obezsiniz!");
            } else if (kitleEndex > 25) {
                System.out.println("kilolu");
            } else if (kitleEndex > 20) {
                System.out.println("normal");
            } else if (kitleEndex > 0) {
                System.out.println("Zayifsiniz!");
            } else {
                System.out.println("Gecersiz giris yaptiniz");
            }

    }
}
