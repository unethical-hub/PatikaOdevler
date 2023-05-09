import java.util.Scanner;

public class SinifGecmeDurumu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matematik, fizik, kimya, muzik, turkce, count=0, sum=0;

        System.out.println("Matematik notunuz: ");
        matematik = sc.nextInt();
        if(matematik<0 || matematik>100)
        {
            sum+=matematik;
            count++;
        }
        System.out.println("Kimya notunuz: ");
        kimya = sc.nextInt();
        if(kimya<0 || kimya>100)
        {
            sum+=kimya;
            count++;
        }
        System.out.println("Müzik notunuz: ");
        muzik = sc.nextInt();
        if(muzik<0 || muzik>100)
        {
            sum+=muzik;
            count++;
        }
        System.out.println("Türkçe notunuz: ");
        turkce = sc.nextInt();
        if(turkce<0 || turkce>100)
        {
            sum+=turkce;
            count++;
        }
        System.out.println("Fizik notunuz: ");
        fizik = sc.nextInt();
        if(fizik<0 || fizik>100)
        {
            sum+=fizik;
            count++;
        }

        double average = sum/count;
        if (average>55)
            System.out.println("Tebrikler. Sınıfı "+average+" puanla geçtiniz.");
        else
            System.out.println("Sınıfta kaldınız. Ortalamanız :"+average);





    }
}
