import java.util.Scanner;
class Mobile{
    String brand;
    String model;
    int price;
    void display(){
        System.out.println("Brand: "+brand);
        System.out.println("Model: "+model);
        System.out.println("Price: "+price);
    }
}
public class Day1q2 {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    Mobile m1 = new Mobile();
    Mobile m2 = new Mobile();
    Mobile m3 = new Mobile();
    //Mobile1
    System.out.println("Enter brand: ");
    m1.brand=sc.next();
    System.out.println("Enter model: ");
    m1.model=sc.next();
    System.out.println("Enter price: ");
    m1.price=sc.nextInt();
    //Mobile2
        System.out.println("Enter brand name: ");
        m2.brand=sc.nextLine();
        sc.next();
        System.out.println("Enter model name: ");
        m2.model=sc.nextLine();
        sc.next();
        System.out.println("Enter price name: ");
        m2.price=sc.nextInt();
        System.out.println("Enter brand name: ");
        m3.brand=sc.nextLine();
        sc.next();
        System.out.println("Enter model name: ");
        m3.model=sc.nextLine();
        sc.next();
        System.out.println("Enter price name: ");
        m3.price=sc.nextInt();
        sc.close();
}
}
