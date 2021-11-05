import java.util.Scanner;

public class NotOrtalaması {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;
        float ort;
        boolean gecti = true;
        boolean kaldi = false;
        Scanner inp = new Scanner(System.in);
        System.out.print("Matematik Notunuz: ");
        mat = inp.nextInt();
        System.out.print("Fizik Notunuz: ");
        fizik = inp.nextInt();
        System.out.print("Kimya Notunuz: ");
        kimya = inp.nextInt();
        System.out.print("Türkce Notunuz: ");
        turkce = inp.nextInt();
        System.out.print("Tarih Notunuz: ");
        tarih = inp.nextInt();
        System.out.print("Müzik Notunuz: ");
        muzik = inp.nextInt();
        ort = (mat+fizik+kimya+turkce+tarih+muzik)/6.f;
        System.out.println("Ortalamaniz = " + ort);
        boolean gec = (ort > 60) ;
        System.out.println(gec ? "Sınıfı Geçti" : "Sınıfta Kaldı");

    }
}
