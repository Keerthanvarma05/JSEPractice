import java.util.Scanner;
interface Attendance14 {
    public void markAttendance();
}

class Person14 {
    private String name;
    private int id;
    public Person14(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
}

class Student14 extends Person14 implements Attendance14 {
    public Student14(String name, int id) {
        super(name, id);
    }
    String branch;
    int semester;
    @Override
    public void markAttendance() {
        System.out.println("Attendance Marked for Student");
    }
    void calculateAttendancePercentage(int attended,int total){
        System.out.println("Attendance Percentage: " + (total*100/attended));
    }
}

class Faculty14 extends Person14 implements Attendance14 {
    public Faculty14(String name, int id) {
        super(name, id);
    }
    String subject;
    int experience;
    @Override
    public void markAttendance() {
        System.out.println("Attendance Marked for Faculty");
    }
    void displayWorkExperience(){

    }
}

public class Day14q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Attendance14 person;
        System.out.println("Enter Student Name: ");
        String name1 = input.nextLine();
        System.out.println("Enter Student ID: ");
        int id1 = input.nextInt();
        input.nextLine();
        person =new Student14(name1,id1);
        person.markAttendance();
        System.out.println("Enter no.of students attended: ");
        int attended = input.nextInt();
        System.out.println("Enter total no.of students: ");
        int total = input.nextInt();
        input.nextLine();
        System.out.println("Enter branch: ");
        person.branch = input.nextLine();
        System.out.println("Enter semester: ");
        person.semester = input.nextInt();
        input.nextLine();
        System.out.println("Student: "+((Person14)person).getName());
        System.out.println("Branch: "+);
        ((Student14) person).calculateAttendancePercentage(attended,total);

        System.out.println("Enter Faculty Name: " );
        String name2 = input.nextLine();
        System.out.println("Enter Faculty ID: ");
        int id2 = input.nextInt();
        person= new Faculty14(name2,id2);
        person.markAttendance();
        ((Faculty14) person).displayWorkExperience();
        
    }
}

/* Student : Varma

Branch : IT

Semester : 5

Attendance : 92%

Faculty : Ramesh

Subject : Java

Experience : 8 Years */