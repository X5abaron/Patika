package burc;
import java.util.Scanner;
public class burcBulma {
    public static void main(String[] args) {
        int day, month;

        Scanner input = new Scanner(System.in);
        System.out.print("Ayı sayı olarak giriniz:");
        month = input.nextInt();
        System.out.print("Günün giriniz");
        day = input.nextInt();

        if(month==1){
            if (day<=21 && day>=1){
                System.out.print("Oğlak burcusunuz");
            }else{
                System.out.print("Kova burcusunuz");
            }
        } else if (month==2) {
            if (day<=19 && day>=1){
                System.out.print("Kova burcusunuz");
            }else{
                System.out.print("Balık burcusunuz");
            }
        } else if (month==3) {
            if (day>=1 && day<=20){
                System.out.print("Balık burcusunuz");
            }else{
                System.out.print("Koç burcusunuz");
            }
        } else if (month==4) {
            if (day>=1 && day<=20){
                System.out.print("Koç burcusunuz");
            }else{
                System.out.print("Boğa burcusunuz");
            }
        } // I didn't continue because it gets repetitive and takes a long time
    }
}
