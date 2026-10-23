import java.util.Scanner;
class Employee12 {
    String employeeName;
    int basicSalary;
    void calculateBonus() {
        System.out.println("No Bonus");
    }
}
class Developer12 extends Employee12 {
    @Override
    void calculateBonus() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Salary: ₹" + basicSalary);
        System.out.println("Bonus: ₹" + (basicSalary * 15 / 100));
    }
}
class Tester12 extends Employee12 {
    @Override
    void calculateBonus() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Salary: ₹" + basicSalary);
        System.out.println("Bonus: ₹" + (basicSalary * 10 / 100));
    }
}
class Manager12 extends Employee12 {
    @Override
    void calculateBonus() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Salary: ₹" + basicSalary);
        System.out.println("Bonus: ₹" + (basicSalary * 20 / 100));
    }
}

public class Day12q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Employee12 emp;

        // Developer
        emp = new Developer12();
        System.out.println("Enter Developer Name:");
        emp.employeeName = input.nextLine();
        System.out.println("Enter Developer Salary:");
        emp.basicSalary = input.nextInt();
        input.nextLine();
        emp.calculateBonus();

        System.out.println();


        // Tester
        emp = new Tester12();
        System.out.println("Enter Tester Name:");
        emp.employeeName = input.nextLine();
        System.out.println("Enter Tester Salary:");
        emp.basicSalary = input.nextInt();
        emp.calculateBonus();

        // Manager
        emp = new Manager12();
        System.out.println("Enter Manager Name:");
        emp.employeeName = input.nextLine();
        System.out.println("Enter Manager Salary:");
        emp.basicSalary = input.nextInt();
        input.nextLine();
        emp.calculateBonus();

        System.out.println();
        input.close();
    }
}