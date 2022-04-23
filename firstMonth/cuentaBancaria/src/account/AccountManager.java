package account;

import account.types.Id;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class AccountManager {
    private final ArrayList<Account> accounts;

    public AccountManager(Account... accounts) {
        this.accounts = new ArrayList<>(List.of(accounts));
    }

    public Account findById(Id id) {
        List<Account> found = this.accounts.stream().filter(account -> Objects.equals(account.checkId(), id.getId())).toList();
        if (found.size() == 1) {
            return found.get(0);
        }
        throw new IllegalStateException("Account not found");
    }

    public List<String> showAccountsId() {
        return this.accounts.stream().map(Account::checkId).collect(Collectors.toList());
    }
}
