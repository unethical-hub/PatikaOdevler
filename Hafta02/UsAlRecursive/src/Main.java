import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Taban değerini giriniz: ");
        int base = sc.nextInt();
        System.out.print("Üs değerini giriniz: ");
        int exponent = sc.nextInt();

        int result = power(base, exponent);
        System.out.println(base + "^" + exponent + " = " + result);
    }

    public static int power(int base, int exponent) {
        if(exponent == 0) {
            return 1;
        } else {
            return base * power(base, exponent-1);
        }
    }

}