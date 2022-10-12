package ders05_06_07_IfStatementsSorular;

import java.util.Scanner;

public class soru4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ucgenin kenar uzunluklarini girin : ");
        int edge1= scan.nextInt();
        int edge2= scan.nextInt();
        int edge3= scan.nextInt();

        if (edge1==edge2 && edge2==edge3){
            System.out.println("Bu bir eskenar ucgen");
        }

    }
}
