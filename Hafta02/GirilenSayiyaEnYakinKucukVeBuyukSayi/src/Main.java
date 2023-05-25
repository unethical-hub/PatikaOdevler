import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] list = {56, 34, 1, 8, 101, -2, -33};
        int n = list.length;
        System.out.print("Lütfen diziye eklemek istediğiniz sayıyı giriniz : ");
        int x = sc.nextInt();

        list = addX(n, list, x);
        findLoverHigher(list, x);


    }

    // Diziye eleman ekleme
    public static int[] addX(int n, int arr[], int x) {
        int i;

        // n+1 boyutlu yeni bir dizi
        int newArr[] = new int[n + 1];

        /* eski dizideki elemanları yeni diziye ekle
        n'ye kadar tüm elemanları ekle
        sonra x'i n+1'e ekle */
        for (i = 0; i < n; i++)
            newArr[i] = arr[i];

        newArr[n] = x;

        return newArr;
    }

    public static void findLoverHigher(int arr[], int x) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //girilen sayının index'ini buluyoruz.
        int index = Arrays.binarySearch(arr, x);
        int length = arr.length;

        if (index == 0) {
            System.out.println("Girilen Sayı : " + arr[index]);
            System.out.println("Girilen sayıdan büyük en yakın sayı : " + arr[index + 1]);
            System.out.println("Dizideki en küçük sayı girilen sayıdır : " + arr[index]);
        } else if (index == length - 1) {
            System.out.println("Girilen Sayı : " + arr[index]);
            System.out.println("Girilen sayıdan küçük en yakın sayı : " + arr[index - 1]);
            System.out.println("Dizideki en büyük sayı girilen sayıdır : " + arr[index]);
        } else {
            System.out.println("Girilen Sayı : " + arr[index]);
            System.out.println("Girilen sayıdan küçük en yakın sayı : " + arr[index - 1]);
            System.out.println("Girilen sayıdan küçük en yakın sayı : " + arr[index + 1]);
        }

    }
}