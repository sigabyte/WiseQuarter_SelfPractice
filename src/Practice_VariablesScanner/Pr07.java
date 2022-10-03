package Practice_VariablesScanner;

import java.util.Scanner;

public class Pr07 {
    public static void main(String[] args) {
        //Kullanicidan iki sayi alip, ucuncu bir degisken kullanmadan ikisinin degerlerini degistirin(swap).

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir tam sayi girin: ");
        int num1= scan.nextInt();
        System.out.println("bir tam sayi daha girin: ");
        int num2= scan.nextInt();

        num2=num1+num2;
        num1=num2-num1;
        num2=num2-num1;

        System.out.println("ilk giridiginiz sayi ikinciye atandi: " + " " + num1);
        System.out.println("Ikinci girdiginiz sayi birinciye atandi: " + " " + num2);


    }
}
