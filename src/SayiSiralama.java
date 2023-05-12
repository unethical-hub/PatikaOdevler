import java.util.Scanner;

//girilen üç adet sayıyı küçükten büyüğe sıralar.
public class SayiSiralama   {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.print("Lütfen birinci sayiyi giriniz: ");
        a = sc.nextInt();
        System.out.print("Lütfen ikinci sayiyi giriniz: ");
        b = sc.nextInt();
        System.out.print("Lütfen üçüncü sayiyi giriniz: ");
        c = sc.nextInt();

        if(a>b && a>c)
            if(b>c)
                System.out.println("c < b < a");
                else
                System.out.println("b < c < a");
        if(b>a && b>c)
            if(a>c)
                System.out.println("c < a < b");
            else
                System.out.println("a < c < b");
        if(c>a && c>b)
            if(a>b)
                System.out.println("b < a < c");
            else
                System.out.println("a < b < c");

    }
}
