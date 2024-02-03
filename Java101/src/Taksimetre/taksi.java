package Taksimetre;
import java.util.Scanner;
public class taksi {
    public static void main(String[] args) {
        double gidilenYol;

        Scanner yol = new Scanner(System.in);
        System.out.print("Gidilen Km'yi yazınız:");
        gidilenYol = yol.nextDouble();

        double output1 = gidilenYol * 2.20;
        double sabitUcret = 20;
        double ucret = output1 + 10;

        boolean durum1 = (10+output1)<20;
        boolean durum2 = (10+output1)==20;
        boolean sonuc = durum1||durum2;

        double output2;
        output2 = sonuc ? sabitUcret : ucret ;
        System.out.print("ücretiniz:"+output2);
    }
}
