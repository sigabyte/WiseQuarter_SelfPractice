package ders03_Sorular;

import java.util.Scanner;

public class soru01 {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("sayi girin: ");
        int num1= scan.nextInt();
        System.out.println("2.sayi girin: ");
        int num2=scan.nextInt();
        System.out.println("3.Sayi girin: ");
        int num3=scan.nextInt();
        int avarage=(num1+num2+num3)/3;

        System.out.println((double)avarage);

    }
}
