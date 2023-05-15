import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ebob=1, ekok=1,biggerN;
        System.out.print("İlk sayıyı giriniz: ");
        int n1 = sc.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int n2 = sc.nextInt();
        if(n1>n2)
            biggerN=n1;
        else
            biggerN=n2;

        int i=biggerN;

        //en büyük ortak bölen
        while(i>=1)
        {
            if(n1%i==0 && n2%i==0)
            {
                ebob=i;
                System.out.println("Ebob= "+ebob);
                break;
            }
            i--;
        }

        //en küçük ortak kat
        i=biggerN;
        while(i<(n1*n2))
        {
            if(i%n1==0 && i%n2==0)
            {
                ekok=i;
                System.out.println("Ekok= "+ekok);
                break;
            }
            i++;
        }

    }
}