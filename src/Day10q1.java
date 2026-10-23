import java.util.Scanner;
class Appliance10 {
    String Brand;
    int powerConsumption;
    void displayApplianceInfo() {
        System.out.println("Inside Parent Class: ");
        System.out.println("Brand: " + Brand);
        System.out.println("PowerConsumption: " + powerConsumption);
    }
}
class Fan extends Appliance10 {
    int numberOfBlades;
    int speedLevels;
    void displayFanInfo() {
        System.out.println("Inside Child1 class: ");
        System.out.println("Number of Blades: " + numberOfBlades);
        System.out.println("Speed Levels: " + speedLevels);
    }
}
class AirConditioner extends Appliance10 {
    int tonnage;
    String inverterType;
    void displayACInfo(){
        System.out.println("Inside Child2 class: ");
        System.out.println("Tonnage: " + tonnage);
        System.out.println("Inverter Type: " + inverterType);
    }
}
public class Day10q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Fan f = new Fan();
        System.out.println("Enter Brand name: ");
        f.Brand = input.nextLine();
        System.out.println("Enter Power Consumption: ");
        f.powerConsumption = input.nextInt();
        System.out.println("Enter Number of Blades: ");
        f.numberOfBlades = input.nextInt();
        System.out.println("Enter speed levels: ");
        f.speedLevels = input.nextInt();
        input.nextLine();
        f.displayApplianceInfo();
        f.displayFanInfo();
        AirConditioner a = new AirConditioner();
        System.out.println("Enter Brand name: ");
        a.Brand = input.nextLine();
        System.out.println("Enter Power Consumption: ");
        a.powerConsumption = input.nextInt();
        System.out.println("Enter tonnage: ");
        a.tonnage = input.nextInt();
        input.nextLine();
        System.out.println("Enter inverter type: ");
        a.inverterType = input.nextLine();
        a.displayApplianceInfo();
        a.displayACInfo();
    }
}
