import java.util.Scanner;
class Appliance{
    String company;
    int powerRating;
    void displayApplianceInfo(){
        System.out.println("Company: "+company);
        System.out.println("PowerRating: "+powerRating+" W");
    }
}
class WashingMachine extends Appliance{
    int capacity;
    String washMode;
    void displayMachineInfo(){
        System.out.println("Capacity: "+capacity);
        System.out.println("Wash Mode: "+washMode);
    }
}
public class Day8q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=3;
        WashingMachine[] wm = new WashingMachine[3];
        for(int i=0;i<wm.length;i++){
            wm[i]=new WashingMachine();
            System.out.println("Enter the company: ");
            wm[i].company=sc.nextLine();
            System.out.println("Enter the power rating: ");
            wm[i].powerRating=sc.nextInt();
            System.out.println("Enter the capacity: ");
            wm[i].capacity=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the wash mode: ");
            wm[i].washMode=sc.nextLine();
            if(wm[i].capacity>=8) {
                wm[i].displayApplianceInfo();
                wm[i].displayMachineInfo();
            }
        }
        sc.close();
    }
}



