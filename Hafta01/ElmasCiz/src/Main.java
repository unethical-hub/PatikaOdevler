import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int starNumber, upStarNumber, spaceNumber, iteration;
        System.out.println("Lütfen elmasın olacağı büyüklüğü giriniz: ");
        Scanner sc = new Scanner(System.in);
        starNumber = sc.nextInt();

        //Elmas'ın daha düzgün bir görüntüye sahip olması için çift sayıları kaldırdık.
        if (starNumber % 2 == 0) {
            starNumber = starNumber -1;
        }

        //Belirli bir boyutta olması için alt sınır belirledik.
        if (starNumber >= 7) {
            //Elmas'ın orta uzunluğuna göre üst başlangıç uzunluğunu belirledik.
            upStarNumber = starNumber / 2;
            //Yine Düzgün bir görüntü olması için(tek sayı üzerinden gittiğimiz için) böyle bir işlem yaptık.
            if(upStarNumber%2==0)
                upStarNumber+=1;
            spaceNumber = (starNumber - upStarNumber) / 2;
            iteration = spaceNumber;
            // Elmasın üst yarısı için döngü
            for (int i = 1; i <= iteration; i++) {
                for (int j = 1; j <= spaceNumber; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= upStarNumber; j++) {
                    System.out.print("*");
                }
                System.out.print("\n");
                spaceNumber--;
                upStarNumber += 2;
            }

            //Elmasın alt yarısı için döngü
            for (int i = starNumber; i >= 1; i -= 2) {
                for (int j = 1; j <= spaceNumber; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.print("\n");
                spaceNumber++;
            }
        }
        else
            System.out.println("Daha büyük bir sayı giriniz.");
    }
}


