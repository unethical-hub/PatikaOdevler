import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int selection, n1, n2, result = 0;

        System.out.println("Lütfen ilk sayıyı giriniz.");
        n1 = sc.nextInt();
        System.out.println("Lütfen ikinci sayıyı giriniz.");
        n2 = sc.nextInt();
        System.out.println("Lütfen yapmak istediğiniz işlemin numarasını giriniz.");
        System.out.println("1-Toplama\n2-Çıkartma\n3-Çarpma\n4-Bölme");
        selection = sc.nextInt();

        switch (selection) {
            case 1:
                result = n1 + n2;
                break;
            case 2:
                result = n1 - n2;
                break;
            case 3:
                result = n1 * n2;
                break;
            case 4:
                result = n1 / n2;
                break;
            default:
                System.out.println("Yanlış bir işlem numarası girdiniz. Lütfen seçiminizi 1 ile 4 arasında yapınız.");
        }
        System.out.println("Sonuç = " + result);
    }
}
