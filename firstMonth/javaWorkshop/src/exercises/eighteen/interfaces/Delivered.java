package exercises.eighteen.interfaces;

public interface Delivered<T> {
        void deliver();
        void refund();
        boolean isDelivered();
        void compareTo(T t);
}
