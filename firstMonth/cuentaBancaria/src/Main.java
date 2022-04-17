import account.Account;
import account.AccountDetails;
import account.types.Balance;
import account.types.Currency;
import account.types.Id;
import account.types.Owner;

public class Main {
    public static void main(String[] args) {
        AccountDetails daniel = new AccountDetails(new Id(), new Owner("Daniel"), new Balance(new Currency(200.0)));
        AccountDetails david = new AccountDetails(new Id(), new Owner("david"), new Balance(new Currency(100.0)));
        Account danielAccount = new Account(daniel);
        Account davidAccount = new Account(david);
        danielAccount.deposit(300.0);
        danielAccount.transfer(davidAccount, 100.0);

        davidAccount.transfer(danielAccount,200.0);

        danielAccount.printStatements();
        System.out.println("david account:");
        davidAccount.printStatements();

    }
}