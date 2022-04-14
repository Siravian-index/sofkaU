package account.types;

import account.types.interfaces.IValue;
import account.validator.AccountValidator;

public class Balance implements IValue<Currency> {
    private final Currency balance;
    public Balance(Currency balance) {
//        throws if balance is <= 0
        AccountValidator validator = new AccountValidator();
        validator.validateValue(balance);
        this.balance = balance;
    }

    @Override
    public Currency value() {
        return this.balance;
    }
}
