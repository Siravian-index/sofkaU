package account;

import account.types.*;

public class Transaction {
//    This class will be instantiated each time we make a new Transaction
    private final FormattedDate date;
    private final Credit credit;
    private final Debit debit;
    private final Currency balance;
    private final MovementType type;

    private final Id transactionId;

//    take balance as currency
    public Transaction(Credit credit, Debit debit, Currency balance) {
        this.date = new FormattedDate();
        this.credit = credit;
        this.debit = debit;
        this.balance = balance;
        this.type = MovementType.MIXED;
        this.transactionId = new Id();
    }

    public Transaction( Debit debit, Currency balance) {
        this.credit = new Credit(new Currency(0.0));
        this.date = new FormattedDate();
        this.debit = debit;
        this.balance = balance;
        this.type = MovementType.WITHDRAW;
        this.transactionId = new Id();

    }

    public Transaction(Credit credit, Currency balance) {
        this.date = new FormattedDate();
        this.debit = new Debit(new Currency(0.0));
        this.credit = credit;
        this.balance = balance;
        this.type = MovementType.DEPOSIT;
        this.transactionId = new Id();

    }

    @Override
    public String toString() {
        return "Transaction{" +
                "date='" + date + '\'' +
                ", credit=" + credit +
                ", debit=" + debit +
                ", balance=" + balance +
                ", type=" + type +
                ", transactionId=" + transactionId +
                '}';
    }
}
