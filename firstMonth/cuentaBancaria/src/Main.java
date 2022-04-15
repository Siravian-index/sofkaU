import account.Account;
import account.AccountDetails;
import account.Transaction;
import account.types.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        AccountDetails accountDetails = new AccountDetails(new Id(), new Owner("David"), new Balance(new Currency(300.00)));
        Account myAccount = new Account(accountDetails);
        myAccount.deposit(500.0);
        myAccount.withdraw(200.0);

        myAccount.checkStatus();
        myAccount.deposit(1000.0);
        myAccount.checkStatus();
        List<Transaction> list = myAccount.findTransactionsBy(MovementType.DEPOSIT);
        System.out.println(list.size());


    }
}