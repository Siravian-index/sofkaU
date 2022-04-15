package account.interfaces;

import account.Transaction;

public interface IAccountHistory {

    Transaction save(Transaction transaction);
}
