import java.util.Scanner;
abstract class Vehicle13 {
    String brand;
    int rentPerDay;

    abstract void calculateRent(int days);
}
class Car13 extends Vehicle13 {
    @Override
    void calculateRent(int days) {
        System.out.println("Brand: "+brand);
        System.out.println("Days: "+days);
        System.out.println("RentPerDay: "+rentPerDay);
        int Total_Rent = days * rentPerDay;
        System.out.println("Total: "+ Total_Rent);
    }
}
class Bike13 extends Vehicle13 {
    @Override
    void calculateRent(int days) {
        System.out.println("Brand: "+brand);
        System.out.println("Days: "+days);
        System.out.println("RentPerDay: "+rentPerDay);
        int Total_Rent = days * rentPerDay;
        System.out.println("Total: "+ Total_Rent);
    }
}
public class Day13q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Car13 car = new Car13();
        System.out.println("Enter the brand: ");
        car.brand=input.nextLine();
        System.out.println("Enter the rent per day: ");
        car.rentPerDay=input.nextInt();
        System.out.println("Enter the total no.of days: ");
        int days1 = input.nextInt();
        input.nextLine();
        car.calculateRent(days1);
        Bike13 bike = new Bike13();
        System.out.println("Enter the brand: ");
        bike.brand=input.nextLine();
        System.out.println("Enter the rent per day: ");
        bike.rentPerDay=input.nextInt();
        System.out.println("Enter the total no.of days: ");
        int days2 = input.nextInt();
        bike.calculateRent(days2);
        input.close();
    }
}
