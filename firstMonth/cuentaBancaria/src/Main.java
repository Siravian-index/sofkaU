import account.types.Currency;
import account.types.Debit;

public class Main {
    public static void main(String[] args) {
        var debit = new Debit(new Currency(300.00));
        System.out.println(debit.value());
        debit.addCurrency(new Currency(100.00));
        System.out.println(debit.value());

    }
}