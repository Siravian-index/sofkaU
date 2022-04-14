package account.validator.interfaces;

import account.types.Balance;
import account.types.Currency;

public interface IAccountValidator {

    void validateDeposit(Currency currency) throws IllegalStateException;
    void validateWithdraw(Currency currency, Balance balance) throws  IllegalStateException;
//    validate name
//    validate id?


}
