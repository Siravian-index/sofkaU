package account.validator;

public class AccountValidator {

    public static void validateValue(Double value) {
        if (value <= 0) {
            throw new IllegalStateException("The value must be greater than 0");
        }
    }

}
