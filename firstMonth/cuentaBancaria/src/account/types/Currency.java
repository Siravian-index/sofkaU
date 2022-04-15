package account.types;

import account.types.interfaces.ICurrency;
import account.types.interfaces.IValue;

public class Currency implements IValue, ICurrency {
    private final Double currency;

    public Currency(Double currency) {
        this.currency = currency;
    }

    @Override
    public Double value() {
        return this.currency;
    }


    @Override
    public String toString() {
        return "Currency{" + "currency=" + currency + '}';
    }

    @Override
    public Currency plusCurrency(Currency currency) {
        return new Currency(this.value() + currency.value());
    }

    @Override
    public Currency minusCurrency(Currency currency) {
        return new Currency(this.value() - currency.value());
    }
}
