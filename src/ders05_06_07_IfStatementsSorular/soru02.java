package ders05_06_07_IfStatementsSorular;

import java.util.Scanner;

public class soru02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir harf girin : ");
        char hrf=scan.next().charAt(0);

        if (hrf=='o' || hrf=='O'){
            System.out.println("Ocak ayi");
        }

        if (hrf=='s' || hrf=='S'){
            System.out.println("Subat ayi");
        }
        if (hrf=='m' || hrf=='M'){
            System.out.println("Mart veya Mayis ayi");
        }
        if (hrf=='n' || hrf=='N'){
            System.out.println("Nisan ayi");
        }
        if (hrf=='h' || hrf=='H'){
            System.out.println("Haziran ayi");
        }
        if (hrf=='t' || hrf=='T'){
            System.out.println("Temmuz ayi");
        }
        if (hrf=='a' || hrf=='A'){
            System.out.println("Agustos veya Aralik ayi");
        }
        if (hrf=='e' || hrf=='E'){
            System.out.println("Eylul veya Ekim ayi");
        }
        if (hrf=='k' || hrf=='K'){
            System.out.println("Kasim ayi");
        }

    }

}
