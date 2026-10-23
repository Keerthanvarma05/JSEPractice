import java.util.Scanner;
class Ride12 {
    String pickupLocation;
    String destination;
    void calculateFare(double distance) {
        System.out.println("Calculating Fare...");
    }
}
class BikeRide12 extends Ride12 {
    @Override
    void calculateFare(double distance) {
        System.out.println("Bike Ride: ");
        System.out.println("Distance: " + distance+"km");
        System.out.println("Fare: ₹"+distance*8);
    }
}
class CabRide12 extends Ride12 {
    @Override
    void calculateFare(double distance) {
        System.out.println("Cab Ride: ");
        System.out.println("Distance: " + distance);
        System.out.println("Fare: ₹"+distance*18);
    }
}
public class Day12q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Ride12 ride;
        ride=new BikeRide12();
        System.out.println("Enter Distance: ");
        ride.calculateFare(input.nextDouble());
        System.out.println("Enter Distance: ");
        ride=new CabRide12();
        ride.calculateFare(input.nextDouble());
    }
}
