import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args){
        int n1,n2;
        Scanner inp = new Scanner(System.in);


        System.out.println("1-Toplama İşlemi \n2-Çıkarma İşlemi\n3-Çarpma İşlemi\n4-Bölme İşlemi ");
        System.out.println("Yapmak İstediğiniz İşlemi Seçiniz: ");
        int secim = inp.nextInt();

        System.out.println("İlk Sayıyı Girinizz");
        n1 = inp.nextInt();

        System.out.println("İkinci Sayıyı Giriniz ");
        n2 = inp.nextInt();

        switch(secim){
            case 1:
                System.out.println("Toplama İşlemi sonucu " + (n1+n2));
                break;
            case 2:
                System.out.println("Çıkarma İşlemi sonucu " + (n1-n2));
                break;
            case 3:
                System.out.println("Çarpma İşlemi sonucu " + (n1*n2));
                break;
            case 4:
                System.out.println(" Bölme İşlemi sonucu " + (n1/n2));
                break;

        }



    }
}
