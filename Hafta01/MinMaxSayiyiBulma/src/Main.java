import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kaç adet sayı girmek istersiniz? :");
        int entryNumber = sc.nextInt();

        int minNumber, maxNumber, number;

        //Min ve Max değerlerimizi atamadan koşula sokamayacağımız için ilk girdiğimiz sayıyı direkt olarak bu değerlere atıyoruz.
        System.out.print("Lütfen 1. sayıyı giriniz: ");
        number = sc.nextInt();
        maxNumber = number;
        minNumber = number;

        for (int i = 2; i <= entryNumber; i++) {
            System.out.print("Lütfen " + i + ". sayıyı giriniz: ");
            number = sc.nextInt();
            if (number > maxNumber) {
                maxNumber = number;
                System.out.println("En büyük sayı değişti.");
            } else if (number < minNumber) {
                minNumber = number;
                System.out.println("En küçük sayı değişti.");
            }

        }

        System.out.println("En büyük sayı = " + maxNumber);
        System.out.println("En küçük sayı = " + minNumber);

    }

}