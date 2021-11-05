import java.util.Scanner;

public class KdvHesap {
    public static void main(String[] args) {
        float fiyat,kdvFiyat;
        Scanner inp = new Scanner(System.in);
        System.out.print("Ürünün Fiyatını girinl: ");
        fiyat = inp.nextFloat();
        kdvFiyat = fiyat + (fiyat * 18)/100;
        System.out.println("Kdv'li fiyat: "+ kdvFiyat);
    }
}
