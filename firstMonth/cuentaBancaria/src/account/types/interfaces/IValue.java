package account.types.interfaces;

public interface IValue<T> {

    T value();
    String toString();

    void updateValue();
}
