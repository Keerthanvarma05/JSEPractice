import java.util.Scanner;
class OnlineCourse9 {
    String courseName;
    String instructor;
    void displayCourseInfo(){
        System.out.println("Inside Parent class: ");
        System.out.println("Course: "+courseName);
        System.out.println("Instructor: "+instructor);
    }
}
class ProgrammingCourse extends OnlineCourse9 {
    String programmingLanguage;
    int durationWeeks;
    void displayProgrammingInfo(){
        System.out.println("Inside Child1 class: ");
        System.out.println("Programming Language: "+programmingLanguage);
        System.out.println("Duration Weeks: "+durationWeeks);
    }
}
class JavaCourse extends ProgrammingCourse {
    String framework;
    String certificationAvailable;
        void displayJavaCourseInfo () {
        System.out.println("Inside Child2 class: ");
        System.out.println("Framework: " + framework);
        System.out.println("Certification Available: " + certificationAvailable);
    }
}
public class Day9q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=3;
        JavaCourse[] jc = new JavaCourse[n];
        for(int i=0;i<n;i++){
            jc[i]=new JavaCourse();
            System.out.println("Enter Course Name: ");
            jc[i].courseName = input.nextLine();
            System.out.println("Enter Instructor: ");
            jc[i].instructor = input.nextLine();
            System.out.println("Enter Programming Language: ");
            jc[i].programmingLanguage = input.nextLine();
            System.out.println("Enter Duration Weeks: ");
            jc[i].durationWeeks = input.nextInt();
            input.nextLine();
            System.out.println("Enter framework: ");
            jc[i].framework = input.nextLine();
            System.out.println("Enter Certification Available: ");
            jc[i].certificationAvailable = input.nextLine();
            if(jc[i].certificationAvailable.equalsIgnoreCase("Yes")){
                jc[i].displayCourseInfo();
                jc[i].displayProgrammingInfo();
                jc[i].displayJavaCourseInfo();
            }
        }
        input.close();
    }
}

