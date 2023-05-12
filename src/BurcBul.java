import java.util.Scanner;

public class BurcBul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Kaçıncı ayda doğdunuz?: ");
        int month = sc.nextInt();
        System.out.println("Hangi gün doğdunuz?: ");
        int day = sc.nextInt();

        if (month == 1)
        {
            if(day>=1 && day<=31)
            {
                if (day<=21)
                    System.out.println("Oğlak burcusunuz.");
                else
                    System.out.println("Kova burcusunuz.");
            }
        }
        if (month == 2)
        {
            if(day>=1 && day<=31)
            {
                if (day<=19)
                    System.out.println("Kova burcusunuz.");
                else
                    System.out.println("Balık burcusunuz.");
            }
        }
        if (month == 3)
        {
            if(day>=1 && day<=31)
            {
                if (day<=20)
                    System.out.println("Balık burcusunuz.");
                else
                    System.out.println("Koç burcusunuz.");
            }
        }
        if (month == 4)
        {
            if(day>=1 && day<=31)
            {
                if (day<=20)
                    System.out.println("Koç burcusunuz.");
                else
                    System.out.println("Boğa burcusunuz.");
            }
        }
        if (month == 5)
        {
            if(day>=1 && day<=31)
            {
                if (day<=21)
                    System.out.println("Boğa burcusunuz.");
                else
                    System.out.println("İkizler burcusunuz.");
            }
        }
        if (month == 6)
        {
            if(day>=1 && day<=31)
            {
                if (day<=22)
                    System.out.println("İkizler burcusunuz.");
                else
                    System.out.println("Yengeç burcusunuz.");
            }
        }
        if (month == 7)
        {
            if(day>=1 && day<=31)
            {
                if (day<=22)
                    System.out.println("Yengeç burcusunuz.");
                else
                    System.out.println("Aslan burcusunuz.");
            }
        }
        if (month == 8)
        {
            if(day>=1 && day<=31)
            {
                if (day<=22)
                    System.out.println("Aslan burcusunuz.");
                else
                    System.out.println("Başak burcusunuz.");
            }
        }
        if (month == 9)
        {
            if(day>=1 && day<=31)
            {
                if (day<=22)
                    System.out.println("Başak burcusunuz.");
                else
                    System.out.println("Terazi burcusunuz.");
            }
        }
        if (month == 10)
        {
            if(day>=1 && day<=31)
            {
                if (day<=22)
                    System.out.println("Terazi burcusunuz.");
                else
                    System.out.println("Akrep burcusunuz.");
            }
        }
        if (month == 11)
        {
            if(day>=1 && day<=31)
            {
                if (day<=21)
                    System.out.println("Akrep burcusunuz.");
                else
                    System.out.println("Yay burcusunuz.");
            }
        }
        if (month == 12)
        {
            if(day>=1 && day<=31)
            {
                if (day<=21)
                    System.out.println("Yay burcusunuz.");
                else
                    System.out.println("Oğlak burcusunuz.");
            }
        }


    }
}
