import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int satirSayisi, yildizSayisi, boslukSayisi, iteration;
        System.out.println("Lütfen bir sayı giriniz: ");
        Scanner sc = new Scanner(System.in);
        satirSayisi = sc.nextInt();
        if (satirSayisi % 2 == 0) {
            satirSayisi = satirSayisi - 1;
        }
        if (satirSayisi >= 4) {
            yildizSayisi = satirSayisi / 2;
            boslukSayisi = (satirSayisi - yildizSayisi) / 2;
            iteration = boslukSayisi;
            // Elmasın üst yarısı için döngü
            for (int i = 1; i <= iteration; i++) {
                for (int j = 1; j <= boslukSayisi; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= yildizSayisi; j++) {
                    System.out.print("*");
                }
                System.out.print("\n");
                boslukSayisi--;
                yildizSayisi += 2;
            }

            //Elmasın alt yarısı için döngü
            for (int i = satirSayisi; i >= 1; i -= 2) {
                for (int j = 1; j <= boslukSayisi; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.print("\n");
                boslukSayisi++;
            }
        }
    }
}


