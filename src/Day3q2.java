import java.util.Scanner;
class Student3{
    int totalval;
    int calculateTotal(int mark1,int mark2,int mark3){
        totalval=mark1+mark2+mark3;
        return totalval;
    }
    float calculateAverage(){
        float avg=(float)totalval/3;
        return avg;
    }
    void displayDetails(String name,int mark1,int mark2,int mark3){
        System.out.println("Name: "+name);
        System.out.println("Mark1: "+mark1);
        System.out.println("Mark2: "+mark2);
        System.out.println("Mark3: "+mark3);

    }
}
public class Day3q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student3 s=new Student3();
        System.out.println("Enter Student name: ");
        String name = input.nextLine();
        System.out.println("Enter Student mark1: ");
        int mark1 = input.nextInt();
        System.out.println("Enter Student mark2: ");
        int mark2 = input.nextInt();
        System.out.println("Enter Student mark3: ");
        int mark3 = input.nextInt();
        s.displayDetails(name,mark1,mark2,mark3);
        System.out.println(s.calculateTotal(mark1,mark2,mark3));
        System.out.println(s.calculateAverage());
    }
}
