import java.util.ArrayList;

public class Menu {
	private String name;
	private double price;
	private String meats;
	private String rolltype;
	private int toppingNb;
	
	protected ArrayList<Topping> toppings = new ArrayList<>();
	

	public Menu (String rollytype, String meats,String name, double price, int toppingNb) {
		this.rolltype = rollytype;
		this.meats = meats;
		this.name = name;
		this.price = price;
		this.toppingNb = toppingNb;		
	}
	
	public Menu() {
		this.rolltype = "";
		this.meats ="";
		this.name= "";
		this.price = 0 ;
		this.toppingNb = 0;
	}
	
	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public String getMeats() {
		return meats;
	}

	public String getRolltype() {
		return rolltype;
	}

	public int getToppingNb() {
		return toppingNb;
	}
	
	public ArrayList<Topping> getToppings() {
		return toppings;
	}
	
	@Override
	public String toString() {
		
		return  this.rolltype + " " + this.name + " with " + this.meats + "\nPrice: \t" + this.price + "\nMax Toppings :" + this.toppingNb + "\n\n";
	}
	
}
