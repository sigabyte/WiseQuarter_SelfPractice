package Practice_VariablesScanner;

import java.util.Scanner;

public class Pr05 {
    public static void main(String[] args) {
        //Kullanicidan bir cemberin yaricapini alip, cevresini ve alanini yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("cemberin yari capini girin: ");
        float r=scan.nextFloat();
        double pi=3.14;
        System.out.println("Cemberin yari capi: " + " " + (2*pi*r));
        System.out.println("Cemberin alani: " + " " + (pi*(r*r)));
    }
}
