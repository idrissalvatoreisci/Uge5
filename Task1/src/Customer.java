import java.util.ArrayList;

public class Customer {
    private String firstName;
    private String username;
    private int id;
    private static int counter = 0;

    Customer(String firstName, String username)
    {
        this.firstName = firstName;
        this.username = username;
        this.id = counter;
        counter++; // counter is then incremented and ready to 'assign' next customer id

        System.out.println("ID is now: " + id + " Counter is now: " + counter);
    }

    // Arraylist to hold all the customers

    public static void printCustomers(ArrayList<Customer> list)
    {
        for (Customer customer : list)
        {
            System.out.println(customer);
        }
    }

    // SETTER & GETTER
    public String getFirstName()
    {
        return this.firstName;
    }

    public String getUsername()
    {
        return this.username;
    }


    @Override
    public String toString()
    {
        return "Customer name: " + firstName + " and customer username: " + username;
    }

    public int getId() {
        return 0;
    }

}
