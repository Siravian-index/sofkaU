package account;

import account.interfaces.IAccountHistory;

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
//                .stream().map(transaction -> transaction.date.showDate())
                .forEach(System.out::println);
    }

}
