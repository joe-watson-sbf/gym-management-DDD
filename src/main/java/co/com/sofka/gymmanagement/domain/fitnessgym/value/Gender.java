package co.com.sofka.gymmanagement.domain.fitnessgym.value;

import co.com.sofka.domain.generic.ValueObject;

public class Gender implements ValueObject<Boolean> {
    private final boolean value;

    public Gender(boolean value) {
        this.value = value;
    }

    @Override
    public Boolean value() {
        return value;
    }
}
