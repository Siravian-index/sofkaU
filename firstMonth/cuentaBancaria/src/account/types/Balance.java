package account.types;

import account.AccountHistory;
import account.Transaction;
import account.types.interfaces.IBalance;
import account.validator.AccountValidator;

import java.util.List;

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
        decreaseBalance(debit);
        return saveTransaction(debit, this.balance);
    }

    @Override
    public Transaction deposit(Credit credit) {
        increaseBalance(credit);
        return saveTransaction(credit, this.balance);
    }

    @Override
    public List<Transaction> findTransactionsBy(String date) {
        return this.accountHistory.findBy(date);
    }

    @Override
    public List<Transaction> findTransactionsBy(MovementType type) {
        return this.accountHistory.findBy(type);
    }


    private void decreaseBalance(Debit debit) throws IllegalStateException {
        try {
            new AccountValidator().validateWithdraw(debit, this.balance);
            this.balance = this.balance.minusCurrency(debit);
        } catch (IllegalStateException e) {
            throw new RuntimeException(e);
        }
    }

    private void increaseBalance(Credit credit) {
        this.balance = this.balance.plusCurrency(credit);
    }

    private Transaction saveTransaction(Debit debit, Currency balance) {
        return this.accountHistory.save(new Transaction(debit, balance));
    }

    private Transaction saveTransaction(Credit credit, Currency balance) {
        return this.accountHistory.save(new Transaction(credit, balance));
    }

    @Override
    public Double currentBalance() {
        return this.balance.value();
    }

    @Override
    public void balanceHistory() {
        this.accountHistory.printHistory();
    }

    @Override
    public String toString() {
        return "Balance{" + "balance=" + balance + '}';
    }
}
