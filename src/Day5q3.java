import java.util.Scanner;
class Movieticket{
    String Movie_Name="Odessey";
    String Seat_Type="Gold";
    int Ticket_Price=199;

    Movieticket(){
        System.out.println("Inside Movieticket Default constructor: ");
    }
    Movieticket(String Movie_Name){
        System.out.println("Inside Movieticket Single parameterized constructor: ");
        this.Movie_Name = Movie_Name;
    }

    Movieticket(String Movie_Name,String Seat_Type,int Ticket_Price){
        System.out.println("Inside Movieticket multiple parameterized constructor: ");
        this.Movie_Name = Movie_Name;
        this.Seat_Type = Seat_Type;
        this.Ticket_Price = Ticket_Price;
    }

    void Display(){
        System.out.println("Movie Name: "+Movie_Name);
        System.out.println("Seat Type: "+Seat_Type);
        System.out.println("Ticket Price: "+Ticket_Price);
    }
}
public class Day5q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Movieticket t1 = new Movieticket();
        t1.Display();

        System.out.println("Enter the Movie Name: ");
        String Movie_Name1 = sc.nextLine();
        Movieticket t2 = new Movieticket(Movie_Name1);
        t2.Display();

        System.out.println("Enter the Movie Name: ");
        String Movie_Name2 =sc.nextLine();
        System.out.println("Enter the Seat Type: ");
        String Seat_Type2 = sc.nextLine();
        System.out.println("Enter the Ticket Price: ");
        int Ticket_Price2 = sc.nextInt();
        sc.nextLine();
        Movieticket t3 = new Movieticket(Movie_Name2,Seat_Type2,Ticket_Price2);
        t3.Display();

        System.out.println("Enter the Movie Name: ");
        String Movie_Name3 =sc.nextLine();
        System.out.println("Enter the Seat Type: ");
        String Seat_Type3 = sc.nextLine();
        System.out.println("Enter the Ticket Price: ");
        int Ticket_Price3 = sc.nextInt();

        Movieticket t4 = new Movieticket(Movie_Name3,Seat_Type3,Ticket_Price3);
        t4.Display();
        sc.close();
    }
}
