package ders03_Sorular;

import java.util.Scanner;

public class soru04 {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.print("ilk sayiyi girin:");
        double num1=scan.nextDouble();
        System.out.println("ikinci sayiyi girin: ");
        double num2= scan.nextDouble();

        int divide = (int)(num1/num2);

        System.out.println(divide);
    }
}
