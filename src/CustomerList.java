import java.util.Stack;
//Sentimental value class
public class CustomerList {
    
    private Stack<Customer> customers = new Stack<Customer>();

    public CustomerList() {
        customers = null;
    }

    public Customer getPop() {
        return customers.pop();
    }

    public void doPush(Customer specCustomer) {
        customers.push(specCustomer);
    }



    public CustomerList(CustomerList object) {
        customers = object.customers;
    }
}
