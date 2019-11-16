package app;

import java.util.ArrayList;

/**
 * Bill
 */
public class Bill {

    public void generateBill(Burger selectedBurger, ArrayList<Topping> selectedToppings) {
        double subTotal = calculateTotal(selectedBurger, selectedToppings);
        double tax = 0.15 * subTotal;
        double grandTotal = subTotal + tax;

        System.out.println("\n********Bill********");
        System.out.println("--------------------\n");
        System.out.println(selectedBurger);
        for (Topping topping : selectedToppings) {
            System.out.println(topping);
        }
        System.out.println("--------------------\n");

        System.out.println("Sub Total: " + String.format("%.2f", subTotal) + "\n");
        System.out.println("Tax: " + String.format("%.2f", tax) + "\n");
        System.out.println("Grand Total: " + String.format("%.2f", grandTotal) + "\n");

    }

    private double calculateTotal(Burger selectedBurger, ArrayList<Topping> selectedToppings) {
        double tempTotal = 0;
        tempTotal += selectedBurger.getPrice();
        for (Topping topping : selectedToppings) {
            tempTotal += topping.getPrice();
        }
        return tempTotal;
    }

}