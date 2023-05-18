import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Bir sayi giriniz: ");
        int number = sc.nextInt();

        if(asalMi(number, 2)){
            System.out.println(number + " asaldir.");
        }else{
            System.out.println(number + " asal degildir.");
        }
    }

    public static boolean asalMi(int number, int divider){

        if(number == 2){
            return true;
        }

        if(number == 1 || number % divider == 0){
            return false;
        }

        if(divider > Math.sqrt(number)){
            return true;
        }

        return asalMi(number, divider+1);
    }
}