package account.types;

import account.types.interfaces.IValue;

public class Debit implements IValue {
    private final Currency debit;

    public Debit(Currency debit) {
        this.debit = debit;
    }

    @Override
    public Double value() {
        return this.debit.value();
    }

    @Override
    public String toString() {
        return "Debit{" + "debit=" + debit + '}';
    }

}
