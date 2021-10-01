package co.com.sofka.gymmanagement.domain.shared.valueobject;

import co.com.sofka.domain.generic.ValueObject;
import static co.com.sofka.gymmanagement.domain.shared.utils.Utils.requireNonEmptyString;

public class Name implements ValueObject<String> {
    private final String value;

    public Name(String value) {
        this.value = requireNonEmptyString(value);
    }

    @Override
    public String value() {
        return value;
    }
}
