package ders05_06_07_IfStatementsSorular;

import java.util.Scanner;

public class soru8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir harf girin : ");
        char hrf=scan.next().charAt(0);

        if (hrf>='a' && hrf<='z'){
            System.out.println((char)(hrf-32));
        }else{
            System.out.println(hrf);
        }
    }
}
