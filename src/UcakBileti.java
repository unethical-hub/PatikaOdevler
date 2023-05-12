import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double perKm = 0.10, totalPrice;
        int flightType, distance, age;
        System.out.print("Lütfen uçuş tipinizi seçiniz(1=>Tek Yön, 2=>Gidiş-Dönüş): ");
        flightType = sc.nextInt();

        System.out.print("Lütfen mesafeyi km cinsinden giriniz: ");
        distance = sc.nextInt();
        System.out.print("Lütfen yaşınızı giriniz: ");
        age = sc.nextInt();
        if (age < 0 || distance < 0)
            System.out.println("Hatalı değer girdiniz!!!");
        else {
            totalPrice=perKm*distance;

            //yaşa göre yapılan indirimler
            if(age<12)
                totalPrice*=0.5;
            else if(age<25)
                totalPrice*=0.9;
            else if(age>65)
                totalPrice*=0.7;

            //uçuş tipine göre yapılan indirim
            switch (flightType) {
                case 1:
                    System.out.println("Toplam Tutar = "+totalPrice+" TL");
                    break;
                case 2:
                    totalPrice= (totalPrice*0.8)*2;
                    System.out.println("Toplam Tutar = "+totalPrice+" TL");
                    break;
                default:
                    System.out.println("Hatalı değer girdiniz.");
            }
        }


    }
}