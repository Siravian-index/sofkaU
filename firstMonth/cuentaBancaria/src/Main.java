import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        var date = LocalDateTime.now();
        System.out.println(String.valueOf(date));

    }
}