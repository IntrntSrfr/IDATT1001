public class BestValue {
    public static void main(String[] args) {
        double pA = 35.90;
        double wA = 450;

        double pB = 39.50;
        double wB = 500;

        double upA = pA / wA;
        double upB = pB / wB;

        System.out.println(String.format("Kg price:\nA: %s - B: %s\n", upA * 1000, upB * 1000));
        String cheaper;
        if (upA < upB) {
            cheaper = "A is cheaper";
        } else if (upA > upB) {
            cheaper = "B is cheaper";
        } else {
            cheaper = "they are the same price";
        }
        System.out.println(cheaper);
    }
}