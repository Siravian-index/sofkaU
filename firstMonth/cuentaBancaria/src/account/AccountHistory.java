package account;

import java.util.ArrayList;

public class AccountHistory {
    private final ArrayList<Transaction> transactionHistory;

    public AccountHistory() {
        this.transactionHistory = new ArrayList<>();
    }

    public void push(Transaction transaction) {
        this.transactionHistory.add(transaction);
    }

    public void printHistory() {
        this.transactionHistory
                .forEach(System.out::println);
    }

}
