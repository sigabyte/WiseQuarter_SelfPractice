package ders05_06_07_IfStatementsSorular;

import java.util.Scanner;

public class soru6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Yasinizi girininz: ");
        double yas=scan.nextDouble();

        if (yas>65){
            System.out.println("Emekli olabilirsiniz!");
        }else{
            System.out.println("Emekli olmaniza" + " " + (int)(65-yas) +" " + "yil daha var!");
        }

    }
}
