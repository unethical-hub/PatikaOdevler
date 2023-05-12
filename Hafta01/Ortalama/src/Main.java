/*
Not Ortalaması Hesaplayan Program

Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.

Ödev
Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.

Not : If ve Else kullanılmayacak...
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Matematik sınav puanınızı girin: ");
        int mat = scanner.nextInt();

        System.out.print("Fizik sınav puanınızı girin: ");
        int fizik = scanner.nextInt();

        System.out.print("Kimya sınav puanınızı girin: ");
        int kimya = scanner.nextInt();

        System.out.print("Türkçe sınav puanınızı girin: ");
        int turkce = scanner.nextInt();

        System.out.print("Tarih sınav puanınızı girin: ");
        int tarih = scanner.nextInt();

        System.out.print("Müzik sınav puanınızı girin: ");
        int muzik = scanner.nextInt();

        int toplam = mat + fizik + kimya + turkce + tarih + muzik;
        double ortalama = toplam / 6.0;

        System.out.println("Ortalamanız: " + ortalama);

        // Ortalama kontrolü
        String sonuc = (ortalama >= 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";

        System.out.println(sonuc);
    }
}
