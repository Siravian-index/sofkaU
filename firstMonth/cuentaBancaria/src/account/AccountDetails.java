package account;

import account.types.Balance;
import account.types.Id;
import account.types.Owner;

public class AccountDetails {
    final Id accountId;
    final Owner accountOwner;
    final Balance accountBalance;

    public AccountDetails(Id accountId, Owner accountOwner, Balance accountBalance) {
        this.accountId = accountId;
        this.accountOwner = accountOwner;
        this.accountBalance = accountBalance;
    }

    public String accountStatus() {
        return "Account id is: " + this.accountId.getId() + ", the owner is " + this.accountOwner.getOwner() +
                ", and the current balance is " + accountBalance.currentBalance();
    }
}
