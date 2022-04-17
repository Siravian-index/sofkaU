import account.Account;
import account.AccountDetails;
import account.types.Balance;
import account.types.Currency;
import account.types.Id;
import account.types.Owner;

public class Main {
    public static void main(String[] args) {
        Account myAccount = new Account(new AccountDetails(new Id(), new Owner("david"), new Balance(new Currency(0.0))));
        Account luisAccount = new Account(new AccountDetails(new Id(), new Owner("Luis"), new Balance(new Currency(0.0))));
        myAccount.deposit(1000.0);
        myAccount.deposit(2000.0);
        myAccount.withdraw(500.0);
        myAccount.transfer(luisAccount, 500.0);
        myAccount.printStatements();
        System.out.println("luis' account");
        luisAccount.printStatements();
    }
}