import java.util.*;
class Employee1{
    String name;
    int eid;
    int salary;
    Employee1(String name,int eid,int salary){
        this.name=name;
        this.eid=eid;
        this.salary=salary;
    }
    void disp(){
        System.out.println("Name: "+name);
        System.out.println("EID: "+eid);
        System.out.println("Salary: "+salary);
    }
}
public class Day2q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter employee1 name: ");
        String e1name=sc.nextLine();
        System.out.println("Enter employee1 id: ");
        int e1id=sc.nextInt();
        System.out.println("Enter employee1 salary: ");
        int e1salary=sc.nextInt();
        sc.nextLine();
        Employee1 e1=new Employee1(e1name,e1id,e1salary);
        System.out.println("Enter employee2 name: ");
        String e2name=sc.nextLine();
        System.out.println("Enter employee2 id: ");
        int e2id=sc.nextInt();
        System.out.println("Enter employee2 salary: ");
        int e2salary=sc.nextInt();
        sc.nextLine();
        Employee1 e2=new Employee1(e2name,e2id,e2salary);
        System.out.println("Enter employee3 name: ");
        String e3name=sc.nextLine();
        System.out.println("Enter employee3 id: ");
        int e3id=sc.nextInt();
        System.out.println("Enter employee3 salary: ");
        int e3salary=sc.nextInt();
        sc.nextLine();
        Employee1 e3=new Employee1(e3name,e3id,e3salary);
        System.out.println("Enter employee4 name: ");
        String e4name=sc.nextLine();
        System.out.println("Enter employee4 id: ");
        int e4id=sc.nextInt();
        System.out.println("Enter employee4 salary: ");
        int e4salary=sc.nextInt();
        sc.nextLine();
        Employee1 e4=new Employee1(e4name,e4id,e4salary);
        e1.disp();
        e2.disp();
        e3.disp();
        e4.disp();
    }
}
