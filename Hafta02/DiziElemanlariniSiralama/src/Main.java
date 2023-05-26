import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dizinin boyutu n : ");
        int length = sc.nextInt();
        int[] arr = new int[length];
        System.out.print("Dizinin elemanlarını giriniz : \n");
        for (int i=0 ; i<length ; i++)
        {
            System.out.print((i+1)+". Elemanı : ");
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        System.out.println("Sıralama : "+ Arrays.toString(arr));

    }
}