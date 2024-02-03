package Dikucgen;
import java.util.Scanner;
public class dikucgen {
    public static void main(String[] args) {
        int kenar1, kenar2, kenar3;
        Scanner input = new Scanner(System.in);
        System.out.print("Kenar uzunluğu giriniz:");
        kenar1 = input.nextInt();

        System.out.print("Kenar uzunluğu giriniz:");
        kenar2 = input.nextInt();

        System.out.print("Kenar uzunluğu giriniz:");
        kenar3 = input.nextInt();

        int cevre = kenar1 + kenar2 + kenar3;
        System.out.println("Çevre uzunluğu:"+cevre);

        int u = cevre / 2;
        double alan = Math.sqrt (u * (u - kenar1) * (u - kenar2) * (u - kenar3));
        System.out.print("Üçgenin alanı:"+alan);
        
    }
}
