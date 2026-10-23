import java.util.Scanner;
class Payment11 {
    void processPayment(double amount) {
        System.out.println("Processing payment of ₹" +amount);
    }
}
class CreditCardPayment extends Payment11 {

    @Override
    void processPayment(double amount) {
        System.out.println("Credit Card Payment Successful.");
        System.out.println("Amount: " + amount);
    }
}
class UPIPayment extends Payment11 {
    @Override
    void processPayment(double amount) {
        System.out.println("UPI Payment Successful.");
        System.out.println("Amount: " + amount);
    }
}
public class Day11q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CreditCardPayment cp = new CreditCardPayment();
        System.out.println("Enter amount: ");
        cp.processPayment(input.nextDouble());
        UPIPayment up = new UPIPayment();
        System.out.println("Enter amount: ");
        up.processPayment(input.nextDouble());
        input.close();
    }
}
