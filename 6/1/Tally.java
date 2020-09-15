import java.util.Random;

public class Tally {
    public static void main(String[] args) {

        Random rand = new Random();
        int[] tally = new int[10];

        int iters = 10;

        for (int i = 0; i < iters; i++) {
            int num = rand.nextInt(10);
            tally[num]++;
        }

        for (int i = 0; i < tally.length; i++) {
            String stars = "";
            int sc = Math.round((float) tally[i] / iters * 100);

            for (int j = 0; j < sc; j++) {
                stars +="*";//concat("*");
            }

            System.out.println(i + " " + tally[i] + " " + stars);
        }
    }
}