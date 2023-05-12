import java.util.Scanner;

public class HarmonikSayi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = sc.nextInt();
        double result=0.0;

        for (double i=1;i<=number;i++)
        {
            result= result + 1/i;
        }

        System.out.println("Harmonik Seri ="+result);

    }
}
