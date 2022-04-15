package account.types.interfaces;

import account.Transaction;
import account.types.Credit;
import account.types.Debit;
import account.types.MovementType;

import java.util.List;

public interface IBalance {
    Transaction withDraw(Debit amount);

    Transaction deposit(Credit amount);

    List<Transaction> findTransactionsBy(String date);
    List<Transaction> findTransactionsBy(MovementType type);

//    Transaction transfer(Id accountId, Currency amount);

    Double currentBalance();

    void balanceHistory();

}
