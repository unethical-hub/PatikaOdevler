import java.util.Scanner;

public class Main {
    static void recursiveMetod(int n) {
        if (n <= 0) {
            System.out.println(n + " ");
            recursiveMetod(n + 5);
        } else {
            System.out.println(n + " ");
            recursiveMetod(n - 5);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = sc.nextInt();
        recursiveMetod(number);
    }
}