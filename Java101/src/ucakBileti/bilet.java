package ucakBileti;
import java.util.Scanner;
//Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
//Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
//Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
//Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
//Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
// mesafe ücreti 0.10 tl km başına
public class bilet {
    public static void main(String[] args) {
        int mesafe, age, travelType;


        Scanner input = new Scanner(System.in);
        System.out.print("Yaşınızı giriniz:");
        age = input.nextInt();
        System.out.print("Toplam yolculuk mesafesinizi giriniz(Km cinsinden):");
        mesafe =input.nextInt();
        System.out.print("Yolculuk tipini yazınız (tek gidiş ise 1 gidiş-geliş ise 2 yazınız):");
        travelType = input.nextInt();
        double priceF = mesafe * 0.10;


        if (age<=12){
            switch (travelType){
                case 1:
                    System.out.print("Ücret turarı:"+ (priceF - priceF/2) );
                    break;
                case 2: 
                    System.out.print("Ücret tutarınız:"+ (2 * priceF - priceF/2 - priceF/5) );
            }
        } else if (age<=24) {
            switch (travelType){
                case 1:
                    System.out.print("Ücret tutarınız:"+ (priceF - priceF/10) );
                    break;
                case 2:
                    System.out.print("Ücret tutarınız:"+ (2 * priceF - priceF/10 - priceF/5) );
                    break;
            }
        } else if (age>=65) {
            switch (travelType){
                case 1:
                    System.out.print("Ücret tutarınız:"+ (priceF - priceF/0.30) );
                    break;
                case 2:
                    System.out.print("Ücret tutarınız:"+ (2 * priceF - priceF/0.30 - priceF/5));
                    break;
            }
        } else {
            System.out.print("Hata");
        }
    }
}
