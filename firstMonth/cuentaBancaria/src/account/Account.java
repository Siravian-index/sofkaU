package account;

import account.types.Credit;
import account.types.Currency;
import account.types.Debit;

public class Account {
    private final AccountDetails accountDetails;

    public Account(AccountDetails accountDetails) {
        this.accountDetails = accountDetails;
    }


    public void deposit(Double amount) {
        Credit depositAmount = new Credit(new Currency(amount));
        this.accountDetails.accountBalance.deposit(depositAmount);
    }

    public void withdraw(Double amount) {
        Debit withDrawAmount = new Debit(new Currency(amount));
        this.accountDetails.accountBalance.withDraw(withDrawAmount);
    }

    public void printStatements() {

    }
}
