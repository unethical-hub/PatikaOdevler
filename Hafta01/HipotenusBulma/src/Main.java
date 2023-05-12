/*
    İki dik kenarı verilen üçgenin hipotenüsünü bulma
 */

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kenar1, kenar2;
        double hipo;

        System.out.println("Lütfen iki dik kenarı peş peşe giriniz.");

        kenar1=sc.nextInt();
        kenar2=sc.nextInt();

        hipo = Math.sqrt(kenar1*kenar1 +kenar2*kenar2);
        System.out.println("Hipotenüs Uzunluğu = " + hipo);

        System.out.println();
    }
}
