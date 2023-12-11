package dec05;

public class BankMain {
    public static void main(String[] args) {
        SavingsAccount savingsAccount=new SavingsAccount("Arpinder",20000.00,2.99);
        savingsAccount.displayInfo();
        savingsAccount.showSavings();
        CheckingAccount checkingAccount=new CheckingAccount("Surinder",20000.00,1000.00);
        checkingAccount.displayInfo();
        checkingAccount.showChecking();
    }
}
