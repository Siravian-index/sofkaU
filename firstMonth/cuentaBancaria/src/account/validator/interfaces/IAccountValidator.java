package account.validator.interfaces;

import account.types.Currency;
import account.types.Debit;

public interface IAccountValidator {

    void validateDeposit(Currency currency) throws IllegalStateException;
    void validateWithdraw(Debit currency, Currency balance) throws  IllegalStateException;
//    validate name
//    validate id?


}
