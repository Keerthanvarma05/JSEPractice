class Appliance13 {
    String brand;
    int warrantyYears;

    void turnOn() {
        System.out.println("Turning on appliance...");
    }
}
class Microwave13 extends Appliance13 {
    @Override
    void turnOn() {
        System.out.println(" Heating food...");
    }
}
public class Day13q1 {
    public static void main(String[] args) {
        Appliance13 appliance = new Microwave13();
        appliance.turnOn();
    }
}
