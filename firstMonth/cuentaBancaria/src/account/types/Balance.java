package account.types;

import account.Transaction;
import account.types.interfaces.IBalance;
import account.validator.AccountValidator;

final public class Balance implements IBalance {
    private Currency balance;

    public Balance(Currency currency) {
        new AccountValidator().validateDeposit(currency);
        this.balance = currency;
    }

    @Override
    public Transaction withDraw(Currency amount) {
    }

    @Override
    public Transaction deposit(Credit amount) {
        this.balance = new Currency(currentBalance() + amount.value());
        Transaction transaction = new Transaction(amount, this.balance);
        return transaction;
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
