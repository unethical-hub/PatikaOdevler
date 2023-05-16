import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Taban değerini giriniz: ");
        int base = scanner.nextInt();
        System.out.print("Üs değerini giriniz: ");
        int exponent = scanner.nextInt();

        int sonuc = power(base, exponent);
        System.out.println(base + "^" + exponent + " = " + sonuc);
    }

    public static int power(int base, int exponent) {
        if(exponent == 0) {
            return 1;
        } else {
            return base * power(base, exponent-1);
        }
    }

}