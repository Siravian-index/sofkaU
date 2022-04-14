package account.types.interfaces;

import account.types.Currency;

public interface IBalance {
    void withDraw(Currency amount);

    void deposit(Currency amount);

    void saveTransactionvoid();

    void transfer(Currency amount);
}
