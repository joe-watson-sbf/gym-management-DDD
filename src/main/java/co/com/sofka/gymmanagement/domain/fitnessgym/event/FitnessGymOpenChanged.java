package co.com.sofka.gymmanagement.domain.fitnessgym.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.gymmanagement.domain.fitnessgym.value.Open;

public class FitnessGymOpenChanged extends DomainEvent {
    private final Open open;

    public FitnessGymOpenChanged(Open open) {
        super("co.com.sofka.gymmanagement.fitnessgym.opened");
        this.open = open;
    }

    public Open getOpen() {
        return open;
    }
}
