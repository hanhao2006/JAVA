package app;

/**
 * HealthyBurger
 */
public class HealthyBurger extends BasicBurger {

    public HealthyBurger() {
        super("Healthy Burger", breadType.Brown, 6, 8.99, meatType.Sausage);
        setTopping(new Topping("Olive", 0.97));
        setTopping(new Topping("Capsicum", 0.97));
    }
}