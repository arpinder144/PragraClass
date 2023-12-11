package dec05;

public class CheckingAccount extends BankAccount{
    double overdraftLimit;

    public CheckingAccount(String accountHolder, double balance, double overdraftLimit) {
        super(accountHolder, balance);
        this.overdraftLimit = overdraftLimit;
    }
    public void showChecking(){
        System.out.println("overdraftLimit:"+overdraftLimit);
    }
}
