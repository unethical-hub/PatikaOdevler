import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz :");
        int number = sc.nextInt();
        int tempNumber, total = 0, counter = 0;
        tempNumber=number;
        while (tempNumber != 0) {
            tempNumber /= 10;
            counter++;
        }
        tempNumber=number;
        for (int i = 1; i <= counter; i++) {
            total += tempNumber % 10;
            tempNumber = tempNumber / 10;
            System.out.println(i+ " "+tempNumber);
        }

        System.out.println(number+" sayısının basamak sayılarının toplamı ="+ total);

    }
}
