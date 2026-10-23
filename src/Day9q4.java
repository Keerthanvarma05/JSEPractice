import java.util.Scanner;
class Animal9 {
    String animalName;
    String habitat;
    void displayAnimalInfo(){
        System.out.println("Inside Parent class: ");
        System.out.println("Name: " + animalName);
        System.out.println("Habitat: " + habitat);
    }
}
class Bird extends Animal9 {
    float wingSpan;
    String canFly;
    void displayBirdInfo(){
        System.out.println("Inside Child1 class: ");
        System.out.println("Wing span: " + wingSpan);
        System.out.println("canFly: " + canFly);
    }
}
class Eagle extends Bird{
    int huntingSpeed;
    int visionRange;
    void displayEagleInfo(){
        System.out.println("Inside Child2 class: ");
        System.out.println("Hunting Speed: " + huntingSpeed);
        System.out.println("Vision Range: " + visionRange);
    }
    void canHunt(double preyDistance){
        if(preyDistance <= visionRange) {
            System.out.println("Target Detected");
        }else {
            System.out.println("Target Out of Range");
        }
    }
}
public class Day9q4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Eagle e=new Eagle();
        System.out.println("Enter name of animal: ");
        e.animalName=sc.nextLine();
        System.out.println("Enter habitat: ");
        e.habitat=sc.nextLine();
        System.out.println("Enter wing span: ");
        e.wingSpan=sc.nextFloat();
        sc.nextLine();
        System.out.println("Enter can fly: ");
        e.canFly=sc.nextLine();
        System.out.println("Enter vision range: ");
        e.visionRange=sc.nextInt();
        System.out.println("Enter hunting Speed: ");
        e.huntingSpeed=sc.nextInt();
        e.displayAnimalInfo();
        e.displayBirdInfo();
        e.displayEagleInfo();
        System.out.println("Enter prey distance: ");
        int PrayDistance=sc.nextInt();
        e.canHunt(PrayDistance);
        sc.close();
    }
}
