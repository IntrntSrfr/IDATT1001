public class Tester {

    public static void main(String[] args) {
        MyRandom r = new MyRandom();

        // test from 10 to 50
        int upperInt = -10;
        int lowerInt = 50;
        for (int i = 0; i < 10000; i++) {
            int ri = r.nextInt(-10, 50);
            if (ri < lowerInt) {
                lowerInt = ri;
            } else if (ri > upperInt) {
                upperInt = ri;
            }
        }
        System.out.println("upper int: " + upperInt);
        System.out.println("lower int: " + lowerInt);

        // test from 3 to 7
        double upperDouble = -4;
        double lowerDouble = 7;
        for (int i = 0; i < 10000; i++) {
            double rd = r.nextDouble(-4, 7);
            if (rd < lowerDouble) {
                lowerDouble = rd;
            } else if (rd > upperDouble) {
                upperDouble = rd;
            }
        }
        System.out.println("upper double: " + upperDouble);
        System.out.println("lower double: " + lowerDouble);
    }
}
