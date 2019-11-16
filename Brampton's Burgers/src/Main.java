
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static ArrayList<Menu> allHamburgerArrayList = new ArrayList<Menu>();
	public static ArrayList<Topping> allToppings = new ArrayList<Topping>();
	
	public static Menu burger = new Menu();
	public static Bill bill = new Bill();
	

	public static Scanner input;
	
	public static void main(String[] args) {
		

		BasicHamburger bh = new BasicHamburger();
		HealthyHamburger hh = new HealthyHamburger();
		DeluxHamburger dh = new DeluxHamburger();

		allHamburgerArrayList.add(bh);
		allHamburgerArrayList.add(hh);
		allHamburgerArrayList.add(dh);
	
		displayMenu();
	    
			
	}
	
	public static void displayMenu() {
		System.out.println("\n Please select type of Burger\n");
		
		int count=1;
		for(Menu burger : allHamburgerArrayList) {
			System.out.println(count + "." + burger + "\n");
			count ++;	
		}
		selectMenu();
	}// the end displayMenu()	
	
	public static void selectMenu() {
		System.out.println("Select the Hamburger : ");
		 input = new Scanner(System.in);
		int choice = input.nextInt();
		displayBurger(choice);
	}
	
	public static void displayBurger(int choice) {
		
		switch (choice) {
		case 1:
			burger = new BasicHamburger();
			break;
		case 2:
			burger = new HealthyHamburger();
			break;
		case 3:
			burger = new DeluxHamburger();
			break;
		default:
			displayMenu();
			break;
		}
		System.out.println(burger);
		bill.setBurger(burger);
		displayToppings();
	}
	
	public static void 	displayToppings() {
		int count = 1;
		int toppingCount = burger.getToppingNb();
		
		System.out.println("Please select " + toppingCount + " toppings\n");
		
		for (Topping topping : burger.toppings) {
			System.out.println(count + ", " + topping);
			count++;
		}
		 System.out.print("0. Thats all ");
	     System.out.print("\n\nSelect: ");

		try {
			input = new Scanner(System.in);		
			int select = input.nextInt();
			// System.out.println("selected topping");
			selectTopping(select);
			// displayMenu();
		}
		catch (Exception e) {
			displayToppings();
		}
		
	}
	
	public static void selectTopping(int select) {

			
		// allToppings.addAll(bh.getToppings());
		// allToppings.addAll(hh.getToppings());
		// allToppings.addAll(dh.getToppings());
		// System.out.println(menu.getToppings().get(0));
		// System.out.println(menu.getToppings().get(1));
		// System.out.println(menu.getToppings().get(2));
		// System.out.println(menu.getToppings().get(3));

		switch (select) {
			case 1: 
				bill.addtopping(burger.getToppings().get(0));
				break;
			case 2:
				bill.addtopping(burger.getToppings().get(1));
				break;
			case 3:
				bill.addtopping(burger.getToppings().get(2));
				break;
			case 4:
				bill.addtopping(burger.getToppings().get(3));
				break;
			case 5:
				bill.addtopping(burger.getToppings().get(4));
				break;
			case 6:
				bill.addtopping(burger.getToppings().get(5));
				break;
			case 0:
				bill.makeReciept();
				break;
			default:
				System.out.println("\nPlease select the right topping");		   
				displayToppings();
				break;
					
		}
	}
}
