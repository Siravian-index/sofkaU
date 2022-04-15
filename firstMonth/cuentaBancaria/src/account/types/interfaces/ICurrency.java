package account.types.interfaces;

import account.types.Currency;

public interface ICurrency {

    Currency plusCurrency(Currency currency);

    Currency minusCurrency(Currency currency);

}
