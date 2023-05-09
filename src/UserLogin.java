import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userName, password, tempPassword, wrongPassword, permaPass = "123456", id = "anilgulbas";
        String control;
        System.out.print("Lütfen kullanıcı adını giriniz: ");
        userName = sc.nextLine();
        System.out.print("Lütfen şifrenizi giriniz: ");
        password = sc.nextLine();

        //id-pw kombinasyonu eşleşiyorsa giriş yapılır.
        if (userName.equals(id) && password.equals(permaPass)) {
            System.out.println("Giriş yapıldı.");
        } else {
            wrongPassword = password;
            System.out.print("Şifreniz yanlış. Şifrenizi değiştirmek ister misiniz?\nEvet/Hayir :");
            control = sc.nextLine();

            //
            if (control.equals("Evet") || control.equals("evet")) {
                System.out.print("Yeni şifrenizi, eski şifrenizden farklı giriniz:");
                while (control.equals("Evet") || control.equals("evet")) {
                    tempPassword = sc.nextLine();
                    if (tempPassword.equals(wrongPassword) || tempPassword.equals(permaPass)) {
                        System.out.print("Benzer şifre girdiniz. Şifreniz güncellenemedi.\nLütfen farklı bir şifre giriniz: ");

                    } else {
                        permaPass = tempPassword;
                        System.out.println("Yeni şifreniz başarıyla oluşturuldu.");
                        control = "Hayir";
                    }
                }

            } else
                System.out.println("Program kapatıldı.");

        }

    }
}
