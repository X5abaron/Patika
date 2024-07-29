package BoxerGame;

import BoxerGame.Boxer;

public class Match {
    Boxer b1;
    Boxer b2;
    int minWeight;
    int maxWeight;

    Match(Boxer b1, Boxer b2, int minWeight, int maxWeight){
        this.b1= b1;
        this.b2= b2;
        this.minWeight= minWeight;
        this.maxWeight= maxWeight;
    }void run(){
        if(isChek()){
            while(this.b1.health> 0 && this.b2.health> 0){
                System.out.println("-----YENİ ROUND-----");
             this.b2.health= this.b1.hit(this.b2);
             System.out.println("B reamin health=" + this.b2.health);
                if (isWin()){
                    break;
                }
             this.b1.health= this.b2.hit(this.b2);
             System.out.println("A remain health=" + this.b1.health);
             if (isWin()){
                 break;
             }
            }
        }else{
            System.out.print("Sporcuların sikletleri uyuşmuyor.");
        }
    }
    boolean isChek(){
        return(this.b1.weight>= minWeight && this.b1.weight<= maxWeight) && (this.b2.weight>= minWeight && this.b2.weight<= maxWeight);
    }
    boolean isWin() {
        if (this.b1.health == 0) {
            System.out.print("Winner is " + this.b2.name);
            return true;
        }
        if (this.b2.health == 0) {
            System.out.print("Winner is " +this.b2.name);
            return true;
        }
        return false;
    }
}
