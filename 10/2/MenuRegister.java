import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MenuRegister {
    private ArrayList<Dish> dishes;
    private ArrayList<Menu> menus;

    public MenuRegister(){
        this.dishes = new ArrayList<Dish>();
        this.menus= new ArrayList<Menu>();
    }

    public void registerDish(Dish dish) throws IllegalArgumentException{
        if(dishes.stream().anyMatch(d -> d.getName().equals(dish.getName()))){
            throw new IllegalArgumentException("Dish already exists!");
        }
        dishes.add(dish);
    }

    public void registerMenu(Menu menu){
        menus.add(menu);
    }

    public List<Menu> getMenusWithinPriceRange(double start, double end){
        return menus.stream()
                .filter(m -> start < m.getTotalPrice() && m.getTotalPrice() < end)
                .collect(Collectors.toList());
    }

    public List<Dish> getAllDishesOfType(Dish.Type type){
        return dishes.stream().filter(d -> d.getType() == type).collect(Collectors.toList());
    }

    public Dish getDishByName(String name){
        for(Dish d : dishes){
            if(d == null){
                break;
            }
            if(d.getName().toLowerCase().equals(name.toLowerCase())){
                return d;
            }
        }
        return null;
    }



}
