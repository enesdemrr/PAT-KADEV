import java.util.Scanner;

public class HipotenusBul {
    public static void main(String[] args) {
        int a,b;
        double c;
        Scanner inp = new Scanner(System.in);
        System.out.print("1. Kenari girin: ");
        a = inp.nextInt();
        System.out.print("2. Kenari girin: ");
        b = inp.nextInt();
        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenus = "+c);
    }
}
