import account.Account;
import account.AccountDetails;
import account.AccountManager;
import account.Transaction;
import account.types.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        AccountDetails accountDetails = new AccountDetails(new Id(), new Owner("David"), new Balance(new Currency(300.00)));
        AccountDetails accountDetails2 = new AccountDetails(new Id(), new Owner("Juan"), new Balance(new Currency(500.00)));
        AccountDetails accountDetails3 = new AccountDetails(new Id(), new Owner("Maria"), new Balance(new Currency(900.00)));
        Account myAccount = new Account(accountDetails);
        Account myAccount2 = new Account(accountDetails2);
        Account myAccount3 = new Account(accountDetails3);

        AccountManager accountManager = new AccountManager(myAccount, myAccount2, myAccount3);
        System.out.println(accountManager.showAccountsId());


    }
}