/*
     "Vücut Kitle İndeks" değerini hesaplayan program
 */

import java.util.Scanner;

public class VucutKitleEndeksi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double vucutKitleIndeksi, boy;
        int kilo;

        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz : ");
        boy = scan.nextDouble();

        System.out.print("Lütfen kilonuzu (kg cinsinden) giriniz : ");
        kilo = scan.nextInt();

        vucutKitleIndeksi = kilo / (boy * boy);

        System.out.println("Vücut Kitle İndeksiniz : " + vucutKitleIndeksi);

    }
}