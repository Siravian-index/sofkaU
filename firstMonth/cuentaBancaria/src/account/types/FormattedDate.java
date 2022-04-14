package account.types;

import account.types.interfaces.IDate;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattedDate implements IDate {
    final LocalDateTime date;

    public FormattedDate() {
        this.date = LocalDateTime.now();
    }

    @Override
    public String showFullDate() {
        return formatDate(this.date, "dd/MM/yyyy-HH:mm:ss");
    }

    @Override
    public String showDate() {
        return formatDate(this.date, "dd/MM/yyyy");
    }

    @Override
    public String showHour() {
        return formatDate(this.date, "HH:mm:ss");
    }

    private String formatDate(LocalDateTime date, String pattern) {
        return date.format(DateTimeFormatter.ofPattern(pattern));
    }


    @Override
    public String toString() {
        return "FormattedDate{" +
                "date='" + date + '\'' +
                '}';
    }
}
