package KitleEndeks;
import java.util.Scanner;
public class vucutBoy {
    public static void main(String[] args) {
        double height, kilo;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu metre cinsinden giriniz:");
        height = input.nextDouble();
        System.out.print("Lütfen kilonuzu kilogramcinsinden giriniz:");
        kilo = input.nextDouble();

        double  massHeightIndex = kilo / (height * height);
        System.out.print("Vücut kitle endeksiniz:"+massHeightIndex);
    }
}
