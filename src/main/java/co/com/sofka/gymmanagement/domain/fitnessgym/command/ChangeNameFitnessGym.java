package co.com.sofka.gymmanagement.domain.fitnessgym.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.gymmanagement.domain.fitnessgym.value.FitnessGymId;
import co.com.sofka.gymmanagement.domain.shared.valueobject.Name;

public class ChangeNameFitnessGym extends Command {

    private final FitnessGymId fitnessGymId;
    private final Name name;

    public ChangeNameFitnessGym(FitnessGymId fitnessGymId, Name name) {
        this.fitnessGymId = fitnessGymId;
        this.name = name;
    }

    public Name getName() {
        return name;
    }

    public FitnessGymId getFitnessGymId() {
        return fitnessGymId;
    }
}
