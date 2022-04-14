package account.validator;

import account.types.Currency;
import account.validator.interfaces.IAccountValidator;

public class AccountValidator implements IAccountValidator {

    public  void validateValue(Currency currency) throws IllegalStateException {
        if ( currency.value() <= 0) {
            throw new IllegalStateException("The value must be greater than 0");
        }
    }
}
