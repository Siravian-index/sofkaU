package account.types;

import account.types.interfaces.IBalance;
import account.validator.AccountValidator;

public class Balance implements IBalance {
    private final Currency balance;

    public Balance(Currency currency) {
        new AccountValidator().validateDeposit(currency);
        this.balance = currency;
    }

    public Balance() {
        this.balance = new Currency(0.0);
    }

    @Override
    public Currency value() {
        return this.balance;
    }


    @Override
    public void withDraw(Currency amount) {

    }

    @Override
    public void deposit(Currency amount) {

    }

    @Override
    public void saveTransaction() {

    }

    @Override
    public void transfer(Currency amount) {

    }

    @Override
    public Currency seeBalance() {
        return this.balance;
    }

    @Override
    public String toString() {
        return "Balance{" + "balance=" + balance + '}';
    }
}
