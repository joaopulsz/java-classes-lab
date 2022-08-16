public class Account_ext {

    private String id;
    private Customer_ext owner;
    private int balance;

    public Account_ext(String newId, Customer_ext newOwner, int newBalance) {
        this.id = newId;
        this.owner = newOwner;
        this.balance = newBalance;
    }

    String getId() {
        return this.id;
    }
    Customer_ext getOwner() {
        return this.owner;
    }
    int getBalance() {
        return this.balance;
    }

    void setId(String id) {
        this.id = id;
    }
    void setName(Customer_ext owner) {
        this.owner = owner;
    }
    void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account info - Owner: " + this.owner.getFirstName() + " " + this.owner.getLastName() + ", Balance: " + this.balance + ".";
    }
}
