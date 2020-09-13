public class Calculator {
    public static void main(String[] args){
        Fraction f1 = new Fraction(-11, 3);
        Fraction f2 = new Fraction(2);

        f1.add(f2);
        System.out.println(f1.toString());
    }
}
