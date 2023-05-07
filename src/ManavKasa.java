/*
    Alınan ürünlerin kg'ıma göre toplam tutar hesaplayan program.
 */
import java.text.DecimalFormat;
import java.util.Scanner;
public class ManavKasa {
    public static void main(String[] args) {
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00;
        double armutKilo,elmaKilo,domatesKilo,muzKilo,patlicanKilo, toplamTutar=0;
        Scanner sc = new Scanner (System.in);

        System.out.print("Armut kaç kilo ? :");
        armutKilo = sc.nextDouble();
        System.out.print("Elma kaç kilo ? :");
        elmaKilo = sc.nextDouble();
        System.out.print("Domates kaç kilo ? :");
        domatesKilo = sc.nextDouble();
        System.out.print("Muz kaç kilo ? :");
        muzKilo = sc.nextDouble();
        System.out.print("Patlıcan kaç kilo ? :");
        patlicanKilo = sc.nextDouble();

        toplamTutar = armut*armutKilo + elma*elmaKilo + domates*domatesKilo + muz*muzKilo + patlican*patlicanKilo;

        //Virgülden sonra 3 basamak göstermesi için kullanılan kod parçacığı
        DecimalFormat decimalFormat = new DecimalFormat(".###");
        String toplamTutarFormatted = decimalFormat.format(toplamTutar);

        System.out.println("Toplam Tutar = " + toplamTutarFormatted + " TL");
    }

}

