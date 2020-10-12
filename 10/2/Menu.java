import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Menu {
    private ArrayList<Dish> dishes;

    public Menu(ArrayList<Dish> dishes) {
        if (dishes.size() < 3) {
            throw new IllegalArgumentException("Menu needs at least 3 dishes");
        }
        this.dishes = dishes;
    }

    public double getTotalPrice() {
        return dishes.stream().mapToDouble(Dish::getPrice).sum();
    }

    @Override
    public String toString() {
        return "Menu{" +
                "dishes=" + dishes +
                '}';
    }
}