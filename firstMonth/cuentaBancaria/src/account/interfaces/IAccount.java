package account.interfaces;

import account.Account;
import account.Transaction;
import account.types.MovementType;

import java.util.List;

public interface IAccount {
    void deposit(Double amount);

    void withdraw(Double amount);

    void transfer(Account account, Double amount);

    void printStatements();

    void checkStatus();

    List<Transaction> findTransactionsBy(MovementType type);

    List<Transaction> findTransactionsBy(String date);

    String checkOwner();

    Double checkBalance();

}
