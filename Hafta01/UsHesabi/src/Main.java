import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total=1;
        System.out.print("Üssü alınacak sayıyı giriniz: ");
        int number = sc.nextInt();
        System.out.print("Üs olacak sayıyı giriniz: ");
        int power = sc.nextInt();

        for (int i=1;i<=power;i++)
        {
            total*=number;
        }
        System.out.println(number+"^"+power +" = " + total);
    }
}
