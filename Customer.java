import java.util.*; 
package application;

public class Customer {
	//Instance Variables
	private String asuID;
	private String asuEmail;
	private PizzaOrder pizza;

	public Customer() {
	
	}

	public Customer(String ID, PizzaOrder order) {
		asuID = ID;
		asuEmail = ID + "@asu.edu";
		pizza = new PizzaOrder(order)
	}

	public String getID(){
		return asuID;
	}

	public String getEmail() {
		return asuEmail;
	}

	public PizzaOrder getOrder() {
		return new PizzaOrder(pizza);
	}

	public static boolean CheckId() {
		if (asuID instanceof String) { //checking if ID is a string or not for now
				return true;
		} 
		else {
				return false;
			}
		}
}