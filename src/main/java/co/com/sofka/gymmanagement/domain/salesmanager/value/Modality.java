package co.com.sofka.gymmanagement.domain.salesmanager.value;

import co.com.sofka.domain.generic.ValueObject;

public class Modality implements ValueObject<String> {
    private final String value;

    public Modality(String value) {
        this.value = value;
    }

    @Override
    public String value() {
        return null;
    }
}
