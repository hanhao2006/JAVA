package app;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) throws Exception {
        Bill bill = new Bill();

        Function.displayMenu();
        Burger selectedBurger = Function.selectBurger();
        Function.displayTopping(selectedBurger);

        ArrayList<Topping> selectedToppings = new ArrayList<Topping>();
        Function.selectTopping(selectedBurger, selectedToppings);
        bill.generateBill(selectedBurger, selectedToppings);
    }
}