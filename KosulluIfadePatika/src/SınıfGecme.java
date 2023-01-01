import java.util.Scanner;

public class SınıfGecme {
    public static void main(String[] args){
     int mat,fizik,turkce,kimya,muzik;
     Scanner inp = new Scanner(System.in);

     System.out.println("Matematik Notunuz: ");
     mat = inp.nextInt();

     System.out.println("fizik   Notunuz: ");
        fizik = inp.nextInt();

     System.out.println("turkce Notunuz: ");
        turkce = inp.nextInt();

     System.out.println("kimya Notunuz: ");
        kimya = inp.nextInt();

     System.out.println("muzik Notunuz: ");
        muzik = inp.nextInt();


        double avarage=(mat+fizik+turkce+kimya+muzik)/5;
        if(avarage <=55){
            System.out.println("Sınıfta Kaldınız seneye tekrar görüşmek üzere");


        }
        else{
            System.out.println("Tebrikler sınıfı geçtiniz !");

        }
        System.out.println("Ortalamanız : " + avarage);

    }
}
