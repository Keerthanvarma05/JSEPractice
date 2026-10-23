import java.util.*;
class Circle{

    float radius;
    float pi=3.14f;
    void calcArea(){
        System.out.println(pi*(radius*radius));
    }
    void calcCircumference(){
        System.out.println(2*pi*radius);
    }
}
public class Day1q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Circle c1=new Circle();
        Circle c2=new Circle();
        Circle c3=new Circle();
        System.out.print("Enter radius of Circle 1: ");
        c1.radius = sc.nextFloat();

        System.out.print("Enter radius of Circle 2: ");
        c2.radius = sc.nextFloat();

        System.out.print("Enter radius of Circle 3: ");
        c3.radius = sc.nextFloat();
        System.out.println("\nCircle1: ");
        c1.calcArea();
        c1.calcCircumference();
        System.out.println("\nCircle2: ");
        c2.calcArea();
        c2.calcCircumference();
        System.out.println("\nCircle3: ");
        c3.calcArea();
        c3.calcCircumference();
    }

}
