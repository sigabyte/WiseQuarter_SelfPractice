package Practice_VariablesScanner;

import java.util.Scanner;

public class Pr06 {
    public static void main(String[] args) {
        //Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir tam sayi girin: ");
        int num1= scan.nextInt();
        System.out.println("bir tam sayi daha girin: ");
        int num2= scan.nextByte();
        int num3;

        num3=num2;
        num2=num1;
        num1=num3;

        System.out.println("ilk giridiginiz sayi ikinciye atandi: " + " " + num1);
        System.out.println("Ikinci girdiginiz sayi birinciye atandi: " + " " + num2);
    }
}
