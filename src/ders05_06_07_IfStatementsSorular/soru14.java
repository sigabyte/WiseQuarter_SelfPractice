package ders05_06_07_IfStatementsSorular;

import java.util.Scanner;

public class soru14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("urun adedi girin: ");
        int urunAdedi=scan.nextInt();
        System.out.println("liste fiyati girin: ");
        double listeFiyati= scan.nextDouble();
        System.out.println("Musteri kartiniz var ise True; kartiniz yok ise False giriniz: ");
        boolean kartVarmi=scan.nextBoolean();


        if (kartVarmi && urunAdedi>=10){
            System.out.println("odeyeceginiz Tutar: " + " " + (urunAdedi*listeFiyati*0.8));
        } else if (kartVarmi) {
            System.out.println("odeyeceginiz Tutar: " + " " + (urunAdedi*listeFiyati*0.85));
        } else if (!kartVarmi && urunAdedi>=10) {
            System.out.println("odeyeceginiz tutar: " + " " + (urunAdedi*listeFiyati*0.85));
        } else if (!kartVarmi) {
            System.out.println("Odeyeceginiz tutar: " + " " + (urunAdedi*listeFiyati*0.90));
        }else {
            System.out.println("tekrar deneyiniz");
        }
    }
}
