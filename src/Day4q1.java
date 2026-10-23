import java.util.Scanner;
class Student4{
    String name;
    int rollno;
    String branch;
    public Student4(String name, int rollno, String branch){
        this.name = name;
        this.rollno = rollno;
        this.branch = branch;
    }
    public void Display(){
        System.out.println(this.name);
        System.out.println(this.rollno);
        System.out.println(this.branch);
    }
}
public class Day4q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Student Name: ");
        String name = input.nextLine();
        System.out.println("Student rollno: ");
        int rollno = input.nextInt();
        System.out.println("Student branch: ");
        String branch = input.next();
        Student4 s1 = new Student4(name,rollno,branch);
        s1.Display();
    }
}
