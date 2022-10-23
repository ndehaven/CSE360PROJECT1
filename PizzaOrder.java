import java.util.*; 

public class PizzaOrder {

    //instance variables
    int pizzaType; //0: pepperoni, 1: veggie, 2: cheese
    boolean mushroom;
    boolean onion;
    boolean olives;
    boolean extraCheese;
    String pickupTime;
    boolean acceptedStatus;

    public PizzaOrder() {

        int pizzaType = 0; //0: pepperoni, 1: veggie, 2: cheese
        boolean mushroom = false;
        boolean onion = false;
        boolean olives = false;
        boolean extraCheese = false;
        String pickupTime = "0:00";
        boolean acceptedStatus = false;
    }

    public PizzaOrder(int Type, boolean mushroomi, boolean onioni, boolean olivesi, boolean extraCheesei, String pickupTimei, boolean acceptedStatusi) {

        int pizzaType = Type; //0: pepperoni, 1: veggie, 2: cheese
        boolean mushroom = mushroomi;
        boolean onion = onioni;
        boolean olives = olivesi;
        boolean extraCheese = extraCheesei;
        String pickupTime = pickupTimei;
        boolean acceptedStatus = acceptedStatusi;
    }


}