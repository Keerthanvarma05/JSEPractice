import java.util.Scanner;

abstract class Payment14 {
    String customerName;
    int amount;
    abstract void makePayment();
}
class CardPayment14 extends Payment14 {
    CardPayment14(String customerName, int amount) {
        this.customerName = customerName;
        this.amount = amount;
    }
    @Override
    void makePayment() {
        System.out.println("Payment Successful using Card");
    }
}
public class Day14q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your card holder name: ");
        String cname = sc.nextLine();
        System.out.println("Enter amount: ");
        int amount = sc.nextInt();
        Payment14 p = new CardPayment14(cname,amount);
        p.makePayment();
    }
}
