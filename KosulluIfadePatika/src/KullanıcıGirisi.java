import java.util.Scanner;

public class KullanıcıGirisi {
    public static void main(String[] args){
        String password,userName;

        Scanner inp = new Scanner(System.in);

        System.out.println("Kullanıcı Adınızı Giriniz:");
        userName= inp.nextLine();

        System.out.println("Lütfen Şifrenizi Giriniz : ");
        password = inp.nextLine();

        //equals (), String sınıfında, iki dizeyi karşılaştırmak ve eşit olup olmadıklarını belirlemek için kullanılan bir yöntemdir.
        if(userName.equals("patika") && password.equals("Java123")) {
            System.out.println("Giriş Başarılı ");
        }
        else{
                System.out.println("Bilgilerinizi Kontrol Ediniz !!");
            }

        }

    }

