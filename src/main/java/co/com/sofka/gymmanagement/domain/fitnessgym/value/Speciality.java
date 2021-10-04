package co.com.sofka.gymmanagement.domain.fitnessgym.value;

import co.com.sofka.domain.generic.ValueObject;

public class Speciality implements ValueObject<String> {
    private final String value;

    public Speciality(String value) {
        this.value = value;
    }

    @Override
    public String value() {
        return value;
    }
}
