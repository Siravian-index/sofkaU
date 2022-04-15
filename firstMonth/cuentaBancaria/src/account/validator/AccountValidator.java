package account.validator;

import account.types.Currency;
import account.types.Debit;
import account.validator.interfaces.IAccountValidator;

public class AccountValidator implements IAccountValidator {

    public void validateDeposit(Currency currency) throws IllegalStateException {
        if ( currency.value() <= 0) {
            throw new IllegalStateException("The value must be greater than 0");
        }
    }

    @Override
    public void validateWithdraw(Debit currency, Currency balance) throws IllegalStateException {
        if (currency.value() > balance.value()) {
            throw new IllegalStateException("The amount of money that you are tying to withdraw is greater than your account's total balance. " + "Current balance: " + balance.value());
        }
    }
}
