package ders03_Sorular;

import java.util.Scanner;

public class soru02 {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.print("bir  harf girin: ");
        char letter = scan.next().charAt(0);

        System.out.println((char)(letter+1) +" " + (char)(letter+2) + " " + (char)(letter+3));

    }
}
