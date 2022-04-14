package account;

import java.util.ArrayList;
import java.util.Date;

public class Account {
    int credit;
    int debit;
    int balance;
    ArrayList<Object> history;
    public Account() {
        this.credit = 0;
        this.debit = 0;
        this.balance = 0;
    }

    public void deposit(int amount, String date) {
        this.balance += amount;

//        "guardar" esta transaccion
    }
    public void withdraw(int amount, String date){
        if (this.balance > amount) {
            this.balance -= amount;
        }
//        "guardar" esta transaccion
    }
    public void printStatements() {

    }
}
