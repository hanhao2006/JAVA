
public class Topping {
	
	double price;

	String name;
	
	public Topping(String name, double price) {
		this.name = name;
		this.price = price;
	}
	public Topping() {
		this.name = "";
		this.price = 0;
	}
	
	public double getPrice() {
		return price;
	}
	public String getName() {
		return name;
	}
	
	
	@Override
	public String toString() {
		
		return "Items: " + this.name + "\nPrice: " + this.price + "\n";
	}
	
	
	
}
