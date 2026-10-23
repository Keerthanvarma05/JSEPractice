import java.util.Scanner;
class BankAccount4 {
    String Acc_Name;
    int Account_Number;
    int Balance;
    BankAccount4(String Acc_Name, int Account_Number, int Balance) {
        this.Acc_Name = Acc_Name;
        this.Account_Number = Account_Number;
        this.Balance = Balance;
    }
    void deposit(int Amount) {
        this.Balance += Amount;
    }
    void withdraw(int Amount) {
        if (this.Balance >= Amount) {
            this.Balance -= Amount;
        }else{
            System.out.println("Insufficient Balance");
        }
    }
    void displayBalance(){
        System.out.println(this.Balance);
    }
}
public class Day4q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Account Name: ");
        String Acc_Name= input.nextLine();
        System.out.println("Enter Account Number: ");
        int Account_Number= input.nextInt();
        System.out.println("Enter Balance: ");
        int Balance= input.nextInt();
        BankAccount4 bank = new BankAccount4(Acc_Name,Account_Number,Balance);
        System.out.println("Enter amount to deposit: ");
        bank.deposit(input.nextInt());
        System.out.println("Enter amount to withdraw: ");
        bank.withdraw(input.nextInt());
        bank.displayBalance();
        input.close();
    }
}
