package Baslangıc;
import java.util.Scanner;
public class MainJava {
    public static void main(String[] args) {
        //Kullanıcıdan not bilgileri alınır.
        int fizik, matematik, kimya, turkce, tarih, muzik;
        Scanner not = new Scanner(System.in);

        System.out.print("Fizik notunuzu giriniz:");
        fizik = not.nextInt();

        System.out.print("Matematik notunuzu giriniz:");
        matematik = not.nextInt();

        System.out.print("Kimya notunuzu giriniz:");
        kimya = not.nextInt();

        System.out.print("Biyoloji notunuzu giriniz:");
        turkce = not.nextInt();

        System.out.print("Tarih notunuzu giriniz:");
        tarih = not.nextInt();

        System.out.print("Müzik notunuzu giriniz:");
        muzik = not.nextInt();
        //Notların toplamı bulunup not ortalaması alınır.

        double toplam = (fizik+matematik+kimya+turkce+tarih+muzik);
        System.out.println(toplam/6);
        //Not ortalaması geçerli not alıyormu diye bakılır.

        double notOrtalamasi = (toplam/6);

        int gecerliNot = 60;
        boolean ortalama1 = notOrtalamasi>60;
        boolean ortalama2 = notOrtalamasi==60;
        boolean ortalama = ortalama1||ortalama2;

        String str;
        str = (ortalama) ? "Sınıfı Geçti" : "Sınıfta kaldı";
        System.out.println(str);

    }
}

