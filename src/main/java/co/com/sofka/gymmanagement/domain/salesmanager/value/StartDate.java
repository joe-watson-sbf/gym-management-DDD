package co.com.sofka.gymmanagement.domain.salesmanager.value;

import co.com.sofka.domain.generic.ValueObject;

public class StartDate implements ValueObject<String> {
    private final String value;

    public StartDate(String value) {
        this.value = value;
    }

    @Override
    public String value() {
        return value;
    }
}
