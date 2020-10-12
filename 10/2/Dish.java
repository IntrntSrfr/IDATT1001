public class Dish {

    private final String name;
    private final Type type;
    private double price;
    private final String recipe;

    enum Type{
        ENTRY,
        MAIN,
        DESSERT
    }

    public Dish(String name, String recipe, int price, Type type){
        this.name = name;
        this.type = type;
        this.price = price;
        this.recipe = recipe;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price= price;
    }

    public String getRecipe() {
        return recipe;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", price=" + price +
                ", recipe='" + recipe + '\'' +
                '}';
    }
}
