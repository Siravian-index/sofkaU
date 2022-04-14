package account.types;

import account.types.interfaces.IValue;

public class Currency implements IValue<Double> {
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
        return "Currency{" +
                "currency=" + currency +
                '}';
    }
}
