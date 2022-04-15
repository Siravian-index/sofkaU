package account.types.interfaces;

import account.Transaction;
import account.types.Credit;
import account.types.Currency;
import account.types.Debit;

public interface IBalance {
    Transaction withDraw(Debit amount);

    Transaction deposit(Credit amount);

    //    Transaction transfer(Id accountId, Currency amount);
    Transaction saveTransaction(Debit debit, Currency balance);

    Transaction saveTransaction(Credit credit, Currency balance);

    Double currentBalance();

//    void balanceHistory();

}
