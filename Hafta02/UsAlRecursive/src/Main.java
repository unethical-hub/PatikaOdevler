import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Input'ların alındığı yer.
        Scanner sc = new Scanner(System.in);
        System.out.print("Taban değerini giriniz: ");
        int base = sc.nextInt();
        System.out.print("Üs değerini giriniz: ");
        int exponent = sc.nextInt();

        //Fonksiyona gönderilen yer.
        int result = power(base, exponent);
        System.out.println(base + "^" + exponent + " = " + result);
    }


    //2^5 örneğini verdiğimizde 2'yi 5 kere çarptıktan sonra döngünün 0 olmasıyla birlikte,
    //2*2*2*2*2 değerini 1 ile çarparak değeri döndürür.
    public static int power(int base, int exponent) {
        if(exponent == 0) {
            return 1;
        } else {
            return base * power(base, exponent-1);
        }
    }

}