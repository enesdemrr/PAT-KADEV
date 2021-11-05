import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        float armut =2.14f;
        float elma = 3.67f;
        float domates = 1.11f;
        float muz = 0.95f;
        float patlıcan = 5.00f;
        int a,e,d,m,p;
        Scanner inp = new Scanner(System.in);
        System.out.print("Armut Kac kilo: ");
        a = inp.nextInt();
        System.out.print("Elma Kac kilo: ");
        e = inp.nextInt();
        System.out.print("Domates Kac kilo: ");
        d = inp.nextInt();
        System.out.print("Muz Kac kilo: ");
        m = inp.nextInt();
        System.out.print("patlican Kac kilo: ");
        p = inp.nextInt();
        armut *= a;
        elma *= e;
        domates *= d;
        muz *= m;
        patlıcan *= p;
        System.out.println("Toplam tutar: "+ (armut+elma+domates+muz+patlıcan));
    }
}
