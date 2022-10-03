package Practice_VariablesScanner;

import java.util.Scanner;

public class Pr04 {
    public static void main(String[] args) {
        //Kullanicidan ismini, soyismini ve yasini alip asagidaki formatta yazdirin. girilen bilgiler : J Doe, 44

        Scanner scan =new Scanner(System.in);
        System.out.println("ISminizi girin: ");
        String name=scan.next();
        System.out.println("Soyisiminizi girin: ");
        String sname= scan.next();
        System.out.println("Yasinizi girin: ");
        float age=scan.nextFloat();

        System.out.println("girilen bilgiler: " + name + " " + sname + ", " + age);

        }
}
