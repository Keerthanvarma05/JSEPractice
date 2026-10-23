import java.util.Scanner;
class User10 {
    String username;
    String email;
    void displayUserInfo() {
        System.out.println("Inside Parent class: ");
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
    }
}

class Customer extends User10 {
    String deliveryAddress;
    int rewardPoints;
    void displayCustomerInfo() {
        System.out.println("Inside Child1 class: ");
        System.out.println("DeliveryAddress: " + deliveryAddress);
        System.out.println("Reward Points: " + rewardPoints);
    }
}
class Seller extends User10 {
    String storeName;
    float sellerRating;
    void displaySellerInfo(){
        System.out.println("Inside Child2 class: ");
        System.out.println("StoreName: " + storeName);
        System.out.println("SellerRating: " + sellerRating);
    }
}
public class Day10q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Customer c = new Customer();
        System.out.println("Enter Username Name: ");
        c.username = input.nextLine();
        System.out.println("Enter Email Address: ");
        c.email = input.nextLine();
        System.out.println("Enter Delivery Address: ");
        c.deliveryAddress= input.nextLine();
        System.out.println("Enter Reward Points: ");
        c.rewardPoints = input.nextInt();
        input.nextLine();
        c.displayUserInfo();
        c.displayCustomerInfo();
        Seller s = new Seller();
        System.out.println("Enter Username Name: ");
        s.username = input.nextLine();
        System.out.println("Enter Email Address: ");
        s.email = input.nextLine();
        System.out.println("Enter Store Name: ");
        s.storeName = input.nextLine();
        System.out.println("Enter SellerRating: ");
        s.sellerRating = input.nextFloat();
        s.displayUserInfo();
        s.displaySellerInfo();
    }
}
