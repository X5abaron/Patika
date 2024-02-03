package kdvproblemi;

import java.util.Scanner;

public class Master {
    public static void main(String[] args) {
        double tutar, kdvOran = 0.18;
        double kdvOran2 = 0.08;
        Scanner fiyat = new Scanner(System.in);
        System.out.print("Fiyatı giriniz:");
        tutar = fiyat.nextDouble();
        boolean kdvliTutar1 = tutar < 1000;
        boolean kdvliTutar2 = tutar == 1000;
        boolean kdvliTutar = kdvliTutar1 || kdvliTutar2;
        double tutar1 = tutar + (tutar * kdvOran);
        double tutar2 = tutar + (tutar * kdvOran2);
        double output = kdvliTutar ? tutar1 : tutar2;
        double output2 = kdvliTutar ? kdvOran : kdvOran2;
        System.out.println("Kdv tutarı:" + output2);
        System.out.print("Kdv'li fiyat:" + output);
    }
}
