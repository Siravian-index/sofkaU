package account.validator;

import account.types.Balance;
import account.types.Currency;
import account.validator.interfaces.IAccountValidator;

public class AccountValidator implements IAccountValidator {

    public  void validateDeposit(Currency currency) throws IllegalStateException {
        if ( currency.value() <= 0) {
            throw new IllegalStateException("The value must be greater than 0");
        }
    }

    @Override
    public void validateWithdraw(Currency currency, Balance balance) throws IllegalStateException {
        if (currency.value() > balance.currentBalance()) {
            throw new IllegalStateException("The amount of money that you want to withdraw is greater than the total of your account");
        }
    }
}
