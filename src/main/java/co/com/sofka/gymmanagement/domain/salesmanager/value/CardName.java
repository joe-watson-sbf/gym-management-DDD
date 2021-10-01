package co.com.sofka.gymmanagement.domain.salesmanager.value;

import co.com.sofka.domain.generic.ValueObject;
import static co.com.sofka.gymmanagement.domain.shared.utils.Utils.requireNonEmptyString;

public class CardName implements ValueObject<String> {
    private final String value;

    public CardName(String value) {
        this.value = requireNonEmptyString(value);
    }

    @Override
    public String value() {
        return value;
    }
}
