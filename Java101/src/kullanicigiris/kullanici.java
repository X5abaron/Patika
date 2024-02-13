package kullanicigiris;
import java.util.Scanner;
public class kullanici {
    public static void main(String[] args) {
        String userName, password, newPassword, answer;

        Scanner input =new Scanner(System.in);
        System.out.print("Kullanıcı adınızı giriniz:");
        userName = input.nextLine();
        System.out.print("Şifrenizi giriniz");
        password = input.nextLine();

        if(userName.equals("patika") && password.equals("java101")) {
            System.out.print("Giriş başarılı");
        } else {
            System.out.print("Hatalı giriş,şifrenizi yenilemek ister misiniz ?");
            answer = input.next();

            if (answer.equals("Hayır")){
                System.out.print("Yeniden giriş yapmayı deneyin");
            } else if (answer.equals("Evet")){
                System.out.print("Yeni şifrenizi giriniz:");
                newPassword = input.nextLine();
                if (newPassword.equals("java101")){
                    System.out.print("Parola oluşturulamadı, lütfen yeni bir parola giriniz");
                } else{
                    System.out.print("Yeni parola başarılı bir şekilde oluşturuldu!");
                }
            }
        }
    }
}
