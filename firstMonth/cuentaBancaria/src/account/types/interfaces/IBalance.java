package account.types.interfaces;

import account.Transaction;
import account.types.Currency;
import account.types.Id;

public interface IBalance {
    Transaction withDraw(Currency amount);

    Transaction deposit(Currency amount);

//    Transaction saveTransaction();

    Double currentBalance();

//    Transaction transfer(Id accountId, Currency amount);
}
