package co.com.sofka.gymmanagement.domain.fitnessgym.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.gymmanagement.domain.shared.valueobject.Name;

public class FitnessGymNameChanged extends DomainEvent {
    private final Name name;

    public FitnessGymNameChanged(Name name) {
        super("co.com.sofka.gymmanagement.fitnessgym.namechanged");
        this.name = name;
    }

    public Name getName() {
        return name;
    }
}
