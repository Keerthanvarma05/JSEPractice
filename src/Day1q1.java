import java.util.*;

class Student {
    String name;
    int rno;
    String branch;

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rno);
        System.out.println("Branch: " + branch);
    }
}

public class Day1q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();
        Student s2 = new Student();

        // Student 1
        System.out.println("Enter Student 1 Name:");
        s1.name = sc.nextLine();

        System.out.println("Enter Student 1 Roll Number:");
        s1.rno = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.println("Enter Student 1 Branch:");
        s1.branch = sc.nextLine();

        // Student 2
        System.out.println("Enter Student 2 Name:");
        s2.name = sc.nextLine();

        System.out.println("Enter Student 2 Roll Number:");
        s2.rno = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.println("Enter Student 2 Branch:");
        s2.branch = sc.nextLine();

        // Display Details
        System.out.println("\nStudent 1 Details:");
        s1.displayDetails();

        System.out.println("\nStudent 2 Details:");
        s2.displayDetails();

        sc.close();
    }
}