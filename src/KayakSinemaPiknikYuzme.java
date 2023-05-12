import java.util.Scanner;
        public class KayakSinemaPiknikYuzme {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen sıcaklık değerini giriniz: ");
        int heat;
        heat = sc.nextInt();

        if(heat>25)
            System.out.println("Yüzmeye gidebilirsiniz.");
        else if (heat >15)
            System.out.println("Piknik yapmaya gidebilirsiniz.");
        else if(heat > 5)
            System.out.println("Sinemaya gidebilirsiniz.");
        else
            System.out.println("Kayak yapmak için mükemmel bir hava.");
    }
}
