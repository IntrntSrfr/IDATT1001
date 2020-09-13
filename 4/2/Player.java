import java.util.Random;

public class Player {
    private String name;
    private int score;

    private Random rand = new Random();

    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void rollDice() {
        int roll = rand.nextInt(6) + 1;

        System.out.println(name + " rolled " + roll);

        if (roll == 1) {
            score = 0;
            System.out.println(name + " score: " + score + "");
        } else {
            score += roll;
            System.out.println(name + " score: " + score + "");
        }
    }

    public boolean done() {
        return score > 100;
    }

}
