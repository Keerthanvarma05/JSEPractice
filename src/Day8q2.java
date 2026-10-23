import java.util.Scanner;
class Account{
    String accountHolder;
    int accountNumber;
    void displayAccountInfo(){
        System.out.println("Account Holder: "+accountHolder);
        System.out.println("Account Number: "+accountNumber);
    }
}
class SavingsAccount extends Account{

    float interestRate;
    int balance;
    void displaySavingsInfo(){
        System.out.println("interest rate: "+interestRate+" %");
        System.out.println("balance: "+balance);
    }
}
public class Day8q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=2;
        SavingsAccount[] s=new SavingsAccount[n];
        for(int i=0;i<s.length;i++){
            s[i]=new SavingsAccount();
            System.out.println("Enter Account Holder name: ");
            s[i].accountHolder=sc.nextLine();
            System.out.println("Enter Account Number: ");
            s[i].accountNumber=sc.nextInt();
            System.out.println("Enter Interest Rate: ");
            s[i].interestRate=sc.nextFloat();
            System.out.println("Enter Account Balance: ");
            s[i].balance=sc.nextInt();
            sc.nextLine();
            s[i].displayAccountInfo();
            s[i].displaySavingsInfo();
        }
        sc.close();
    }
}
