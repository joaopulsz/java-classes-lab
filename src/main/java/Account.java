public class Account {

    private String id;
    private String name;
    private int balance;

    public Account(String newId, String newName, int newBalance) {
        this.id = newId;
        this.name = newName;
        this.balance = newBalance;
    }

    @Override
    public String toString() {
        return "Account{" + "id='" + id + ", name='" + name + ", balance=" + balance + '}';
    }

    String getId() {
        return this.id;
    }
    String getName() {
        return this.name;
    }
    int getBalance() {
        return this.balance;
    }

    void setId(String id) {
        this.id = id;
    }
    void setName(String name) {
        this.name = name;
    }
    void setBalance(int balance) {
        this.balance = balance;
    }
}
