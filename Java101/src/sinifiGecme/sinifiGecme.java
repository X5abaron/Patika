package sinifiGecme;
import java.util.Scanner;
public class sinifiGecme {
    public static void main(String[] args) {


        int math, pyhsic, chemistry, turkish, music;

        Scanner input= new Scanner(System.in);

        System.out.print("Lütfen matematik notunuzu giriniz:");
        math = input.nextInt();
        if (math<0 || math>100){
            math = 0;
        }
        System.out.print("Lütfen fizik notunuzu giriniz:");
        pyhsic = input.nextInt();
        if (pyhsic<0 || pyhsic>100){
            pyhsic = 0;
        }
        System.out.print("Lütfen kimya notunuzu giriniz:");
        chemistry = input.nextInt();
        if (chemistry<0 || chemistry>100){
            chemistry = 0;
        }
        System.out.print("Lütfen tükçe notunuzu giriniz:");
        turkish = input.nextInt();
        if(turkish<0 || turkish>100){
            turkish = 0;
        }
        System.out.print("Lütfen müzik notunuzu giriniz");
        music = input.nextInt();
        if (music<0 || music>100){
            music = 0;
        }
        double ortalama = (double) (math + pyhsic + chemistry + turkish + music) / 5;

            if (ortalama >= 55) {
                System.out.println("Sınıfı geçtiniz");
                System.out.println("Ortalamanız:"+ortalama);
            } else {
                System.out.println("Sınıfı geçemediniz");
                System.out.print("Ortalamanız:"+ortalama);
            }
    }
}
