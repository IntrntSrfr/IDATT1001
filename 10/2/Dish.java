public class Dish {

    private final String name;
    private final Type type;
    private final int price;
    private final String recipe;

    enum Type{
        entry,
        mainCourse,
        dessert
    }

    public Dish(String name, String recipe, int price, Type type){
        this.name = name;
        this.type = type;
        this.price = price;
        this.recipe = recipe;
    }






}
