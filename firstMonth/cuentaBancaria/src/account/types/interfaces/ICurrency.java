package account.types.interfaces;

import account.types.Credit;
import account.types.Currency;
import account.types.Debit;

public interface ICurrency {

    Currency plusCurrency(Currency currency);

    Currency plusCurrency(Credit credit);

    Currency minusCurrency(Currency currency);

    Currency minusCurrency(Debit debit);

}
