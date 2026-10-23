import java.util.*;
class ElectronicDevice{
    String brand;
    int warrantyYears;
    void displayDeviceInfo(){
        System.out.println("Brand: "+brand);
        System.out.println("Warranty Years: "+warrantyYears);
    }
}
class SmartPhone extends ElectronicDevice{
    String model;
    int storage;
    void displayPhoneInfo(){
        System.out.println("Model: "+model);
        System.out.println("Storage: "+storage);
    }
}
public class Day8q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SmartPhone obj = new SmartPhone();
        System.out.println("Enter the Brand: ");
        obj.brand=input.nextLine();
        System.out.println("Enter the Warranty Years: ");
        obj.warrantyYears=input.nextInt();
        input.nextLine();
        System.out.println("Enter the Model: ");
        obj.model=input.nextLine();
        System.out.println("Enter the Storage: ");
        obj.storage=input.nextInt();
        obj.displayDeviceInfo();
        obj.displayPhoneInfo();
    }
}

