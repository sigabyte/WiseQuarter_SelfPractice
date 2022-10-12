package ders05_06_07_IfStatementsSorular;

import java.util.Scanner;

public class soru5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir harf girin : ");
        char hrf=scan.next().charAt(0);

        if (hrf>='A' && hrf<='Z'){
            System.out.println("Buyuk harf");
        }else{
            System.out.println("Buyuk harf degil!");
        }
    }
}
