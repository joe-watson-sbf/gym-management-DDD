package co.com.sofka.gymmanagement.domain.fitnessgym.value;

import co.com.sofka.domain.generic.ValueObject;

public class Open implements ValueObject<Boolean> {
    private final boolean value;

    public Open(boolean value) {
        this.value = value;
    }

    @Override
    public Boolean value() {
        return value;
    }
}
