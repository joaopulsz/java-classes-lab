import java.util.ArrayList;
import java.util.Random;

public class Customer {

    private int id;
    private String firstName;
    private String lastName;
    private double heldMoney;

    private ArrayList<Object> purchases;

    public Customer(String newCustomerFirstName, String newCustomerLastName, double newCustomerHeldMoney) {
        Random random = new Random();
        this.id = random.nextInt(1000) + 1;
        this.firstName = newCustomerFirstName;
        this.lastName = newCustomerLastName;
        this.heldMoney = newCustomerHeldMoney;
        this.purchases = new ArrayList<>();
    }

    int getId() {
        return this.id;
    }
    String getFirstName() {
        return this.firstName;
    }
    String getLastName() {
        return this.lastName;
    }
    double getHeldMoney() {
        return this.heldMoney;
    }
    ArrayList getPurchases() {
        return this.purchases;
    }

    void setId(int id) {
        this.id = id;
    }
    void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    void setLastName(String lastName) {
        this.lastName = lastName;
    }
    void setHeldMoney(double heldMoney) {
        this.heldMoney = heldMoney;
    }

    String getFullName() {
        return "This customer's full name is " + this.firstName + " " + this.lastName + ".";
    }

    void subtractHeldMoney(int amountToSubtract) {
        this.heldMoney = heldMoney - amountToSubtract;
    }

    void addPurchase(String newPurchase) {
        this.purchases.add(newPurchase);
    }
}
