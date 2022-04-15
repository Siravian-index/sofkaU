package account;

import account.interfaces.IAccount;
import account.types.*;

import java.util.ArrayList;

public class Account implements IAccount {
    private final AccountDetails accountDetails;

    public Account(AccountDetails accountDetails) {
        this.accountDetails = accountDetails;
    }

    @Override
    public void deposit(Double amount) {
        Credit depositAmount = new Credit(new Currency(amount));
        this.accountDetails.accountBalance.deposit(depositAmount);
    }

    @Override
    public void withdraw(Double amount) {
        Debit withDrawAmount = new Debit(new Currency(amount));
        this.accountDetails.accountBalance.withDraw(withDrawAmount);
    }

    @Override
    public void transfer(Id accountId, Double amount) {

    }

    @Override
    public void printStatements() {
        this.accountDetails.accountBalance.balanceHistory();
    }

    @Override
    public ArrayList<Transaction> findTransactionsBy(MovementType type) {
        return null;
    }

    @Override
    public ArrayList<Transaction> findTransactionsBy(String date) {
        return null;
    }

    @Override
    public String checkOwner() {
        return this.accountDetails.accountOwner.getOwner();
    }

    @Override
    public Double checkBalance() {
        return this.accountDetails.accountBalance.currentBalance();
    }
}
