import java.util.Scanner;

public class HavaSicakligi {
    public static void main(String[]args){
        int sicaklik;

        // Faklı kullanıcıdan veri alınabilecek yapıyı oluşturduk.

        Scanner inp = new Scanner(System.in);
        System.out.println("Sicaklık Giriniz : ");
        sicaklik = inp.nextInt();


        if(sicaklik<5){
            System.out.println("Kayak Yapabilirsiniz");
        }
        else if(sicaklik>5 && sicaklik<15){
            System.out.println("Sinemaya Gdiebilirsiniz");

        }
        else if(sicaklik>15 && sicaklik <25 ){
            System.out.println("Piknik yapabilirsiniz.");

        }
        else{
            System.out.println("Yüzme eklinliğini yapabilirsiniz");
        }




    }
}
