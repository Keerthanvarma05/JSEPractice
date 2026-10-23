import java.util.Scanner;
abstract class FoodOrder13 {
    String customerName;
    String itemName;
    int quantity;
    abstract void calculateBill();
}
class VegOrder13 extends FoodOrder13 {
    @Override
    void calculateBill() {
        System.out.println("Customer Name: "+customerName);
        System.out.println("Item: "+itemName);
        System.out.println("Quantity: "+quantity);
        int Price=150;
        int final_price=Price*quantity;
        System.out.println("Final Bill: ₹"+final_price);
    }
}
class NonVegOrder13 extends FoodOrder13 {
    @Override
    void calculateBill() {
        System.out.println("Customer Name: "+customerName);
        System.out.println("Item: "+itemName);
        System.out.println("Quantity: "+quantity);
        int Price=250;
        int final_price=Price*quantity;
        System.out.println("Final Bill: ₹"+final_price);
    }
}
public class Day13q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VegOrder13 v = new VegOrder13();
        System.out.println("Enter Customer Name: ");
        v.customerName = sc.nextLine();
        System.out.println("Enter Item Name: ");
        v.itemName = sc.nextLine();
        System.out.println("Enter Quantity: ");
        v.quantity = sc.nextInt();
        sc.nextLine();
        v.calculateBill();
        NonVegOrder13 n = new NonVegOrder13();
        System.out.println("Enter Customer Name: ");
        n.customerName = sc.nextLine();
        System.out.println("Enter Item Name: ");
        n.itemName = sc.nextLine();
        System.out.println("Enter Quantity: ");
        n.quantity = sc.nextInt();
        n.calculateBill();
        sc.close();
    }
}