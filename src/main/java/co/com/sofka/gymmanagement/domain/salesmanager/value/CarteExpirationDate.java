package co.com.sofka.gymmanagement.domain.salesmanager.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Date;
import java.util.Objects;

public class CarteExpirationDate implements ValueObject<Date> {
    private final Date date;

    public CarteExpirationDate(Date date) {
        this.date = Objects.requireNonNull(date, "ERROR: Expiration Date is null!!!");
    }

    @Override
    public Date value() {
        return date;
    }
}
