package co.com.sofka.gymmanagement.domain.fitnessgym.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.gymmanagement.domain.fitnessgym.value.InstructorId;

public class InstructorGotten extends DomainEvent {
    private final InstructorId instructorId;


    public InstructorGotten(InstructorId instructorId) {
        super("co.com.sofka.gymmanagement.fitnessgym.instructorgotten");
        this.instructorId = instructorId;
    }

    public InstructorId getInstructorId() {
        return instructorId;
    }

}
