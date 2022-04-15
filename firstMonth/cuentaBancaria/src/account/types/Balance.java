package account.types;

import account.AccountHistory;
import account.Transaction;
import account.types.interfaces.IBalance;
import account.validator.AccountValidator;

final public class Balance implements IBalance {
    private Currency balance;
    private final AccountHistory accountHistory;

    public Balance(Currency currency) {
        new AccountValidator().validateDeposit(currency);
        this.balance = currency;
        this.accountHistory = new AccountHistory();
    }

    @Override
    public Transaction withDraw(Debit debit) {
        try {
            new AccountValidator().validateWithdraw(debit, this.balance);
            this.balance = this.balance.minusCurrency(debit);
            Transaction transaction = new Transaction(debit, this.balance);
            saveTransaction(transaction);
            return transaction;

        } catch (IllegalStateException e) {
            throw new RuntimeException(e);
        }

    }


    @Override
    public Transaction deposit(Credit credit) {
        this.balance = this.balance.plusCurrency(credit);
        Transaction transaction = new Transaction(credit, this.balance);
        saveTransaction(transaction);
        return transaction;
    }


    @Override
    public void saveTransaction(Transaction transaction) {
        this.accountHistory.push(transaction);
    }

    private void decreseBalance(Debit debit) {

    }

    private void increaseBalance(Credit credit) {

    }

    @Override
    public Double currentBalance() {
        return this.balance.value();
    }

    @Override
    public String toString() {
        return "Balance{" + "balance=" + balance + '}';
    }
}
