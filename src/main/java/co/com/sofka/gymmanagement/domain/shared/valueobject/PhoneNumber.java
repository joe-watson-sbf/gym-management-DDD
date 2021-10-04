package co.com.sofka.gymmanagement.domain.shared.valueobject;

import co.com.sofka.domain.generic.ValueObject;

import static co.com.sofka.gymmanagement.domain.shared.utils.Utils.requireNonEmptyString;

public class PhoneNumber implements ValueObject<String> {
    private final String value;

    public PhoneNumber(String value) {
        this.value = requireNonEmptyString(value);
    }

    @Override
    public String value() {
        return value;
    }
}
