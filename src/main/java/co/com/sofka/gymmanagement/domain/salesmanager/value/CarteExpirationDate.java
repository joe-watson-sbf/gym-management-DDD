package co.com.sofka.gymmanagement.domain.salesmanager.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Date;

public class CarteExpirationDate implements ValueObject<Date> {
    private final Date date;

    public CarteExpirationDate(Date date) {
        this.date = date;
    }

    @Override
    public Date value() {
        return date;
    }
}
