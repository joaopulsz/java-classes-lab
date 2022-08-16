public class Customer_ext {

    private int id;
    private String firstName;
    private String lastName;

    public Customer_ext(int newCustomerId) {
        this.id = newCustomerId;
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

    void setId(int id) {
        this.id = id;
    }
    void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
