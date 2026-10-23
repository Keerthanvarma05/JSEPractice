import java.util.Scanner;
class Rectangle{
    int length,width;
    Rectangle(int length,int width){
        this.length=length;
        this.width=width;
    }
    int calcArea(){

        return length*width;
    }
    int calcPerimeter(){

        return 2*(length+width);
    }
}
public class Day3q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle1: ");
        int l1 = input.nextInt();
        System.out.println("Enter the width of the rectangle1: ");
        int w1 = input.nextInt();
        Rectangle rec1 = new Rectangle(l1,w1);
        System.out.println("Enter the length of the rectangle2: ");
        int l2 = input.nextInt();
        System.out.println("Enter the width of the rectangle2: ");
        int w2 = input.nextInt();
        Rectangle rec2 = new Rectangle(l2,w2);
        System.out.println("Area of rectangle1: "+rec1.calcArea());
        System.out.println("Perimeter of rectangle1: "+rec1.calcPerimeter());
        System.out.println("Area of rectangle2: "+rec2.calcArea());
        System.out.println("Perimeter of rectangle2: "+rec2.calcPerimeter());
    }
}
