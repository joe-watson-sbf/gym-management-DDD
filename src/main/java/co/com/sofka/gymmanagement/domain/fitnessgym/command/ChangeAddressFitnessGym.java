package co.com.sofka.gymmanagement.domain.fitnessgym.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.gymmanagement.domain.fitnessgym.value.FitnessGymId;
import co.com.sofka.gymmanagement.domain.shared.valueobject.Address;

public class ChangeAddressFitnessGym extends Command {
    private final FitnessGymId fitnessGymId;
    private final Address address;

    public ChangeAddressFitnessGym(FitnessGymId fitnessGymId, Address address) {
        this.fitnessGymId = fitnessGymId;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public FitnessGymId getFitnessGymId() {
        return fitnessGymId;
    }
}
