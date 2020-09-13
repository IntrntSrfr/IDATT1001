public class Game {
    public static void main(String[] args) {

        Player player1 = new Player("jeff");
        Player player2 = new Player("lol");

        Player[] list = { player1, player2 };

        int round = 0;
        boolean done = false;
        while (!done) {

            System.out.println("\nround " + round);

            for (Player p : list) {
                p.rollDice();
                if (p.done()) {
                    System.out.println("Player " + p.getName() + " won!");
                    done = true;
                    break;
                }
            }

            round++;
        }
    }
}