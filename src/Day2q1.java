import java.util.*;
class Student1{
    String name;
    int rno;
    String branch;
    Student1(String name,int rno,String branch){
        this.name=name;
        this.rno=rno;
        this.branch=branch;
    }
    void disp(){
        System.out.println("Name: "+name);
        System.out.println("Rno: "+rno);
        System.out.println("Branch: "+branch);
    }
}
public class Day2q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Student1 Name: ");
        String n=sc.nextLine();
        System.out.println("Enter Student1 Rno: ");
        int rno=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Student1 Branch: ");
        String branch=sc.nextLine();
        Student1 s1=new Student1(n,rno,branch);
        System.out.println("Enter Student2 Name: ");
        String n1=sc.nextLine();
        System.out.println("Enter Student2 Rno: ");
        int r1=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Student2 Branch: ");
        String b1=sc.nextLine();
        Student1 s2=new Student1(n1,r1,b1);
        s1.disp();
        s2.disp();
    }
}
