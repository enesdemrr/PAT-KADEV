import java.util.Scanner;

public class UcgenAlan {
    public static void main(String[] args) {
        int a,b,c;
        Scanner inp = new Scanner(System.in);
        System.out.print("1. Kenari girin: ");
        a = inp.nextInt();
        System.out.print("2. Kenari girin: ");
        b = inp.nextInt();
        System.out.print("3. Kenari girin: ");
        c = inp.nextInt();
        float u = (a+b+c)/2;
        float alan = (float) Math.sqrt(u * (u-a) * (u - b) * (u - c));
        System.out.println("Alan = "+ alan);
    }
}
