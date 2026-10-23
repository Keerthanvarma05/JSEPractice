import java.util.Scanner;
class Employee{
        String name;
        int eid;
        int sal;
    void disp(){
        System.out.println("Name: "+name);
        System.out.println("EID: "+eid);
        System.out.println("Salary: "+sal);
    }
}
public class Day1q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();
        Employee e4 = new Employee();
        Employee e5 = new Employee();
        System.out.println("Enter the name of the employee1 :");
        e1.name = sc.nextLine();
        System.out.println("Enter the ID of the employee1 :");
        e1.eid = sc.nextInt();
        System.out.println("Enter the salary of the employee1 :");
        e1.sal = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the name of the employee2 :");
        e2.name = sc.nextLine();
        System.out.println("Enter the ID of the employee2 :");
        e2.eid = sc.nextInt();
        System.out.println("Enter the salary of the employee2 :");
        e2.sal = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the name of the employee3 :");
        e3.name = sc.nextLine();
        System.out.println("Enter the ID of the employee3 :");
        e3.eid = sc.nextInt();
        System.out.println("Enter the salary of the employee3 :");
        e3.sal = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the name of the employee4 :");
        e4.name = sc.nextLine();
        System.out.println("Enter the ID of the employee4 :");
        e4.eid = sc.nextInt();
        System.out.println("Enter the salary of the employee4 :");
        e4.sal = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the name of the employee5 :");
        e5.name = sc.nextLine();
        System.out.println("Enter the ID of the employee5 :");
        e5.eid = sc.nextInt();
        System.out.println("Enter the salary of the employee5 :");
        e5.sal = sc.nextInt();
        sc.nextLine();
        Employee highest=e1;
        if(e2.sal>highest.sal){
            highest=e2;
        }
        else if(e3.sal>highest.sal){
            highest=e3;
        }
        else if(e4.sal>highest.sal){
            highest=e4;
        }
        else if(e5.sal>highest.sal){
            highest=e5;
        }
        highest.disp();
        int avg_sal=(e1.sal+e2.sal+e3.sal+e4.sal+e5.sal)/5;
        System.out.println("Average salary: "+avg_sal);
        int cnt=0;
        if(e1.sal>50000){
            cnt++;
        }
        if(e2.sal>50000){
            cnt++;
        }
        if(e3.sal>50000){
            cnt++;
        }
        if(e4.sal>50000){
            cnt++;
        }
        if(e5.sal>50000){
            cnt++;
        }
        System.out.println("No.of employees with more than 50000 sal: "+cnt);
        sc.close();
    }
}
