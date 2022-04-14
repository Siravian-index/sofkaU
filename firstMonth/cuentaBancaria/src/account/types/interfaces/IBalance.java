package account.types.interfaces;

import account.types.Currency;

public interface IBalance {
    void withDraw(Currency amount);

    void deposit(Currency amount);

    void saveTransaction();

    Currency seeBalance();

    void transfer(Currency amount);
}
