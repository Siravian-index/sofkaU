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
                .forEach(this::formatPrintHistory);
    }

    private void formatPrintHistory(Transaction transaction) {
        String date = transaction.getDate().showDate();
        Double creditValue = transaction.getCredit().value();
        String credit = creditValue > 0 ? " Credit " + creditValue : "";
        Double debitValue = transaction.getDebit().value();
        String debit = debitValue > 0 ? " Debit " + debitValue : "";
        Double balance = transaction.getBalance().value();
        String type = transaction.getType().toString();
        String content = "Date: " + date +
                " Type: " + type +
                credit +
                debit +
                " Balance: " + balance;
        System.out.println(content);
    }

}
