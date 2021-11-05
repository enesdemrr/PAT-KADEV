import java.util.Scanner;

public class KitleIndeks {
    public static void main(String[] args) {
        double boy,kilo;
        double kitleindeksi;
        Scanner inp = new Scanner(System.in);
        System.out.print("Boyunuzu (metre cinsinde) giriniz: ");
        boy = inp.nextDouble();
        System.out.print("Kilonuzu giriniz: ");
        kilo = inp.nextDouble();
        kitleindeksi = kilo / (boy*boy) ;
        System.out.println(kitleindeksi);

    }
}
