package app;

/**
 * Topping
 */
public class Topping {

    String name;
    double price;

    public Topping(String name, double price) {
        this.name = name;
        this.price = price;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return this.name + " price is: " + this.price;
    }
}