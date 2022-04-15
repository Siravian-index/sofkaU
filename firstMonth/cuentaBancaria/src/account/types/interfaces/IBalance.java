package account.types.interfaces;

import account.Transaction;
import account.types.Credit;
import account.types.Debit;

public interface IBalance {
    Transaction withDraw(Debit amount);


//    void saveTransaction();

    Transaction deposit(Credit amount);

    Double currentBalance();

//    Transaction transfer(Id accountId, Currency amount);
}
