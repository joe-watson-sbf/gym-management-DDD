package co.com.sofka.gymmanagement.domain.shared.valueobject;

import co.com.sofka.domain.generic.ValueObject;

import static co.com.sofka.gymmanagement.domain.shared.utils.Utils.requireNonEmptyString;

public class Email implements ValueObject<String> {
    private final String value;

    public Email(String value) {
        this.value = requireNonEmptyString(value);
    }

    @Override
    public String value() {
        return value;
    }
}
