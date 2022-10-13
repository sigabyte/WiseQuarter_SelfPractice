package ders05_06_07_IfStatementsSorular;

import java.util.Scanner;

public class soru12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Yasinizi girininz: ");
        double yas=scan.nextDouble();
        System.out.println("cinsiyetinizi girin E/K : ");
        char cins=scan.next().charAt(0);

        if (cins=='E' && yas>=65 || cins=='K' && yas>=60){
            System.out.println("Emekli olabilirsin");
        } else if (cins=='K' && yas<60 && yas>15) {
            System.out.println((60-yas) +  " " + "yildaha calisman gerekir");
        } else if (cins=='E' && yas<65 && yas>15) {
            System.out.println((65-yas) + " " + "yil daha calisman gerekir");
        }else{
            System.out.println("Gecersiz giris");
        }
    }
}
