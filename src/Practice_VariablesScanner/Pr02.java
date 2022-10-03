package Practice_VariablesScanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Pr02 {
    public static void main(String[] args) {
        //Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin. Isminiz : John
        //Soyisminiz : Doe
        //Yasiniz : 44
        //Kaydiniz basariyla tamamlanmistir.

        Scanner scan = new Scanner(System.in);
        System.out.println("adinizi grin: ");
        String name= scan.nextLine();
        System.out.println("Soyadinizi giriniz: ");
        String sname=scan.nextLine();
        System.out.println("yasinizi girin: ");
        double age= scan.nextDouble();

        System.out.println("Isminiz: " + name);
        System.out.println("Soyisminiz: " + sname);
        System.out.println("Yasiniz: "+ age);

        System.out.println("kaydiniz basari ile tamamlanmistir:");
    }
}
