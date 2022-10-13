package ders05_06_07_IfStatementsSorular;

import java.util.Scanner;

public class soru10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ucgenin kenar uzunluklarini girin : ");
        int edge1= scan.nextInt();
        int edge2= scan.nextInt();
        int edge3= scan.nextInt();

         if (edge1<=0 || edge2<=0 || edge3<=0) {
            System.out.println("gecersiz kenar uzunlugu!");
        }else if (edge1==edge2 && edge2==edge3){
            System.out.println("Bu bir eskenar ucgen");
        }else{
             System.out.println("Bu bir eskenar ucgen degildir");
         }
    }
}
