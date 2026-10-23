import java.util.Scanner;
class Buspass{
    private String PassengerName;
    private String BusRoute;
    private int Validity;

    public String getPassengerName() {
        return PassengerName;
    }

    public void setPassengerName(String passengerName) {
        this.PassengerName = passengerName;
    }

    public String getBusRoute() {
        return BusRoute;
    }

    public void setBusRoute(String busRoute) {
        this.BusRoute = busRoute;
    }

    public int getValidity() {
        return Validity;
    }

    public void setValidity(int validity) {
        this.Validity = validity;
    }
}
public class Day7q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=3;
        Buspass[] bp = new Buspass[n];
        for(int i=0;i<bp.length;i++){
            bp[i]=new Buspass();
            System.out.println("Enter Passenger Name:");
            bp[i].setPassengerName(sc.nextLine());
            System.out.println("Enter BusRoute:");
            bp[i].setBusRoute(sc.nextLine());
            System.out.println("Enter Validity:");
            bp[i].setValidity(sc.nextInt());
            sc.nextLine();
            if(bp[i].getValidity()>=6){
                System.out.println("\n-----Bus Pass Details:-----");
                System.out.println("Passenger Name: "+bp[i].getPassengerName());
                System.out.println("BusRoute: "+bp[i].getBusRoute());
                System.out.println("Validity: "+bp[i].getValidity());
            }
        }
        sc.close();
    }
}
