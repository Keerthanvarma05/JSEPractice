import java.util.Scanner;
class Vehicle11 {
    String brand;
    int registrationNumber;
    void displayVehicleInfo() {
        System.out.println("Inside Parent class: ");
        System.out.println("Brand: " + brand);
        System.out.println("Registration Number: " + registrationNumber);
    }
}
class Bike11 extends Vehicle11 {
    int engineCapacity;
    String hasABS;
    void displayBikeInfo() {
        System.out.println("Inside Child class: ");
        System.out.println("EngineCapacity: " + engineCapacity);
        System.out.println("HasABS: " + hasABS);
    }
}
public class Day11q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Bike11 bike = new Bike11();
        System.out.println("Enter the brand: ");
        bike.brand = input.nextLine();
        System.out.println("Enter the registration number: ");
        bike.registrationNumber = input.nextInt();
        System.out.println("Enter the Engine capacity (cc): ");
        bike.engineCapacity = input.nextInt();
        input.nextLine();
        System.out.println("Enter the ABS: ");
        bike.hasABS = input.nextLine();
        bike.displayVehicleInfo();
        bike.displayBikeInfo();

    }
}
