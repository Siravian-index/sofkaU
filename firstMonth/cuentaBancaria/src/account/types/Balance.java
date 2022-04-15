package account.types;

import account.Transaction;
import account.types.interfaces.IBalance;
import account.validator.AccountValidator;

final public class Balance implements IBalance {
    private final Currency balance;

    public Balance(Currency currency) {
        new AccountValidator().validateDeposit(currency);
        this.balance = currency;
    }

    public Balance() {
        this.balance = new Currency(0.0);
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
