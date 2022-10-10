package ders05_06_07_IfStatementsSorular;

import java.util.Scanner;

public class soru01 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Tamsayi girin: ");
        int num= scan.nextInt();

        if (num%5==0){
            System.out.println("girdiginiz sayi 5'in tam kati");
        }else {
            System.out.println("girdiginiz sayi 5'in tam kati degil");
        }

    }
}
