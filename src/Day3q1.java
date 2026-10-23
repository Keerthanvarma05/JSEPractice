import java.util.Scanner;
class Calculator{
int add(int a,int b){
    int c=a+b;
    return c;
}
void subtract(int a,int b){
    System.out.println("Subtraction: "+ (a-b));
}
}
public class Day3q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculator c = new Calculator();
        System.out.println("enter the first number: ");
        int a = input.nextInt();
        System.out.println("enter the second number: ");
        int b = input.nextInt();
        System.out.println("Addition: "+c.add(a,b));
        c.subtract(a,b);
    }
}
