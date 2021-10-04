package co.com.sofka.gymmanagement.domain.fitnessgym.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.gymmanagement.domain.fitnessgym.value.FitnessGymId;
import co.com.sofka.gymmanagement.domain.fitnessgym.value.InstructorId;

public class DeleteInstructor extends Command {
    private final FitnessGymId fitnessGymId;
    private final InstructorId instructorId;


    public DeleteInstructor(FitnessGymId fitnessGymId, InstructorId instructorId) {
        this.fitnessGymId = fitnessGymId;
        this.instructorId = instructorId;
    }

    public InstructorId getInstructorId() {
        return instructorId;
    }

    public FitnessGymId getFitnessGymId() {
        return fitnessGymId;
    }
}
