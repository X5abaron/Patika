package ManavProblemi;
import java.util.Scanner;
public class kasaHesap {
    public static void main(String[] args) {
        double armut, elma, domates, muz, patlican;

        Scanner input = new Scanner(System.in);
        System.out.print("Kaç kilogram armut aldığınızı giriniz:");
        armut = input.nextDouble() * 2.14;
        System.out.print("Kaç kilogram elma aldığınızı giriniz:");
        elma = input.nextDouble() * 3.67;
        System.out.print("Kaç kilogram domates aldığınızı giriniz:");
        domates = input.nextDouble() * 1.11;
        System.out.print("Kaç kilogram muz aldığınızı giriniz:");
        muz = input.nextDouble() * 0.95;
        System.out.print("Kaç kilogram patlıcan aldığınızı giriniz:");
        patlican = input.nextDouble() * 5;

        double tutar = armut + elma + domates + muz + patlican;
        System.out.print("Alışveriş tutarınız:"+tutar);
    }
}
