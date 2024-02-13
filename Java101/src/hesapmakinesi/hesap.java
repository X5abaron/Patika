package hesapmakinesi;
import java.util.Scanner;
public class hesap {
    public static void main(String[] args) {
        double n1, n2;
        char select;

        Scanner input = new Scanner(System.in);
        System.out.print("Değer giriniz:");
        n1 = input.nextDouble();
        System.out.print("Değer giriniz");
        n2 = input.nextDouble();

        System.out.println("+\n-\n*\n/");
        System.out.print("İşlemi giriniz:");
        select = input.next().charAt(0);

        switch (select){
            case '+':
                System.out.print(n1+n2);
                break;
            case '-':
                System.out.print((n1-n2));
                break;
            case '*':
                System.out.print(n1*n2);
                break;
            case '/':
                System.out.print(n1/n2);
                break;
        }
    }
}
