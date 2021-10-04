package co.com.sofka.gymmanagement.domain.fitnessgym.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.gymmanagement.domain.fitnessgym.value.FitnessGymId;
import co.com.sofka.gymmanagement.domain.shared.valueobject.PhoneNumber;

public class ChangePhoneNumberFitnessGym extends Command {

    private final FitnessGymId fitnessGymId;
    private final PhoneNumber phoneNumber;

    public ChangePhoneNumberFitnessGym(FitnessGymId fitnessGymId, PhoneNumber phoneNumber) {
        this.fitnessGymId = fitnessGymId;
        this.phoneNumber = phoneNumber;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public FitnessGymId getFitnessGymId() {
        return fitnessGymId;
    }
}
