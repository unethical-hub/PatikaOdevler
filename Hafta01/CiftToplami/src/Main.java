import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tek bir sayı girene kadar sayı girmeye devam edeceksiniz.");
        int i =0,entry,sum2=0,sum4=0;
        while(i<1)
        {
            System.out.print("Lütfen sayınızı giriniz: ");
            entry = sc.nextInt();
            if(entry%2==1)
                i=1;
            else
            {
                sum2+=entry;
                if(entry%4==0)
                    sum4+=entry;
            }
        }
        System.out.println("Şu ana girdiğiniz sayılardan 2'ye tam bölünen sayıların toplamı : "+sum2);
        System.out.println("Şu ana girdiğiniz sayılardan 4'e tam bölünen sayıların toplamı : "+sum4);
    }
}
