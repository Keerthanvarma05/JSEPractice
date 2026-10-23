interface Switchable14 {
    public void turnOn();
    public void turnOff();
}

class SmartBulb14 implements Switchable14 {
    @Override
    public void turnOn() {
        System.out.println("Smart Bulb Turn On");
    }
    @Override
    public void turnOff() {
        System.out.printf("Smart Bulb Turn Off");
    }
}

class SmartSpeaker14 implements Switchable14 {
    @Override
    public void turnOn() {
        System.out.println("Smart Speaker Turn On");
    }
    @Override
    public void turnOff() {
        System.out.printf("Smart Speaker Turn Off");
    }
}
public class Day14q3 {
    public static void main(String[] args) {
        Switchable14 device;
        System.out.println("Smart Bulb: ");
        device = new SmartBulb14();
        device.turnOn();
        device.turnOff();
        System.out.println("\n");
        System.out.println("Smart Speaker: ");
        device = new SmartSpeaker14();
        device.turnOn();
        device.turnOff();
    }
}
