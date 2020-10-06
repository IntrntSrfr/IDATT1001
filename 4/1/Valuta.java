public class Valuta {
    private final String name;
    private final double value;

    public Valuta(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }

    public double convertTo(Valuta val, double amt) {
        return (this.value / val.value) * amt;
    }
}
