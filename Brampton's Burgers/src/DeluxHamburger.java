
public class DeluxHamburger extends Menu {
	
	public DeluxHamburger() {
		
		super("White" , "Bacon" , "Deluxe Burger" , 14.54, 2);
		
		toppings.add(new Topping("Chips",2.75));
		toppings.add(new Topping("Drink", 1.81));
	}

}
