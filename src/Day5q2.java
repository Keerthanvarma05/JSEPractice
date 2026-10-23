import java.util.Scanner;
class Pizza5{
    String Size="medium";
    String Cheese="Yes";
    int Price=299;

    public Pizza5(){
        System.out.println("Inside Default Constructor: ");
    }

    public Pizza5(String Size){
        System.out.println("Inside Single parameters Constructor: ");
        this.Size=Size;
    }

    public Pizza5(String Size,String Cheese){
        System.out.println("Inside double parameters Constructor: ");
        this.Size=Size;
        this.Cheese=Cheese;

    }

    public Pizza5(String Size,String Cheese,int Price){
        System.out.println("Inside Multiple parameters Constructor: ");
        this.Size=Size;
        this.Cheese=Cheese;
        this.Price=Price;
    }
    void display(){
        System.out.println("Size of the Pizza: "+Size);

        System.out.println("Cheese for the Pizza: "+Cheese);

        System.out.println("Price of the Pizza: "+Price);
    }
}
public class Day5q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pizza5 p1 = new Pizza5();
        p1.display();

        System.out.println("Enter the size of the pizza: ");
        String size = sc.nextLine();
        Pizza5 p2 = new Pizza5(size);
        p2.display();

        System.out.println("Enter the size of the pizza: ");
        String size2 = sc.nextLine();
        System.out.println("Do you want cheese or not: ");
        String Cheese2 = sc.nextLine();
        Pizza5 p3 = new Pizza5(size2,Cheese2);
        p3.display();

        System.out.println("Enter the size of the pizza: ");
        String size3 = sc.nextLine();
        System.out.println("Do you want cheese or not: ");
        String Cheese3 = sc.nextLine();
        System.out.println("Enter the price of the pizza: ");
        int Price = sc.nextInt();
        Pizza5 p4 = new Pizza5(size3,Cheese3,Price);
        p4.display();
    }
}
