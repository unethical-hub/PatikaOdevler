import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,r,nFak=1,rFak=1,gap,gapFak=1,total=0;

        System.out.print("C(n,r) n değerini giriniz: ");
        n = sc.nextInt();
        System.out.print("C(n,r) r değerini giriniz: ");
        r = sc.nextInt();
        if(n>r) {
            gap = n - r;
            for (int i = 1; i <= n; i++) {
                nFak *= i;
            }
            for (int i = 1; i <= r; i++) {
                rFak *= i;
            }
            for (int i = 1; i <= gap; i++) {
                gapFak *= i;
            }
            total = nFak/(rFak*(gapFak));

            System.out.println(n+" sayısının "+r+" kombinasyonu = "+total);
        }
        else
            System.out.println("N değerinin R'den büyük olması gerekiyor.");

    }
}
