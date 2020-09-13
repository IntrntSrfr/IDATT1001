public class Valuta {
    private String code;
    private double ratio;

    public Valuta(String code, double ratio) {
        this.code = code;
        this.ratio = ratio;
    }

    public String getName() {
        return code;
    }

    public double getRatio() {
        return ratio;
    }

    public double convertTo(Valuta val, double amt) {
        return (this.ratio / val.ratio) * amt;
    }
}
