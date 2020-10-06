import java.util.Random;

public class MyRandom {

    private final Random rand;

    public MyRandom() {
        rand = new Random();
    }

    public int nextInt(int lower, int upper) {
        return lower + rand.nextInt(upper - lower + 1);
    }

    public double nextDouble(double lower, double upper) {
        return lower + (upper - lower) * rand.nextDouble();
    }
}