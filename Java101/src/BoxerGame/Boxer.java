package BoxerGame;

public class Boxer {
    String name;
    int damage;
    int health;
    int weight;
    Boxer ( String name, int damage, int health, int weight){
    this.name= name;
    this.damage= damage;
    this.health= health;
    this.weight= weight;
    }
    int hit(Boxer foe){
        System.out.println(this.name + " => " + foe.name + " " + this.damage + " hasar vurdu ");
        if(foe.health - this.damage<0){
            return 0;
        }
        return foe.health - this.damage;

    }
}
