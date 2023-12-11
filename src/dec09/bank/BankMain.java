package dec09.bank;

public class BankMain {
    public static void main(String[] args) {
        BankOfCanada bankOfCanada=new ScotiaBank();
        bankOfCanada.withdraw();
        bankOfCanada.deposit();
        bankOfCanada.transfer();
        bankOfCanada.interest();
        bankOfCanada.authority();
        ScotiaBank scotiaBank=new ScotiaBank();
        scotiaBank.ScenePoints();
    }
}
