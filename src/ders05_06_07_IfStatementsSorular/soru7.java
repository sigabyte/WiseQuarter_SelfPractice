package ders05_06_07_IfStatementsSorular;

import java.util.Scanner;

public class soru7 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Notunuzu giriniz: ");
        double not= scan.nextDouble();

        if (not>=50){
            System.out.println("sinifi gectiniz");
        }else{
            System.out.println("Sinifta kaldiniz");
        }
    }
}
