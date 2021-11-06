import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName, password;
        Scanner inp = new Scanner(System.in);
        System.out.print("Kullanici adini giriniz: ");
        userName = inp.nextLine();
        System.out.print("Sifrenizi giriniz:");
        password = inp.nextLine();
        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giris Yaptiniz");
        } else {
            System.out.println("Bilgileriniz yanlis");
            System.out.println("Sifrenizi degistirmek icin 1 e basin!!");
            int a = inp.nextInt();
            if (a == 1) {
                System.out.print("Yeni Sifrenizi girin:");
                password = inp.next();
                if (password.equals("java123")) {
                    System.out.println("Sifre olusturulamadi");
                } else {
                    System.out.println("Sifreniz Basariyla Degisti");
                }
            } else {
                return;
            }
        }

    }
}
