package account.validator.interfaces;

import account.types.Currency;

public interface IAccountValidator {

    void validateValue(Currency currency) throws IllegalStateException;
    void validateWithdraw(Currency currency) throws  IllegalStateException;
//    validate name
//    validate id?


}
