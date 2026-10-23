import java.util.Scanner;
abstract class SmartDevice13 {
    String deviceName;
    int powerConsumption;

    abstract void operate();
}
class SmartLight13 extends SmartDevice13 {
    @Override
    void operate() {
        System.out.println("Light Turned ON");
    }
    void calculatePowerUsage(int hours) {
        System.out.println("Device: "+deviceName);
        System.out.println("Power: "+powerConsumption);
        System.out.println("Hours: "+hours);
        int Power_Usage = powerConsumption * hours;
        System.out.println("Power Usage: " + Power_Usage);
    }
}
class SmartFan13 extends SmartDevice13 {
    @Override
    void operate() {
        System.out.println("Fan Turned ON");
    }
    void calculatePowerUsage(int hours) {
        System.out.println("Device: "+deviceName);
        System.out.println("Power: "+powerConsumption);
        System.out.println("Hours: "+hours);
        int Power_Usage = powerConsumption * hours;
        System.out.println("Power Usage: " + Power_Usage);
    }
}
public class Day13q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SmartLight13 sl = new SmartLight13();
        sl.operate();
        System.out.println("Enter Device Name: ");
        sl.deviceName = input.nextLine();
        System.out.println("Enter Power Consumption: ");
        sl.powerConsumption = input.nextInt();
        System.out.println("Enter no.of hours: ");
        int hours1 = input.nextInt();
        input.nextLine();
        sl.calculatePowerUsage(hours1);
        SmartFan13 sf = new SmartFan13();
        sf.operate();
        System.out.println("Enter Device Name: ");
        sf.deviceName = input.nextLine();
        System.out.println("Enter Power Consumption: ");
        sf.powerConsumption = input.nextInt();
        System.out.println("Enter no.of hours: ");
        int hours2 = input.nextInt();
        sf.calculatePowerUsage(hours2);
    }
}
