package account;

import account.interfaces.IAccount;
import account.types.*;

import java.util.List;

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
        this.accountDetails.accountBalance.withDraw(new Debit(new Currency(amount)));
    }

    @Override
    public void transfer(Account account, Double amount) {
        this.accountDetails.accountBalance.withDraw(new Debit(new Currency(amount)));
        account.deposit(amount);
    }

    @Override
    public void printStatements() {
        this.accountDetails.accountBalance.balanceHistory();
    }

    @Override
    public void checkStatus() {
        System.out.println(this.accountDetails.accountStatus());
    }

    @Override
    public List<Transaction> findTransactionsBy(MovementType type) {
        return this.accountDetails.accountBalance.findTransactionsBy(type);
    }

    @Override
    public List<Transaction> findTransactionsBy(String date) {
        return this.accountDetails.accountBalance.findTransactionsBy(date);
    }

    @Override
    public String checkOwner() {
        return this.accountDetails.accountOwner.getOwner();
    }

    public String checkId() {
        return this.accountDetails.accountId.getId();
    }

    @Override
    public Double checkBalance() {
        return this.accountDetails.accountBalance.currentBalance();
    }
}
