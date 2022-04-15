package account;

import account.types.Balance;
import account.types.Id;
import account.types.Owner;

public class AccountDetails {
//    add all the types I just coded
//    in the constructor initialize formattedDate and Id
//    I can leave two constructors depending on weather balance is added or not.
    final Id accountId;
    final Owner accountOwner;
    final Balance accountBalance;

    public AccountDetails(Id accountId, Owner accountOwner, Balance accountBalance) {
        this.accountId = accountId;
        this.accountOwner = accountOwner;
        this.accountBalance = accountBalance;
    }

    public String accountStatus() {
        return "Account id is: " + this.accountId + " the owner is " + this.accountOwner.getOwner() +
                " the current balance is " + accountBalance.currentBalance();
    }
}
