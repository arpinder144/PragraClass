package dec09.bank;

public class BmoBank extends BankOfCanada {
    @Override
    public void withdraw() {
        System.out.println("withdraw limit $1000 per day");

    }

    @Override
    public void deposit() {
        System.out.println("deposit money.....");

    }

    @Override
    public void transfer() {
        System.out.println("Transfer limit $1000.....");

    }

    @Override
    public void interest() {
        System.out.println("Rate of interest prime 5% +2.99%");

    }
}
