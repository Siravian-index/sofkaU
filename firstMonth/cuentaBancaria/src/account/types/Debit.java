package account.types;

import account.types.interfaces.IValue;

public class Debit implements IValue<Currency> {
    private Currency debit;

    public Debit(Currency debit) {
        this.debit = debit;
    }

    @Override
    public Currency value() {
        return this.debit;
    }

    public void updateValue(Currency currency) {
        this.debit = new Currency(this.debit.value() + currency.value());
    }


    @Override
    public String toString() {
        return "Debit{" +
                "debit=" + debit +
                '}';
    }


}
