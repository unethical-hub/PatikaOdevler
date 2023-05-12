import java.util.Scanner;

public class DortBesinKuvveti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hedef sayıyı giriniz: ");
        int point = sc.nextInt();
        System.out.print("4'ün katları: ");
        for(int i=1;i<=point;i*=4)
        {
            System.out.print(i +" ");
        }
        System.out.print("\n5'in katları: ");
        for(int i=1;i<=point;i*=5)
        {
            System.out.print(i +" ");
        }
    }
}
