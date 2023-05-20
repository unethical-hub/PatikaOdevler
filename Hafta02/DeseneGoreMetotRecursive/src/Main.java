import java.util.Scanner;

public class Main {
    //
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int num = sc.nextInt();
        recursiveFunc(num);
    }
    public static void recursiveFunc(int num) {
        if (num <= 0) {
            System.out.print(num + " ");
            return;
        } else {
            System.out.print(num + " ");
            num -= 5;
            //Bu satıra geldiğinde fonksiyon geri dönüp çalışır ve
            // 0'dan düşük bir değer alana kadar aynı şekilde devam eder.
            recursiveFunc(num);

            //0'dan düşük bir değer aldıktan sonra(return olduktan sonra) bu satır çalışmaya başlar.
            num += 5;
            System.out.print(num + " ");
        }
    }
}