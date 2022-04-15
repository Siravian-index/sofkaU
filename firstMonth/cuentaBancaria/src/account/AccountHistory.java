package account;

import account.interfaces.IAccountHistory;
import account.validator.interfaces.IAccountValidator;

import java.util.ArrayList;

public class AccountHistory implements IAccountHistory {
    private final ArrayList<Transaction> transactionHistory;

    public AccountHistory() {
        this.transactionHistory = new ArrayList<>();
    }

    public Transaction save(Transaction transaction) {
        this.transactionHistory.add(transaction);
        return transaction;
    }

    public void printHistory() {
        this.transactionHistory
                .forEach(System.out::println);
    }

}
