package ders05_06_07_IfStatementsSorular;

import java.util.Scanner;

public class soru11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir tam sayi giriniz : ");
        int num= scan.nextInt();

        if (num<0){
            System.out.println("gecersiz sayi girdiniz!");
        } else if (num<10) {
            System.out.println("rakam");
        } else if (num>10 && num<100) {
            System.out.println("Iki basamakli sayi girdiniz");
        }else {
            System.out.println("Buyuk sayi girdiniz");
        }

    }
}
