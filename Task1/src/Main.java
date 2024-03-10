import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // INSTANSIERING AF OBJEKTER AF KLASSEN 'CUSTOMERS'
        Customer customerOne = new Customer("Morten", "morten12");
        Customer customerTwo = new Customer("Helena", "helena200");
        Customer customerThree = new Customer("Gilli", "Angilo22");

        // ADDING OBJECTS TO ARRAY LIST 'CUSTOMERS'
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(customerOne);
        customers.add(customerTwo);
        customers.add(customerThree);

        Customer.printCustomers(customers);

    }
}