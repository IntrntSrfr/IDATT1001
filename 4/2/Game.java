import java.util.Random;

public class Game {
    public static void main(String[] args) {

        Random rand = new Random();

        Player p1 = new Player("jeff");
        Player p2 = new Player("lol");

        Player[] players = { p1, p2 };

        boolean done = false;
        int round = 0;
        while (!done) {
            System.out.println("\nround " + round);

            for (Player p : players) {
                p.rollDice((rand.nextInt(6) + 1));
                if (p.isDone()) {
                    System.out.println(p.getName() + " won!");
                    done = true;
                    break;
                }
            }
            round++;
        }
    }
}
