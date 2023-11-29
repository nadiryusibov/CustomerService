import java.util.ArrayList;
import java.util.List;

public class CustomerService {
    List<Customer>customers;
    public CustomerService(){
        this.customers = new ArrayList<>();
    }
    public void addCustomer(int id,String name,String surname,String pin){
        Customer customer = new Customer(id,name,surname,pin);
        customers.add(customer);
        System.out.println(customers);
    }

    public void displayCustomer(){
        for (Customer customer: customers){
            System.out.println(customer);
        }
    }

    public void removeCustomer(int id){
        for (Customer customer: customers){
            if (customer.getId() == id){
                System.out.println("Musteri id si silindi " + id);
                customers.remove(customer);
                return;
            }
        }
    }

}
