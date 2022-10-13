package ders05_06_07_IfStatementsSorular;

import java.util.Scanner;

public class soru9 {
    public static void main(String[] args) {
        /*
        not 85 ve ustu AA
        65 ve ustu is BB
        50 ve ustu is CC
        geriye kalanlar DD
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Notunuzu girin : ");
        double not= scan.nextDouble();

        if (not>=85){
            System.out.println("notunuz AA");
        } else if (not<85 && not>=65) {
            System.out.println("notunuz BB");
        } else if (not<65 && not>=50) {
            System.out.println("notunuz CC");
        }else {
            System.out.println("notunuz DD");
        }
    }
}
