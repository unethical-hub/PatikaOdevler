import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        int point= sc.nextInt();
        int counter=0,sum=0;
        double average=0;
        for(int i=1;i<=point;i++)
        {
            if(i%3 == 0 && i%4 == 0)
            {
                sum+=i;
                counter++;
            }
        }
        if(counter>0)
            average= sum/counter;
        System.out.println("Girdiğiniz sayıya kadar 3 ve 4'e tam bölünen sayıların toplamı: "+sum);
        System.out.println("Girdiğiniz sayıya kadar 3 ve 4'e tam bölünen sayıların ortalaması: "+average);

    }
}
