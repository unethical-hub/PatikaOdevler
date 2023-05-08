/*
    girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 ,
    tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı
 */

import java.util.Scanner;

public class KDVHESAP {

    public static void main(String[] args) {

        double fiyat, kdvOrani, kdvsizFiyat, kdvliFiyat, kdvTutari;

        Scanner sc = new Scanner(System.in);

        System.out.print("Ürün fiyatını giriniz: ");
        fiyat = sc.nextDouble();

        if (fiyat > 0 && fiyat <= 1000) {
            kdvOrani = 0.18;
        } else {
            kdvOrani = 0.08;
        }

        kdvsizFiyat = fiyat;
        kdvliFiyat = fiyat + (fiyat * kdvOrani);
        kdvTutari = kdvliFiyat - kdvsizFiyat;

        System.out.println("KDV'siz fiyat: " + kdvsizFiyat + " TL");
        System.out.println("kdvOrani = " + kdvOrani + " TL");
        System.out.println("KDV tutarı: " + kdvTutari + " TL");
        System.out.println("KDV'li fiyat: " + kdvliFiyat + " TL");

    }

}

