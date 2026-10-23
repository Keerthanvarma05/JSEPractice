import java.util.Scanner;
class Employee4{
    String name;
    int Employee_ID;
    String Department;
    int Salary;
    public Employee4(String name, int Employee_ID, String Department, int Salary){
        this.name = name;
        this.Employee_ID = Employee_ID;
        this.Department = Department;
        this.Salary = Salary;
    }
    void display(){
        System.out.println("Employee Name: " + this.name);
        System.out.println("Employee ID: " + this.Employee_ID);
        System.out.println("Department Name: " + this.Department);
        System.out.println("Salary: " + this.Salary);
    }
}
public class Day4q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        int id;
        String department;
        int salary;
        Employee4[] emp=new Employee4[3];
            for (int i = 0; i < 3; i++) {
                System.out.println("Enter Employee name: ");
                name = input.nextLine();
                System.out.println("Enter Employee Id: ");
                id = input.nextInt();
                input.nextLine();
                System.out.println("Enter Employee Department: ");
                department = input.nextLine();
                System.out.println("Enter Employee Salary: ");
                salary = input.nextInt();
                input.nextLine();
                emp[i] = new Employee4(name, id, department, salary);
            }
        for (int i = 0; i < 3; i++) {
            emp[i].display();
        }
    }
}
