public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("denominator cannot be 0");
        }

        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction(int numerator) {
        this.numerator = numerator;
        this.denominator = 1;
    }

    public int getNumerator() {
        return this.numerator;
    }

    public int getDenominator() {
        return this.denominator;
    }

    public void add(Fraction y) {

        this.numerator = (this.numerator * y.denominator) + (y.numerator * this.denominator);
        this.denominator = (this.denominator * y.denominator);
    }

    public void subtract(Fraction y) {

        this.numerator = (this.numerator * y.denominator) - (y.numerator * this.denominator);
        this.denominator = (this.denominator * y.denominator);
    }

    public void multiply(Fraction y) {
        this.numerator *= y.numerator;
        this.denominator *= y.denominator;
    }

    public void divide(Fraction y) {
        this.numerator *= y.denominator;
        this.denominator *= y.numerator;
    }

    public String toString() {
        return String.format("%s/%s", numerator, denominator);
    }

}