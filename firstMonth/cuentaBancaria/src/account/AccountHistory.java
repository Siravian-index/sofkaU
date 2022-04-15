package account;

import account.interfaces.IAccountHistory;
import account.types.MovementType;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AccountHistory implements IAccountHistory {
    private final ArrayList<Transaction> transactionHistory;

    public AccountHistory() {
        this.transactionHistory = new ArrayList<>();
    }

    public Transaction save(Transaction transaction) {
        this.transactionHistory.add(transaction);
        return transaction;
    }

    @Override
    public List<Transaction> findBy(String date) {
        return this.transactionHistory
                .stream()
                .filter(transaction -> transaction.getDate().showDate().equals(date))
                .collect(Collectors.toList());
    }

    @Override
    public List<Transaction> findBy(MovementType type) {
        return this.transactionHistory
                .stream()
                .filter(transaction -> transaction.getType().equals(type))
                .collect(Collectors.toList());
    }

    public void printHistory() {
        this.transactionHistory
                .forEach(System.out::println);
    }

}
