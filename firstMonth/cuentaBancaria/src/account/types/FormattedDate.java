package account.types;

import account.types.interfaces.IDate;
import account.types.interfaces.IValue;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FormattedDate implements IDate {
    String date;
    public FormattedDate() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        this.date = simpleDateFormat.format(new Date());
    }


    @Override
    public String value() {
        return this.date;
    }

    @Override
    public String toString() {
        return "FormattedDate{" +
                "date='" + date + '\'' +
                '}';
    }
}
