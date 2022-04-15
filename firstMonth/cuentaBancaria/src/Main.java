import account.types.Balance;
import account.types.Credit;
import account.types.Currency;
import account.types.Debit;

public class Main {
    public static void main(String[] args) {
        Balance balance = new Balance(new Currency(100.0));
        System.out.println(balance.deposit(new Credit(new Currency(500.0))));
        System.out.println(balance.currentBalance());
        System.out.println(balance.withDraw(new Debit(new Currency(100.0))));
        System.out.println(balance.currentBalance());

    }
}