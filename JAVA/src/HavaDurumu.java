import java.util.Scanner;

public class HavaDurumu {
    public static void main(String[] args) {
        int heat;
        Scanner inp = new Scanner(System.in);
        System.out.print("Hava Sicakligini girin:");
        heat = inp.nextInt();
        if(heat <5){
            System.out.println("Kayak yapabilirsiniz");
        }
        else if(heat >= 5 && heat < 15){
            System.out.println("Sinemaya gidebilirsiniz");
        }
        else if(heat >= 15 && heat <25){
            System.out.println("Piknik yapabilirsiniz");
        }
        else{
            System.out.println("Yuzmeye gidebilirsiniz");
        }
    }
}
