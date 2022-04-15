package account.types;

import account.types.interfaces.IValue;

public class Credit implements IValue {
    private final Currency credit;

    public Credit(Currency credit) {
        this.credit = credit;
    }

    @Override
    public Double value() {
        return this.credit.value();
    }

    @Override
    public String toString() {
        return "Credit{" + "credit=" + credit + '}';
    }
}
