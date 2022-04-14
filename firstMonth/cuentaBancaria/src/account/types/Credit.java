package account.types;

import account.types.interfaces.IValue;

public class Credit implements IValue<Currency> {
    private final Currency credit;

    public Credit(Currency credit) {
        this.credit = credit;
    }

    @Override
    public Currency value() {
        return this.credit;
    }

    @Override
    public String toString() {
        return "Credit{" + "credit=" + credit + '}';
    }
}
