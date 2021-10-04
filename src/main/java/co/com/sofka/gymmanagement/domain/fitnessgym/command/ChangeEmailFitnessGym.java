package co.com.sofka.gymmanagement.domain.fitnessgym.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.gymmanagement.domain.fitnessgym.value.FitnessGymId;
import co.com.sofka.gymmanagement.domain.shared.valueobject.Email;

public class ChangeEmailFitnessGym extends Command {
    private final FitnessGymId fitnessGymId;
    private final Email email;

    public ChangeEmailFitnessGym(FitnessGymId fitnessGymId, Email email) {
        this.fitnessGymId = fitnessGymId;
        this.email = email;
    }

    public Email getEmail() {
        return email;
    }

    public FitnessGymId getFitnessGymId() {
        return fitnessGymId;
    }
}
