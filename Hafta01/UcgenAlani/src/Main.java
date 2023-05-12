/*
    Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan program
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double Alan,u;
        int a,b,c;
        System.out.print("1. Kenar uzunluğunu giriniz.");
        a = sc.nextInt();
        System.out.print("2. Kenar uzunluğunu giriniz.");
        b = sc.nextInt();
        System.out.print("3. Kenar uzunluğunu giriniz.");
        c = sc.nextInt();

        u = (a+b+c)/2;

        Alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("Üçgenin alanı = " + Alan);

    }
}
