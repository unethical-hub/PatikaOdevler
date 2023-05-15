import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kontrol edilmesini istediğiniz sayıyı girin: ");
        int number=sc.nextInt();
        int total=0;
        for(int i=1;i<number;i++){
            if(number%i==0)
                total+=i;
        }
        if(total==number)
        {
            System.out.println("Girdiğiniz sayı ("+number+") bir mükemmel sayıdır.");
        }
        else
            System.out.println("Girdiğiniz sayı ("+number+") bir mükemmel sayı değildir.");
    }
}