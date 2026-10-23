import java.util.Scanner;
class BankAccount{
    String accountholdername;
    int accountnumber;
    double balance;
    BankAccount(String accountholdername, int accountnumber, int balance){
        this.accountholdername = accountholdername;
        this.accountnumber = accountnumber;
        this.balance = balance;
    }
    void deposit(double amount){
        balance=amount+balance;
    }
    void withdraw(double amount) {
        if(amount<=balance){
            balance-=amount;
        }
        else{
            System.out.println("Insufficient balance");
        }
    }
    double displayBalance(){
        return balance;
    }
}
public class Day3q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter account holder name: ");
        String accountholdername = input.nextLine();
        System.out.println("Enter account number: ");
        int accountnumber = input.nextInt();
        System.out.println("Enter balance: ");
        int balance = input.nextInt();
        BankAccount b=new BankAccount(accountholdername,accountnumber,balance);
        System.out.println("Enter deposit amount: ");
        double amt1 = input.nextDouble();
        b.deposit(amt1);
        System.out.println("Enter withdraw amount: ");
        double amt2 = input.nextDouble();
        b.withdraw(amt2);
        System.out.println("Balance after transactions: "+b.displayBalance());
    }
}
