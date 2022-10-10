package ders03_Sorular;

import java.util.Scanner;

public class soru05 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Ondalikli sayi girin: ");
        double num1=scan.nextDouble();
        System.out.println("bir tamsayi girin: ");
        int num2=scan.nextInt();

        int divide= (int) (num1/num2);

        System.out.println(divide);

    }
}
