package sayiSiralama;
import java.util.Scanner;
public class siralama {
    public static void main(String[] args) {
        double n1, n2 ,n3;

        Scanner input = new Scanner(System.in);
        System.out.print("n1:");
        n1 = input.nextDouble();
        System.out.print("n2:");
        n2 = input.nextDouble();
        System.out.print("n3:");
        n3 = input.nextDouble();

        if (n1>n2 && n1>n3){
            if (n2>n3){
                System.out.print("n1>n2>n3");
            }else{
                System.out.print("n1>n3>n2");
            }
        } else if (n2>n1 && n2>n3) {
            if (n1>n3){
                System.out.print("n2>n1>n3");
            }else {
                System.out.print("n2>n3>n1");
            }
        } else if (n3>n1 && n3>n2) {
            if (n1>n2){
                System.out.print("n3>n1>n2");
            }else{
                System.out.print("n3>n2>n1");
            }
        }
    }
}
