import java.util.Scanner;
class course7{
    private String coursename;
    private String trainer;
    private int duration;
    public course7(String coursename, String trainer, int duration) {
        this.coursename = coursename;
        this.trainer = trainer;
        this.duration = duration;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public String getTrainer() {
        return trainer;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    void displayDetails(){
        System.out.println("Course Name: " + getCoursename());
        System.out.println("Trainer: " + getTrainer());
        System.out.println("Duration: " + getDuration()+"weeks");
    }
}
public class Day7q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=2;
        course7 [] c=new course7[n];
        for(int i=0;i<c.length;i++) {
            System.out.println("Enter course name: ");
            String coursename = input.nextLine();
            System.out.println("Enter trainer: ");
            String trainer = input.nextLine();
            System.out.println("Enter duration: ");
            int duration = input.nextInt();
            input.nextLine();
            c[i] = new course7(coursename, trainer, duration);
            c[i].setCoursename(coursename);
            c[i].setTrainer(trainer);
            c[i].setDuration(duration);
            c[i].displayDetails();
        }
        input.close();
    }
}



