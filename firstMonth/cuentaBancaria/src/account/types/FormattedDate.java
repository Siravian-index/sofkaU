package account.types;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FormattedDate {
    String date;

    public FormattedDate(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        this.date = simpleDateFormat.format(date);
    }
}
