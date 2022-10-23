import java.util.*; 

public class Customer {
	//Instance Variables
	private String asuID;
	private String asuEmail;
	private PizzaOrder pizza;

	public Customer(String ID,  String email, PizzaOrder order) {
		asuID = ID;
		asuEmail = email;
		pizza = new PizzaOrder(order)
	}

	public String getID(){
		return asuID;
	}

	public String getEmail() {
		return asuEmail;
	}

	public PizzaOrder getOrder() {
		return pizza;
	}
}