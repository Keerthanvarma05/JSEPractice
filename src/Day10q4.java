import java.util.Scanner;
class SmartDevice10 {
    String brand;
    String operatingSystem;
    void displayDeviceInfo() {
        System.out.println("Inside Parent class: ");
        System.out.println("Brand: " + brand);
        System.out.println("Operating System: " + operatingSystem);
    }
}
class SmartPhone10 extends SmartDevice10 {
    int cameraMP;
    int storage;
    void displayPhoneInfo() {
        System.out.println("Inside Child1 class: ");
        System.out.println("Camera MP: " + cameraMP);
        System.out.println("Storage: " + storage);
    }
}
class SmartWatch10 extends SmartDevice10 {
    int batteryLife;
    String waterproof;
    void displayWatchInfo() {
        System.out.println("Inside Child2 class: ");
        System.out.println("Battery Life: " + batteryLife);
        System.out.println("Water Proof: " + waterproof);
    }
}
class SmartTV10 extends SmartDevice10 {
    int screenSize;
    boolean supports4K;
    void displayTVInfo(){
        System.out.println("Inside Child3 class: ");
        System.out.println("Screen Size: " + screenSize);
        System.out.println("Supports 4K: " + supports4K);
    }
}
public class Day10q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SmartPhone10 p = new SmartPhone10();
        System.out.println("Enter the brand: ");
        p.brand = input.nextLine();
        System.out.println("Enter the operating system: ");
        p.operatingSystem = input.nextLine();
        System.out.println("Enter the camera MP: ");
        p.cameraMP = input.nextInt();
        System.out.println("Enter the storage: ");
        p.storage = input.nextInt();
        input.nextLine();
        p.displayDeviceInfo();
        p.displayPhoneInfo();

        SmartWatch10 w = new SmartWatch10();
        System.out.println("Enter the brand: ");
        w.brand = input.nextLine();
        System.out.println("Enter the operating system: ");
        w.operatingSystem = input.nextLine();
        System.out.println("Enter battery life: ");
        w.batteryLife = input.nextInt();
        input.nextLine();
        System.out.println("Enter Water Proof or not: ");
        w.waterproof = input.nextLine();
        w.displayDeviceInfo();
        w.displayWatchInfo();

        SmartTV10 t = new SmartTV10();
        System.out.println("Enter the brand: ");
        t.brand = input.nextLine();
        System.out.println("Enter the operating system: ");
        t.operatingSystem = input.nextLine();
        System.out.println("Enter screen size: ");
        t.screenSize = input.nextInt();
        input.nextLine();
        System.out.println("Enter supports 4K: ");
        t.supports4K = input.nextBoolean();
        if(t.supports4K) {
            t.displayDeviceInfo();
            t.displayTVInfo();
            System.out.println("4 K Supported");
        }else {
            t.displayDeviceInfo();
            t.displayTVInfo();
            System.out.println("Standard Resolution");
        }
    }
}
