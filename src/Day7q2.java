import java.util.Scanner;
class GymMembership{
    private String Member_Name;
    private String Membership_Type;
    private int Monthly_Fee;
    public GymMembership(){

    }

    public GymMembership(String Member_Name, String Membership_Type, int Monthly_Fee) {
        this.Member_Name = Member_Name;
        this.Membership_Type = Membership_Type;
        this.Monthly_Fee = Monthly_Fee;
    }

    void displayDetails(){
        System.out.println("Member Name: " + Member_Name);
        System.out.println("Membership Type: " + Membership_Type);
        System.out.println("Monthly Fee: " + Monthly_Fee);
    }
}
public class Day7q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=3;
        GymMembership[] gm = new GymMembership[n];
        for(int i=0;i<gm.length;i++){
            System.out.println("Enter Gym Member Name: ");
            String Member_Name = input.nextLine();
            System.out.println("Enter Gym Membership Type: ");
            String Membership_Type = input.nextLine();
            System.out.println("Enter Gym Monthly Fee: ");
            int Monthly_Fee = input.nextInt();
            input.nextLine();
            gm[i]=new GymMembership();
            gm[i] = new GymMembership(Member_Name, Membership_Type, Monthly_Fee);
            gm[i].displayDetails();
        }
    }
}
