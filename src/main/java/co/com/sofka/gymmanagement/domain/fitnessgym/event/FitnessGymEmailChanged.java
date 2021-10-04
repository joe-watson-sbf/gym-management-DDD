package co.com.sofka.gymmanagement.domain.fitnessgym.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.gymmanagement.domain.shared.valueobject.Email;

public class FitnessGymEmailChanged extends DomainEvent {
    private final Email email;

    public FitnessGymEmailChanged(Email email) {
        super("co.com.sofka.gymmanagement.fitnessgym.emailchanged");
        this.email = email;
    }

    public Email getEmail() {
        return email;
    }
}
