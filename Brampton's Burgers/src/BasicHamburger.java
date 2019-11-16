
public class BasicHamburger extends Menu {
	
	public BasicHamburger() {
		super("White" , "Bacon" , "Basic Burger" , 3.67, 4);
			toppings.add(new Topping("Tomato", 0.45));
			toppings.add(new Topping("Lettuce", 0.45));
			toppings.add(new Topping("Cheese", 0.45));
			toppings.add(new Topping("Carrot", 0.45));
			
	}
	
	public BasicHamburger(String rollytype, String meats,String name, double price, int toppingNb) {
		
		super(rollytype,meats,name,price,toppingNb);
		toppings.add(new Topping("Tomato", 0.45));
		toppings.add(new Topping("Lettuce", 0.45));
		toppings.add(new Topping("Cheese", 0.45));
		toppings.add(new Topping("Carrot", 0.45));
		
		
	}
	
}
