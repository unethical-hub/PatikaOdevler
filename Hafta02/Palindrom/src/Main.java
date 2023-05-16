import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Palindrom olup olmadığını kontrol etmek istediğiniz sayıyı giriniz: ");
        int entry = sc.nextInt();
        isPalindrom(entry);
    }

    static void isPalindrom(int number) {
        int tempNumber = number, reverseNumber = 0, lastNumber;
        while (tempNumber != 0) {
            lastNumber = tempNumber % 10;
            reverseNumber = reverseNumber * 10 + lastNumber;
            tempNumber /= 10;
        }
        if (number == reverseNumber)
            System.out.println("Girdiğiniz "+ number+" sayısı palindromdur.");
        else
            System.out.println("Girdiğiniz "+ number+" sayısı palindrom değildir.");

    }
}