package co.com.sofka.gymmanagement.domain.fitnessgym.value;

import co.com.sofka.domain.generic.ValueObject;

import static co.com.sofka.gymmanagement.domain.shared.utils.Utils.requireNonEmptyString;

public class OpenHour implements ValueObject<String> {
    private final String value;

    public OpenHour(String value) {
        this.value = requireNonEmptyString(value);
    }

    @Override
    public String value() {
        return value;
    }
}