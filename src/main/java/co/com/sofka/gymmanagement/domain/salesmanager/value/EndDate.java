package co.com.sofka.gymmanagement.domain.salesmanager.value;

import co.com.sofka.domain.generic.ValueObject;

public class EndDate implements ValueObject<String> {
    private final String value;

    public EndDate(String value) {
        this.value = value;
    }

    @Override
    public String value() {
        return value;
    }
}