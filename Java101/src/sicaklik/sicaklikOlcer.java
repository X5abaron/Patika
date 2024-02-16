package sicaklik;
import java.util.Scanner;
public class sicaklikOlcer {
    public static void main(String[] args) {
        //sıcaklık 5 ise kayak 15 ten küçük isse sinema 25 15 ise piknik 25 üstü ise yüzme öner

        double heat;
        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklık değerini giriniz:");
        heat = input.nextInt();
        if (heat<=5){
            System.out.print("Kayak yapmanızı öneririz");
        }else if (heat < 15) {
            System.out.print("Sinemaya gitmenizi öneririz");
        } else if (heat > 15 && heat < 25) {
            System.out.print("Piknik yapmanızı öneririz");
        } else if (heat >= 25) {
            System.out.print("Yüzmeye gitmenizi öneririz");
        }











    }
}
