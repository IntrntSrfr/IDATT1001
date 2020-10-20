import java.lang.reflect.Array;
import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {

        MenuRegister mr = new MenuRegister();

        Dish de1 = new Dish("Hvitløksbrød", "Hvitløk, Brød", 60, Dish.Type.ENTRY);
        Dish de2 = new Dish("Rundstykker", "Rundstykker", 20, Dish.Type.ENTRY);
        Dish de3 = new Dish("Salat", "Blader", 15, Dish.Type.ENTRY);

        Dish dm1 = new Dish("Biff og sævs", "Biff, Sævs", 250, Dish.Type.MAIN);
        Dish dm2 = new Dish("Pizza", "Pizzabunn, Saus, Pepperoni", 160, Dish.Type.MAIN);
        Dish dm3 = new Dish("Spaghetti", "Spaghetti, Saus", 130, Dish.Type.MAIN);

        Dish dd1 = new Dish("Is og vafler", "Is, Vafler", 30, Dish.Type.DESSERT);
        Dish dd2 = new Dish("Kake", "Kake", 60, Dish.Type.DESSERT);
        Dish dd3 = new Dish("Creme Brulee", "Creme, Brulee", 80, Dish.Type.DESSERT);

        // register entry courses
        mr.registerDish(de1);
        mr.registerDish(de2);
        mr.registerDish(de3);

        // register main courses
        mr.registerDish(dm1);
        mr.registerDish(dm2);
        mr.registerDish(dm3);

        // register desserts
        mr.registerDish(dd1);
        mr.registerDish(dd2);
        mr.registerDish(dd3);

        try {
            new Dish("", "", 40, Dish.Type.DESSERT);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            mr.registerDish(new Dish("Kake", "Kakemix", 40, Dish.Type.DESSERT));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // 15 + 130 + 30 = 175
        ArrayList<Dish> m1d = new ArrayList<>();
        m1d.add(mr.getDishByName("Salat"));
        m1d.add(mr.getDishByName("Spaghetti"));
        m1d.add(mr.getDishByName("Is og vafler"));
        Menu m1 = new Menu(m1d);
        mr.registerMenu(m1);

        // 15 + 160 + 60 = 235
        ArrayList<Dish> m2d = new ArrayList<>();
        m2d.add(mr.getDishByName("Salat"));
        m2d.add(mr.getDishByName("Pizza"));
        m2d.add(mr.getDishByName("Kake"));
        Menu m2 = new Menu(m2d);
        mr.registerMenu(m2);

        // 20 + 250 + 80 = 350
        ArrayList<Dish> m3d = new ArrayList<>();
        m3d.add(mr.getDishByName("Rundstykker"));
        m3d.add(mr.getDishByName("Biff og sævs"));
        m3d.add(mr.getDishByName("Creme Brulee"));
        Menu m3 = new Menu(m3d);
        mr.registerMenu(m3);

        //System.out.println(m1d);
        System.out.println(mr);

        System.out.println();
        System.out.println(mr.getDishByName("Kake"));
        System.out.println(mr.getDishByName("Eplekake"));
        System.out.println(mr.getAllDishesByType(Dish.Type.DESSERT));
        System.out.println();

        //mr.getDishByName("Biff og sævs").setPrice(500);

        System.out.println(m1.getTotalPrice());
        System.out.println(m2.getTotalPrice());
        System.out.println(m3.getTotalPrice());

        System.out.println(mr.getMenusWithinPriceRange(100, 200));
    }
}
