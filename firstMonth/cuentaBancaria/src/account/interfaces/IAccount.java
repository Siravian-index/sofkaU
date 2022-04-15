package account.interfaces;

import account.Transaction;
import account.types.Id;
import account.types.MovementType;

import java.util.ArrayList;

public interface IAccount {
    void deposit(Double amount);

    void withdraw(Double amount);

    void transfer(Id accountId, Double amount);

    void printStatements();

    void checkStatus();

    ArrayList<Transaction> findTransactionsBy(MovementType type);

    ArrayList<Transaction> findTransactionsBy(String date);

    String checkOwner();

    Double checkBalance();

}
