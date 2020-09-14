import java.util.Random;

public class Tally {
    public static void main(String[] args) {

        Random rand = new Random();
        int[] tally = new int[10];

        for (int i = 0; i < 10000; i++) {
            int num = rand.nextInt(10);
            tally[num]++;
        }

        for (int i = 0; i < tally.length - 1; i++) {
            String stars = "";
            Math.ceil(a)
            System.out.println(i + " " + tally[i] + " times");
        }
    }
}