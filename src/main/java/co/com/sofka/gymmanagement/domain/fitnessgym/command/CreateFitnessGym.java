package co.com.sofka.gymmanagement.domain.fitnessgym.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.gymmanagement.domain.fitnessgym.value.FitnessGymId;

public class CreateFitnessGym extends Command {
    private final FitnessGymId fitnessGymId;

    public CreateFitnessGym(FitnessGymId fitnessGymId) {
        this.fitnessGymId = fitnessGymId;
    }
}
