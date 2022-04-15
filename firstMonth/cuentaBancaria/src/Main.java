import account.Account;
import account.AccountDetails;
import account.types.*;

public class Main {
    public static void main(String[] args) {
        AccountDetails accountDetails = new AccountDetails(new Id(), new Owner("David"), new Balance(new Currency(300.00)));
        Account myAccount = new Account(accountDetails);
        myAccount.deposit(500.0);
        myAccount.withdraw(200.0);


    }
}