package co.com.sofka.gymmanagement.domain.shared.valueobject;

import co.com.sofka.domain.generic.ValueObject;
import static co.com.sofka.gymmanagement.domain.shared.utils.Utils.requireNonEmptyString;

public class Address implements ValueObject<String> {
    private final String value;

    public Address(String value) {
        this.value = requireNonEmptyString(value);
    }

    @Override
    public String value() {
        return value;
    }
}
