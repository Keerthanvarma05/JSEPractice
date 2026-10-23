import java.util.Scanner;
abstract class DigitalWallet13 {
    private String walletHolder;
    private int walletBalance;
    public DigitalWallet13(String walletHolder, int walletBalance) {
        this.walletHolder = walletHolder;
        this.walletBalance = walletBalance;
    }
    public void setWalletBalance(int walletBalance) {
        this.walletBalance = walletBalance;
    }

    public String getWalletHolder() {
        return walletHolder;
    }
    public int getWalletBalance() {
        return walletBalance;
    }
    abstract void deposit(double amount);
    abstract void withdraw(double amount);
}
class PaytmWallet13 extends DigitalWallet13 {
    public PaytmWallet13(String walletHolder, int walletBalance) {
        super(walletHolder, walletBalance);
    }
    @Override
    void deposit(double amount) {
        setWalletBalance((int)(getWalletBalance() + amount));
    }
    @Override
    void withdraw(double amount) {
        if(getWalletBalance()>=amount){
            setWalletBalance((int)(getWalletBalance() - amount));
        }else{
            System.out.println("Insufficient Balance");
        }
    }
}
class PhonePeWallet13 extends DigitalWallet13 {
    public PhonePeWallet13(String walletHolder, int walletBalance) {
        super(walletHolder, walletBalance);
    }

    @Override
    void deposit(double amount) {
        setWalletBalance((int)(getWalletBalance() + amount));
    }
    @Override
    void withdraw(double amount) {
        if(amount>5000){
            System.out.println("Daily Withdrawal Limit Exceeded");
        } else if(getWalletBalance()>=amount){
            setWalletBalance((int)(getWalletBalance() - amount));
        }else {
            System.out.println("Insufficient Balance");
        }
    }
}
public class Day13q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Wallet Holder: ");
        String walletHolder1 = sc.nextLine();
        System.out.println("Enter Wallet Balance: ");
        int walletBalance1 = sc.nextInt();
        DigitalWallet13 w1=new PaytmWallet13(walletHolder1, walletBalance1);
        System.out.println("Enter Deposit amount: ");
        w1.deposit(sc.nextDouble());
        System.out.println("Enter Withdrawal amount: ");
        w1.withdraw(sc.nextDouble());
        sc.nextLine();
        System.out.println("Final Balance: "+ w1.getWalletBalance());

        System.out.println("Enter Wallet Holder: ");
        String walletHolder2 = sc.nextLine();
        System.out.println("Enter Wallet Balance: ");
        int walletBalance2 = sc.nextInt();
        DigitalWallet13 w2=new PhonePeWallet13(walletHolder2, walletBalance2);
        System.out.println("Enter Deposit amount: ");
        w2.deposit(sc.nextDouble());
        System.out.println("Enter Withdrawal amount: ");
        w2.withdraw(sc.nextDouble());
        sc.nextLine();
        System.out.println("Final Balance: "+w2.getWalletBalance());
        sc.close();
    }
}