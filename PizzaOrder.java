import java.util.*; 

public class PizzaOrder {

public static boolean CheckId(String asuID) {
    if (asuID instanceof String) {
        return true;
    } else {
        return false;
    }
}


//main to test code
public static void main(String[] args) {  
    
    System.out.println(PizzaOrder.CheckId("testcase"));
}
}