import java.util.Scanner;

public class DaireDilimiAlan {
    public static void main(String[] args) {
        final float PI = 3.14f;
        int r,a;
        double sonuc;
        Scanner inp = new Scanner(System.in);
        System.out.print("Dairenin yari capini girin : ");
        r = inp.nextInt();
        System.out.print("Merkez Aci olcusunu girin:");
        a = inp.nextInt();
        sonuc = (PI * (r*r) * a)/360;
        System.out.println("Daire diliminin alani : " + sonuc);
    }
}
