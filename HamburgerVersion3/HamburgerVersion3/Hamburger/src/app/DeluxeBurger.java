package app;

/**
 * DeluxeBurger
 */
public class DeluxeBurger extends Burger {

    public DeluxeBurger() {
        super("Deluxe Burger", breadType.Brown, 2, 11.99, meatType.Bacon);
        setTopping(new Topping("Chips", 1.95));
        setTopping(new Topping("Drinks", 0.95));

    }
}