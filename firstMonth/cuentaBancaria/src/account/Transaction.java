package account;

import account.types.*;

public class Transaction {
//    This class will be instantiated each time we make a new Transaction
    private final FormattedDate date;
    private final Credit credit;
    private final Debit debit;
    private final Currency balance;
    private final MovementType type;

//    take balance as currency
    public Transaction(Credit credit, Debit debit, Balance balance) {
        this.date = new FormattedDate();
        this.credit = credit;
        this.debit = debit;
        this.balance = balance;
        this.type = MovementType.MIXED;
    }

    public Transaction( Debit debit, Balance balance) {
        this.credit = new Credit(new Currency(0.0));
        this.date = new FormattedDate();
        this.debit = debit;
        this.balance = balance;
        this.type = MovementType.WITHDRAW;
    }

    public Transaction(Credit credit, Balance balance) {
        this.date = new FormattedDate();
        this.debit = new Debit(new Currency(0.0));
        this.credit = credit;
        this.balance = balance;
        this.type = MovementType.DEPOSIT;
    }
}
