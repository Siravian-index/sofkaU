package account.interfaces;

import account.Transaction;
import account.types.MovementType;

import java.util.List;

public interface IAccountHistory {

    Transaction save(Transaction transaction);
    List<Transaction> findBy(String date);
    List<Transaction> findBy(MovementType type);

}
