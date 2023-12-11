package dec09.bank;

public abstract class BankOfCanada {
    public abstract void withdraw();
    public abstract void deposit();
    public abstract void transfer();
    public abstract void interest();
    public void authority(){
        System.out.println("only Bank can decide........");
    }

}
