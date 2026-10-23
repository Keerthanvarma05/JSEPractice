import java.util.Scanner;
class Person{
    String name;
    int age;
    void displayPersonInfo(){
        System.out.println("Inside Parent class");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
class Teacher extends Person{
    String subject;
    int experience;
    void displayTeacherInfo(){
        System.out.println("Inside child1 class");
        System.out.println("Subject: "+subject);
        System.out.println("Experience: "+experience+" Years");
    }
}
class Principal extends Teacher{
    String schoolName;
    int yearsAsPrincipal;
    void displayPrincipalInfo(){
        System.out.println("Inside child2 class");
        System.out.println("School Name: "+schoolName);
        System.out.println("Years as Principal: "+yearsAsPrincipal+" Years");
    }
}
public class Day9q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Principal p = new Principal();
        System.out.println("Enter the name of Person: ");
        p.name = sc.nextLine();
        System.out.println("Enter the age of Person: ");
        p.age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the subject: ");
        p.subject = sc.nextLine();
        System.out.println("Enter the experience: ");
        p.experience = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter SchoolName: ");
        p.schoolName = sc.nextLine();
        System.out.println("Enter the years as Principal: ");
        p.yearsAsPrincipal = sc.nextInt();
        p.displayPersonInfo();
        p.displayTeacherInfo();
        p.displayPrincipalInfo();
        sc.close();
    }
}
