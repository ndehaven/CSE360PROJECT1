import java.util.*; 

public class PizzaOrder {

public static boolean CheckId(String asuID) {
    if (asuID instanceof String) { //checking if ID is a string or not for now
        return true;
    } else {
        return false;
    }
}

public static void SendOrder(PizzaOrder customerOrder) {

}

//main to test code
public static void main(String[] args) {  
    
    System.out.println(PizzaOrder.CheckId("testcase"));
}
}