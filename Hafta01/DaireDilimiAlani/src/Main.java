/*
    Daire Diliminin Alanını hesaplayan program.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double pi = 3.14,r,alan,aci;

        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen hesaplamak istediğiniz çemberin yarıçapını giriniz: ");
        r = sc.nextDouble();
        System.out.print("Lütfen hesaplamak istediğiniz merkez açısını giriniz (0-360) : ");
        aci = sc.nextDouble();

        //Maksimum dilim kendisi olabilir.
        if(0.0<=aci && aci<=360.0)
        {
            alan = (pi * (r*r) * aci) / 360;

            System.out.println("alan = " + alan);
        }
        else
            System.out.println("Hatalı değer girdiniz");

    }
}
