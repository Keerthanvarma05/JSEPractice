import java.util.Scanner;
class Course12 {
    String courseTitle;
    String instructor;
    void startCourse() {
        System.out.println("Starting Course...");
    }
}
class LiveCourse12 extends Course12 {
    @Override
    void startCourse() {
        System.out.println("Course title: " + courseTitle);
        System.out.println("Instructor: " + instructor);
        System.out.println("Joining Live Session...");
    }
    int attendancePercentage(int attended, int total){
        return (attended*100)/total;
    }
}
class RecordedCourse12 extends Course12 {
    @Override
    void startCourse() {
        System.out.println("Course title: " + courseTitle);
        System.out.println("Instructor: " + instructor);
        System.out.println("Playing Recorded Videos...");
    }
    int remainingVideos(int watched, int total){
       return (total-watched);
    }
}
public class Day12q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Course12 course;

        //Live Course
        course = new LiveCourse12();
        System.out.println("Live Course: ");
        System.out.println("Enter Course title:");
        course.courseTitle = input.nextLine();
        System.out.println("Enter Instructor:");
        course.instructor = input.nextLine();
        System.out.println("Enter attended: ");
        int attended = input.nextInt();
        System.out.println("Enter total Strength: ");
        int total1 = input.nextInt();
        input.nextLine();
        course.startCourse();
        LiveCourse12 lc = (LiveCourse12)course;
        System.out.println("Attendance: "+lc.attendancePercentage(attended,total1));

        //Recorded course
        course = new RecordedCourse12();
        System.out.println("Recorded course: ");
        System.out.println("Enter Course title:");
        course.courseTitle = input.nextLine();
        System.out.println("Enter Instructor:");
        course.instructor = input.nextLine();
        System.out.println("Enter watched: ");
        int watched = input.nextInt();
        System.out.println("Enter Total: ");
        int total2=input.nextInt();
        course.startCourse();
        RecordedCourse12 rc = (RecordedCourse12)course;
        System.out.println("Remaining videos: "+rc.remainingVideos(watched,total2));
        input.close();
    }
}
