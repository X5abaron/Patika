package DaireAlanCevre;
import java.util.Scanner;
public class Daire {
    public static void main(String[] args) {
        double pi = 3.14, a, r;

        Scanner input = new Scanner(System.in);
        System.out.println("Yarıçapın uzunluğunu giriniz:");
        r = input.nextDouble();
        System.out.print("a açısını giriniz:");
        a = input.nextDouble();

        double perimeter = 2 * pi * r;
        double area = pi * r * r;
        double areaOfAngle = (pi * (r * r) * a) / 360;

        System.out.println("Dairenin çevresi:"+perimeter);
        System.out.println("Dairenin alanı:"+area);
        System.out.print("Daire diliminin alanı:"+areaOfAngle);
    }
}
