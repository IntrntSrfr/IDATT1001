public class Player {
    private final String name;
    private int score;

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

    public void rollDice(int roll) {
        System.out.println(name + " rolled: " + roll);
        score = (roll == 1) ? 0 : score + roll;
        System.out.println(name + " score: " + score);
    }

    public boolean isDone() {
        return score >= 100;
    }
}
