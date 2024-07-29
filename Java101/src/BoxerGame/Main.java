package BoxerGame;

import BoxerGame.Boxer;

public class Main {
    public static void main(String[] args) {
        Boxer b1  = new Boxer ("A", 10, 150,80);
        Boxer b2  = new Boxer ("B", 20, 135,90);

        Match match = new Match(b1, b2, 80, 90);
        match.run();
    }
}
