import java.util.Scanner;
class Appliance9{
    String company;
    int powerRating;
    void displayApplianceInfo(){
        System.out.println("Inside parent class: ");
        System.out.println("Company: "+company);
        System.out.println("Power Rating: "+powerRating+" W");
    }
}
class Refrigerator extends Appliance9{
    int capacity;
    String doorType;
    void displayRefrigeratorInfo(){
        System.out.println("Inside child1 class: ");
        System.out.println("Capacity: "+capacity+"L");
        System.out.println("Door Type: "+doorType);
    }
}
class SmartRefrigerator extends Refrigerator{
    String wifiEnabled;
    String voiceControl;
    void displaySmartFeatures(){
        System.out.println("Inside child2 class: ");
        System.out.println("Wi-fi Enabled: "+wifiEnabled);
        System.out.println("Voice Control: "+voiceControl);
    }
}
public class Day9q2
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=2;
        SmartRefrigerator[] sr = new SmartRefrigerator[n];
        for(int i=0;i<sr.length;i++){
            sr[i]=new SmartRefrigerator();
            System.out.println("Enter company: ");
            sr[i].company=input.nextLine();
            System.out.println("Enter powerRating: ");
            sr[i].powerRating=input.nextInt();
            System.out.println("Enter capacity: ");
            sr[i].capacity=input.nextInt();
            input.nextLine();
            System.out.println("Enter doorType: ");
            sr[i].doorType=input.nextLine();
            System.out.println("Enter wifiEnabled: ");
            sr[i].wifiEnabled=input.nextLine();
            System.out.println("Enter voiceControl: ");
            sr[i].voiceControl=input.nextLine();
            sr[i].displayApplianceInfo();
            sr[i].displayRefrigeratorInfo();
            sr[i].displaySmartFeatures();
        }
        input.close();
    }
}
