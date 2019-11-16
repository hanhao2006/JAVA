package app;

/**
 * BasicBurger
 */
public class BasicBurger extends Burger {

    public BasicBurger() {
        super("Basic Burger", breadType.White, 4, 5.99, meatType.Chicken);
        setTopping(new Topping("Tomato", 0.67));
        setTopping(new Topping("Lettuce", 0.37));
        setTopping(new Topping("Onion", 0.57));
        setTopping(new Topping("Carrot", 0.57));

    }

    public BasicBurger(String name, breadType bread, int maxTopping, double price, meatType meat) {
        super(name, bread, maxTopping, price, meat);
        setTopping(new Topping("Tomato", 0.67));
        setTopping(new Topping("Lettuce", 0.37));
        setTopping(new Topping("Onion", 0.57));
        setTopping(new Topping("Carrot", 0.57));
    }
}