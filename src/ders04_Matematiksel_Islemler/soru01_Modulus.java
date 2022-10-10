package ders04_Matematiksel_Islemler;

import java.util.Scanner;

public class soru01_Modulus {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("4basamakli tamsayi girin: ");
        int num=scan.nextInt();
        int sum=0;

        sum=sum+num%10;
        num=num/10;

        sum=sum+num%10;
        num=num/10;

        sum=sum+num%10;
        num=num/10;

        sum=sum+num%10;
        num=num/10;

        System.out.println(num);
        System.out.println(sum);
    }
}
