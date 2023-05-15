import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen üçgenin basamak sayısını giriniz: ");
        int basamakSayisi=sc.nextInt();
        int starNumber=(basamakSayisi*2)-1;

        int spaceNumber=0;


        for(int k=1;k<=basamakSayisi;k++) {
            for (int j = 1; j <= spaceNumber; j++)
                System.out.print(" ");
            for (int i = 1; i <= starNumber; i++) {
                System.out.print("*");
            }
            System.out.println("");
            spaceNumber++;
            starNumber-=2;
        }
    }
}
