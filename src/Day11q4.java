import java.util.Scanner;
class Restaurant11 {
    String restaurantName;
    String cuisineType;
    void display() {
        System.out.println("Restaurant Name: " + restaurantName);
        System.out.println("Cuisine Type: " + cuisineType);
    }
    void prepareOrder() {
        System.out.println("Preparing Food...");
    }
}
class PizzaRestaurant extends Restaurant11 {
    @Override
    void prepareOrder() {
        System.out.println("Preparing Pizza Order...");
    }
    String estimatedPreparationTime(){
        return "20 Minutes";
    }
}
class BiryaniRestaurant extends Restaurant11 {
    @Override
    void prepareOrder() {
        System.out.println("Preparing Biryani Order...");
    }
    String estimatedPreparationTime(){
        return "35 Minutes";
    }
}
public class Day11q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PizzaRestaurant p = new PizzaRestaurant();
        System.out.println("Enter restaurant name: ");
        p.restaurantName = sc.nextLine();
        System.out.println("Enter cuisine type: ");
        p.cuisineType = sc.nextLine();
        p.display();
        p.prepareOrder();
        System.out.println("Estimated time: "+p.estimatedPreparationTime());
        BiryaniRestaurant b = new BiryaniRestaurant();
        System.out.println("Enter restaurant name: ");
        b.restaurantName = sc.nextLine();
        System.out.println("Enter cuisine type: ");
        b.cuisineType = sc.nextLine();
        b.display();
        b.prepareOrder();
        System.out.println("Estimated time: "+b.estimatedPreparationTime());
        sc.close();
    }
}
