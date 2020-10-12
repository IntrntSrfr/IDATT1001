import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {

        MenuRegister mr = new MenuRegister();

        Dish d2 = new Dish("Hvitløksbrød", "Hvitløk, Brød", 15, Dish.Type.ENTRY);
        Dish d3 = new Dish("Biff og sævs", "Biff, Sævs", 8, Dish.Type.MAIN);
        Dish d1 = new Dish("Is og vafler", "Is, Vafler", 30, Dish.Type.DESSERT);

        mr.registerDish(d1);
        mr.registerDish(d2);
        mr.registerDish(d3);

        ArrayList<Dish> m1d = new ArrayList<>();
        m1d.add(mr.getDishByName("Is og vafler"));
        m1d.add(mr.getDishByName("Hvitløksbrød"));
        m1d.add(mr.getDishByName("Biff og sævs"));

        //System.out.println(m1d);

        Menu m1 = new Menu(m1d);

        mr.registerMenu(m1);

        System.out.println(m1);

        d2.setPrice(1000);
/*
        System.out.println(m1.getTotalPrice());

        System.out.println(mr.getMenusWithinPriceRange(50, 55));
        System.out.println(mr.getMenusWithinPriceRange(45, 50));

        System.out.println(mr.getAllDishesOfType(Dish.Type.DESSERT));


        System.out.println(d1);
        */

    }
}
