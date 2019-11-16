package app;

import java.util.ArrayList;

/**
 * Burger
 */

enum breadType {
    White, Brown
}

enum meatType {
    Bacon, Chicken, Sausage
}

public class Burger {

    private String name;
    private double price;
    private int maxTopping;
    private breadType bread;
    private meatType meat;

    private ArrayList<Topping> topping = new ArrayList<Topping>();

    public Burger(String name, breadType bread, int maxTopping, double price, meatType meat) {
        this.name = name;
        this.bread = bread;
        this.maxTopping = maxTopping;
        this.price = price;
        this.meat = meat;

    }

    public Burger() {
        // default constructor
    }

    /**
     * @return the maxTopping
     */
    public int getMaxTopping() {
        return maxTopping;
    }

    /**
     * @param topping the topping to set
     */
    public void setTopping(Topping topping) {
        this.topping.add(topping);
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the topping
     */
    public ArrayList<Topping> getTopping() {
        return topping;
    }

    /**
     * @return the price
     */

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return this.name + "  on a " + this.bread + " roll with \n\t" + this.meat + ", price is: " + this.price + "\n";

    }
}