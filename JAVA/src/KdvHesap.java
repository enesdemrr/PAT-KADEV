import java.util.Scanner;

public class KdvHesap {
    public static void main(String[] args) {
        float fiyat,kdvFiyat;
        float kdv= 0.18f;
        Scanner inp = new Scanner(System.in);
        System.out.print("Ürünün Fiyatını girin: ");
        fiyat = inp.nextFloat();
        kdvFiyat = fiyat + (fiyat * kdv);
        System.out.println("Kdv'siz fiyat: "+ fiyat);
        System.out.println("Kdv orani: %"+ kdv*100);
        System.out.println("Kdv'li fiyat: "+ kdvFiyat);
    }
}
