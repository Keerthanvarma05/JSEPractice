import java.util.Scanner;
class Vehicle{
    String company;
    String registrationNumber;
    void displayVehicleInfo(){
        System.out.println("Company: "+company);
        System.out.println("Registration Number: "+registrationNumber);
    }
}
class ElectricCar extends Vehicle{
    int batteryCapacity;
    int rangePerCharge;
    void displayElectricCarInfo(){
        System.out.println("Battery Capacity: "+batteryCapacity);
        System.out.println("Range Per Charge: "+rangePerCharge);
    }
    void calculateChargingStops(int tripDistance){
        if(rangePerCharge >= tripDistance){
            System.out.println("No.of Charging stops required"+0);
        }else{
            int dis;
            if(tripDistance % rangePerCharge==0) {
                dis = (tripDistance / rangePerCharge) - 1;
            }else{
                dis = (tripDistance / rangePerCharge);
            }
            System.out.println("Charging stops required: "+dis);
        }
    }
}
public class Day8q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ElectricCar ec=new ElectricCar();
        System.out.println("Enter the company: ");
        ec.company=sc.nextLine();
        System.out.println("Enter the registration number: ");
        ec.registrationNumber=sc.nextLine();
        System.out.println("Enter the power rating: ");
        ec.batteryCapacity=sc.nextInt();
        System.out.println("Enter the range per charge: ");
        ec.rangePerCharge=sc.nextInt();
        System.out.println("Enter the trip distance: ");
        int tripDistance=sc.nextInt();
        ec.displayVehicleInfo();
        ec.displayElectricCarInfo();
        ec.calculateChargingStops(tripDistance);
        sc.close();
    }
}
