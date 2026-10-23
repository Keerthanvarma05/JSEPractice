import java.util.Scanner;

interface DeliveryService14 {
    public void acceptOrder();
    public void deliverOrder();
    public void calculateDeliveryCharge(double distance);
}
class Swiggy14 implements DeliveryService14 {
    private String customerName;
    private String restaurantName;
    public Swiggy14(String customerName, String restaurantName) {
        this.customerName = customerName;
        this.restaurantName = restaurantName;
    }
    public String getCustomerName() {
        return customerName;
    }
    public String getRestaurantName() {
        return restaurantName;
    }

    @Override
    public void acceptOrder() {
        System.out.println("Order Accepted.");
    }
    @Override
    public void deliverOrder() {
        System.out.println("Order Delivered.");
    }
    @Override
    public void calculateDeliveryCharge(double distance) {
        System.out.println("Charge: ₹"+((int)(distance *= 8)));
    }
}
class Zomato14 implements DeliveryService14 {

    private String customerName;
    private String restaurantName;
    public Zomato14(String customerName, String restaurantName) {
        this.customerName = customerName;
        this.restaurantName = restaurantName;
    }
    public String getCustomerName() {
        return customerName;
    }
    public String getRestaurantName() {
        return restaurantName;
    }

    @Override
    public void acceptOrder() {
        System.out.println("Order Accepted.");
    }
    @Override
    public void deliverOrder() {
        System.out.println("Order Delivered.");
    }
    @Override
    public void calculateDeliveryCharge(double distance) {
        System.out.println("Charge: ₹"+((int)(distance *= 10)));
    }
}
public class Day14q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DeliveryService14 service;
        System.out.println("Enter Customer Name: ");
        String customerName1 = input.nextLine();
        System.out.println("Enter Restaurant Name: ");
        String restaurantName1 = input.nextLine();
        service =new Swiggy14(customerName1, restaurantName1);
        Swiggy14 swiggy = (Swiggy14)service; //have to declare after initialization of main object(swiggy).
        System.out.println("Customer: "+swiggy.getCustomerName());
        System.out.println("Restaurant: "+swiggy.getRestaurantName());
        service.acceptOrder();
        service.deliverOrder();
        service.calculateDeliveryCharge(12);

        System.out.println("Enter Customer Name: ");
        String customerName2 = input.nextLine();
        System.out.println("Enter Restaurant Name: ");
        String restaurantName2 = input.nextLine();
        service = new Zomato14(customerName2, restaurantName2);
        Zomato14 zomato= (Zomato14)service;  //have to declare after initialization of main object(zomato).
        System.out.println("Customer: "+zomato.getCustomerName());
        System.out.println("Restaurant: "+zomato.getRestaurantName());
        service.acceptOrder();
        service.deliverOrder();
        service.calculateDeliveryCharge(12);

    }
}
