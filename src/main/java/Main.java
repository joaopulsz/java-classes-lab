import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {

    public static void main(String[] args) {

//        ACCOUNT
//        Account myAccount = new Account("1", "Joao", 300);
//        int myBalance = myAccount.getBalance();
//        System.out.println(myBalance);
//
//
//        CIRCLE
//        Circle circle1 = new Circle(23.45);
//        System.out.println(circle1.getRadius());
//        System.out.println(circle1.getCircumference());
//        System.out.println(circle1.toString());
//
//        circle1.setRadius(98.56);
//        System.out.println(circle1.getRadius());
//        System.out.println(circle1.getCircumference());
//
//
//        RECTANGLE
//        Rectangle rectangle1 = new Rectangle(45, 30);
//        System.out.println(rectangle1.getPerimeter());
//        System.out.println(rectangle1.getArea());
//        System.out.println(rectangle1.getDiagonal());
//
//
//        CUSTOMER
//        Customer customer1 = new Customer("Joao", "Pulsz", 40.00);
//        System.out.println(customer1.getFullName());
//        System.out.println(customer1.getId());
//        customer1.subtractHeldMoney(20);
//        System.out.println(customer1.getHeldMoney());
//
//        customer1.addPurchase("Guitar");
//        customer1.addPurchase("Piano");
//        System.out.println(customer1.getPurchases());

//        EXTENSION
        Customer_ext newCustomer = new Customer_ext(1);

        Account_ext newAccount = new Account_ext("1", newCustomer,300);

        System.out.println("Hello, what is your first name?");
        Scanner reader = new Scanner(System.in);
        String customerFirstName = reader.nextLine();
        newCustomer.setFirstName(customerFirstName);

        System.out.println("Thank you. And what is your last name?");
        String customerLastName = reader.nextLine();
        newCustomer.setLastName(customerLastName);

        System.out.println("Thank you. How much would you like your first deposit to be?");
        Integer firstDeposit = reader.nextInt();
        newAccount.setBalance(firstDeposit);

        System.out.println("Thank you. Here is your " + newAccount.toString());

        System.out.println("Please, enter a positive amount if you'd like to make a deposit, or a negative amount if you'd like to make a withdrawal. Otherwise, enter 0 to exit.");

        Integer newInput = reader.nextInt();

        while (newInput != 0) {

            newAccount.setBalance(newAccount.getBalance() + newInput);

            System.out.println("Thank you. Your new balance is " + newAccount.getBalance() + ".");

            System.out.println("Please, enter a positive amount if you'd like to make a deposit, or a negative amount if you'd like to make a withdrawal. Otherwise, enter 0 to exit.");

            newInput = reader.nextInt();
        }


    }
}
