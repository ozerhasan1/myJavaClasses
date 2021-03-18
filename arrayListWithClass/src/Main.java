import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList  <Customer> customers = new ArrayList <Customer> ();
        customers.add(new Customer(1,"Hasan","Özer"));
        customers.add(new Customer(2,"Madina","Özer"));
        customers.add(new Customer(3,"Luna","Özer"));
for (Customer customer:customers) {
    System.out.println(customer.Firstname);
}
    }
}
