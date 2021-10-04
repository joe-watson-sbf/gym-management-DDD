package co.com.sofka.gymmanagement.domain.fitnessgym.value;

import co.com.sofka.domain.generic.ValueObject;

public class Gender implements ValueObject<String> {
    private final String value;

    public Gender(String value) {
        this.value = value;
    }

    @Override
    public String value() {
        return value;
    }
}
