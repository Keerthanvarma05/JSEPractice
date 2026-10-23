import java.util.Scanner;
class Subscription{
    String Platform_Name="Netflix";
    int Monthly_Price=199;
    String Plan_Type="Mobile";
    public Subscription(){
        System.out.println("Inside Default Constructor: ");
    }
    public Subscription(String Platform_name){
        this.Platform_Name=Platform_name;
        System.out.println("Inside single parameter Constructor: ");
    }
    public Subscription(String Platform_Name, int Monthly_Price, String Plan_Type){
        this.Platform_Name=Platform_Name;
        this.Monthly_Price=Monthly_Price;
        this.Plan_Type=Plan_Type;
        System.out.println("Inside multiple parameter Constructor: ");
    }
    void display() {
        System.out.println("Platform : " + Platform_Name);
        System.out.println("Price : " + Monthly_Price);
        System.out.println("Plan : " + Plan_Type);
    }
}
public class Day5q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Subscription sub1 = new Subscription();
        sub1.display();

        System.out.println("Enter Platform Name:");
        String Platform_Name1 = input.nextLine();
        Subscription sub2 = new Subscription(Platform_Name1);
        sub2.display();

        System.out.println("Enter the Platform name: ");
        String Platform_Name2 = input.nextLine();
        System.out.println("Enter the Monthly Price: ");
        int Monthly_Price = input.nextInt();
        input.nextLine();
        System.out.println("Enter the Plan Type: ");
        String Plan_Type = input.nextLine();
        Subscription sub3 = new Subscription(Platform_Name2, Monthly_Price, Plan_Type);
        sub3.display();
    }
}
