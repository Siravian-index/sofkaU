package account.types;

import account.types.interfaces.IDate;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattedDate implements IDate {
    private final String date;

    public FormattedDate() {
        this.date = generateDate();
    }

    private String generateDate() {
        return formatDate(LocalDateTime.now());
    }

    private String formatDate(LocalDateTime date) {
//        return date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy-HH:mm"));
        return date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    @Override
    public String toString() {
        return "FormattedDate{" + "date='" + date + '\'' + '}';
    }

    @Override
    public String showDate() {
        return this.date;
    }
}
