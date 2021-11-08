import java.util.Scanner;

public class SinifGecme {
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
        if( mat<0 || mat>100 ){
            mat = 0;
        }
        if(fizik < 0 || fizik>100){
            fizik = 0;
        }
        if(kimya<0 || kimya>100){
            kimya = 0;
        }
        if(muzik<0 || muzik>100){
            muzik = 0;
        }
        if(turkce<0 || turkce>100){
            turkce = 0;
        }
        if(tarih<0 || tarih>100){
            tarih = 0;
        }
        ort = (float) (mat+fizik+kimya+turkce+tarih+muzik)/6;
        System.out.println("Ortalamaniz = " + ort);
        if (ort<=55){
            System.out.println("Sinifta kaldiniz");
        }
        else{
            System.out.println("Gectiniz");
        }
    }
}
