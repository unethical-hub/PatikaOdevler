import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen yıl giriniz: ");
        int year = sc.nextInt();
        if (year % 100 == 0) {
            if (year % 400 == 0)
                System.out.println(year + " bir artık yıldır!");
            else System.out.println(year + " bir artık yıl değildir!");
        } else {
            if (year % 4 == 0)
                System.out.println(year + " bir artık yıldır!");
            else System.out.println(year + " bir artık yıl değildir!");
        }
    }
}
