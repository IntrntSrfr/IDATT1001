import java.util.Random;

public class MyRandom {
    public static void main(String[] args) {
        MyRandom r = new MyRandom();
        for (int i = 0; i < 10000; i++) {
            // System.out.println(r.nextDouble(10, 50));

            int ri = r.nextInt(10, 50);
            double rd = r.nextInt(10, 50);
            
            if (rr == 10) {
                System.out.println(rr);
                return;
            }
        }
    }

    Random rand;

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

// 10 + ((40)*(0->1))