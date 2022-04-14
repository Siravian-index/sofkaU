package account.types;

import account.types.interfaces.IValue;

public class Debit implements IValue<Currency> {
    private final Currency debit;

    public Debit(Currency debit) {
        this.debit = debit;
    }

    @Override
    public Currency value() {
        return this.debit;
    }

    @Override
    public String toString() {
        return "Debit{" +
                "debit=" + debit +
                '}';
    }


}
