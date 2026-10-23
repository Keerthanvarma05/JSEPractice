import java.lang.*;
import java.util.*;
class Circle1{
    float radius;
    Circle1(float radius){
        this.radius=radius;
    }
    void calcArea(){
        double area=Math.PI*(radius*radius);
        System.out.println("Area of circle is: "+area);
    }
    void calcCircumference(){
        double circumference=2*Math.PI*radius;
        System.out.println("Circumference of circle is: "+circumference);
    }
}
public class Day2q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of circle1: ");
        float r1=sc.nextFloat();
        Circle1 c1=new Circle1(r1);
        System.out.println("Enter the radius of circle2: ");
        float r2=sc.nextFloat();
        Circle1 c2=new Circle1(r2);
        System.out.println("Enter the radius of circle3: ");
        float r3=sc.nextFloat();
        Circle1 c3=new Circle1(r3);
        System.out.println("Enter the radius of circle4: ");
        float r4=sc.nextFloat();
        Circle1 c4=new Circle1(r4);
        System.out.println("Radius of circle1: "+c1.radius);
        c1.calcArea();
        c1.calcCircumference();
        System.out.println("Radius of circle2: "+c2.radius);
        c2.calcArea();
        c2.calcCircumference();
        System.out.println("Radius of circle3: "+c3.radius);
        c3.calcArea();
        c3.calcCircumference();
        System.out.println("Radius of circle4: "+c4.radius);
        c4.calcArea();
        c4.calcCircumference();
    }
}
