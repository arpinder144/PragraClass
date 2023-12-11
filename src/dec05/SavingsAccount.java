package dec05;

public class SavingsAccount extends BankAccount{
    double interest;

    public SavingsAccount(String accountHolder, double balance, double interest) {
        super(accountHolder, balance);
        this.interest = interest;
    }
    public void showSavings(){
        System.out.println("Interest:"+interest);
    }
}
