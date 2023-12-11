package dec05;

public class BankAccount {
    String accountHolder;
    double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void displayInfo(){
        System.out.println("Account Holder:"+accountHolder);
        System.out.println("Balance:"+balance);
    }
}
