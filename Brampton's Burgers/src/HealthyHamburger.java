

public class HealthyHamburger extends BasicHamburger {
	
	public HealthyHamburger () {
		
		super("White" , "Bacon" , "Healthy Burger" , 5.67, 6);
		toppings.add(new Topping("Egg",3.00));
		toppings.add(new Topping("Cucumber", 2.00));
	}
	
}
