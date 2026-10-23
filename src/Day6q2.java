import java.util.Scanner;
class FlightTicket{
    private String Passenger_Name;
    private int Flight_Number;
    private String Destination;
    private int Ticket_Price;

    public String getPassenger_Name() {
        return Passenger_Name;
    }

    public void setPassenger_Name(String passenger_Name) {
        this.Passenger_Name = passenger_Name;
    }

    public int getFlight_Number() {
        return Flight_Number;
    }

    public void setFlight_Number(int flight_Number) {
        this.Flight_Number = flight_Number;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String destination) {
        this.Destination = destination;
    }

    public int getTicket_Price() {
        return Ticket_Price;
    }

    public void setTicket_Price(int ticket_Price) {
        this.Ticket_Price = ticket_Price;
    }

}
public class Day6q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=2;
        FlightTicket[] ft= new FlightTicket[n];
        for(int i=0;i<ft.length;i++) {
            System.out.println("Enter Passenger Name: ");
            String Passenger= input.nextLine();
            System.out.println("Enter Flight_Number: ");
            int Flight= input.nextInt();
            input.nextLine();
            System.out.println("Enter Destination: ");
            String Destination= input.nextLine();
            System.out.println("Enter Ticket_Price: ");
            int Price= input.nextInt();
            input.nextLine();
            ft[i]=new FlightTicket();
            ft[i].setPassenger_Name(Passenger);
            ft[i].setFlight_Number(Flight);
            ft[i].setDestination(Destination);
            ft[i].setTicket_Price(Price);
            System.out.println(ft[i].getPassenger_Name());
            System.out.println(ft[i].getFlight_Number());
            System.out.println(ft[i].getDestination());
            System.out.println(ft[i].getTicket_Price());

        }
        input.close();
    }
}
