import java.util.ArrayList;
import java.lang.Math;

public class Bill {	
	public Menu burger;
	public ArrayList<Topping> alltoppings = new ArrayList<Topping>();
	
	public void setBurger(Menu menu) {
		this.burger = menu;
	}
	
	public void addtopping(Topping topping) {
        
		this.alltoppings.add(topping);
		if(this.burger.getToppingNb() == alltoppings.size()) {
			makeReciept();			
		}
		else {
			Main.displayToppings();
		}	
	}
	
	public double calcurtor() {
        double total = 0;
        total += burger.getPrice();
		for(Topping topping : alltoppings) {
			total += topping.getPrice();
		}
		return total;
	}
	
	public void makeReciept() {
		
		
		double total = calcurtor();
		double tax = total * 0.15;
		tax = Math.round(tax);
		double finaltotal = total + tax;
		finaltotal =Math.round(finaltotal);

        System.out.println("Reciept");
        System.out.println("```````");
        System.out.println(burger);
	        for (Topping topping : alltoppings) {
	            System.out.println(topping);
	        }
        

        System.out.println("Befor Total : " + total);
        System.out.println("Tax : " + tax);
        System.out.println("After Total : " + finaltotal);
    	}


}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
