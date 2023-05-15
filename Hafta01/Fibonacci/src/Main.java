import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int fibonacci,firstNumber=0,secondNumber=1;
        System.out.print("Fibonacci serisinin eleman sayısını giriniz: ");
        int iteration=sc.nextInt();

        System.out.print(firstNumber+" ");
        for(int i=2;i<=iteration;i++)
        {
            fibonacci=firstNumber+secondNumber;
            System.out.print(fibonacci+ " ");
            firstNumber=secondNumber;
            secondNumber=fibonacci;
        }

    }
}