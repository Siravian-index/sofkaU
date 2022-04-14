package account.types;

import account.validator.AccountValidator;

public class Balance {
    Double balance;
    public Balance(Double balance) {
//        throws if balance is <= 0
        AccountValidator.validateValue(balance);
        this.balance = balance;
    }
}
