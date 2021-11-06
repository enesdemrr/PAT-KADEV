import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int a,b;
        Scanner inp = new Scanner(System.in);

        while(true) {
            System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme\n5-Cikis");
            int select = inp.nextInt();
            switch (select) {
                case 1:
                    System.out.print("ilk sayiyi girin: ");
                    a = inp.nextInt();
                    System.out.print("ikinci sayiyi girin: ");
                    b = inp.nextInt();
                    System.out.println("Toplama sonucu=" + (a + b));
                    System.out.println("**************************");
                    break;
                case 2:
                    System.out.print("ilk sayiyi girin: ");
                    a = inp.nextInt();
                    System.out.print("ikinci sayiyi girin: ");
                    b = inp.nextInt();
                    System.out.println("Cikarma sonucu=" + (a - b));
                    System.out.println("**************************");
                    break;
                case 3:
                    System.out.print("ilk sayiyi girin: ");
                    a = inp.nextInt();
                    System.out.print("ikinci sayiyi girin: ");
                    b = inp.nextInt();
                    System.out.println("Carpma sonucu=" + (a * b));
                    System.out.println("**************************");
                    break;
                case 4:
                    System.out.print("ilk sayiyi girin: ");
                    a = inp.nextInt();
                    System.out.print("ikinci sayiyi girin: ");
                    b = inp.nextInt();
                    System.out.println("Toplama sonucu=" + (a / b));
                    System.out.println("**************************");
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Gecerli bir deger giriniz");
                    break;
            }
        }
    }
}
