package app;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Function
 */
public class Function {

    public static Scanner input;

    private static ArrayList<Burger> burgers = new ArrayList<Burger>();

    private static void createBurger() {
        DeluxeBurger deluxeBurger = new DeluxeBurger();
        BasicBurger basicBurger = new BasicBurger();
        HealthyBurger healthyBurger = new HealthyBurger();

        burgers.add(basicBurger);
        burgers.add(deluxeBurger);
        burgers.add(healthyBurger);

    }

    public static void displayMenu() {

        createBurger();

        System.out.println("\n*********Welcome to THE most famous Brampton's Burger************\n");
        System.out.println("    Please Select your burger\n");
        System.out.println("\t==========Menu==========\n");
        System.out.flush();
        int counter = 1;
        for (Burger oneBurger : burgers) {
            System.out.print(counter + ". ");
            System.out.print(oneBurger);
            counter++;
        }
        System.out.println("\n");

    }

    public static Burger selectBurger() {
        // int choice;
        Burger selectedBurger = new Burger();
        System.out.print("---------------------------\n ");
        System.out.print("Please select type of burger: ");
        input = new Scanner(System.in);
        int choice = input.nextInt();

        switch (choice) {
        case 0:
            break;
        case 1:
            selectedBurger = new BasicBurger();
            break;
        case 2:
            selectedBurger = new DeluxeBurger();
            break;
        case 3:
            selectedBurger = new HealthyBurger();
            break;

        default:
            System.out.println("Please enter correct choice");
            displayMenu();
            break;
        }
        System.out.println("You have selected:" + selectedBurger.getName() + "\n");

        return selectedBurger;
    }

    public static void displayTopping(Burger selectedBurger) {

        int counter = 1;
        for (Topping oneTopping : selectedBurger.getTopping()) {
            System.out.print(counter + ". ");
            System.out.println(oneTopping);
            counter++;
        }
    }

    public static void selectTopping(Burger selectedBurger, ArrayList<Topping> selectedToppings) {
        System.out.print("---------------------------\n ");
        System.out.print("Please select the toppings: ");
        // ArrayList<Topping> toppings = new ArrayList<Topping>();
        input = new Scanner(System.in);
        int choice = input.nextInt();

        switch (choice) {
        case 0:
            break;
        case 1:
            selectedToppings.add(selectedBurger.getTopping().get(0));
            break;
        case 2:
            selectedToppings.add(selectedBurger.getTopping().get(1));
            break;
        case 3:
            selectedToppings.add(selectedBurger.getTopping().get(2));
            break;
        case 4:
            selectedToppings.add(selectedBurger.getTopping().get(3));
            break;
        case 5:
            selectedToppings.add(selectedBurger.getTopping().get(4));
            break;
        case 6:
            selectedToppings.add(selectedBurger.getTopping().get(5));
            break;

        default:
            System.out.print("please select the correct topping: ");
            displayTopping(selectedBurger);
            break;
        }

        if (selectedBurger.getMaxTopping() != selectedToppings.size()) {
            displayTopping(selectedBurger);
            selectTopping(selectedBurger, selectedToppings);

        }
    }

}