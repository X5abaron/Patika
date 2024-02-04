package ManavProblemi;
import java.util.Scanner;
public class kasaHesap {
    public static void main(String[] args) {
        double armut, elma, domates, muz, patlican;

        Scanner input = new Scanner(System.in);
        System.out.print("Kaç kilogram armut aldığınızı giriniz:");
        armut = input.nextDouble();
        System.out.print("Kaç kilogram elma aldığınızı giriniz:");
        elma = input.nextDouble();
        System.out.print("Kaç kilogram domates aldığınızı giriniz:");
        domates = input.nextDouble();
        System.out.print("Kaç kilogram muz aldığınızı giriniz:");
        muz = input.nextDouble();
        System.out.print("Kaç kilogram patlıcan aldığınızı giriniz:");
        patlican = input.nextDouble();

        double tutar = (2.14 * armut) + (3.67 * elma) + (1.11 * domates) + (0.95 * muz) + (5 * patlican);
        System.out.print("Alışveriş tutarınız:"+tutar);
    }
}
