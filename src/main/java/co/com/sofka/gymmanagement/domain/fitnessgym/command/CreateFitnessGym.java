package co.com.sofka.gymmanagement.domain.fitnessgym.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.gymmanagement.domain.fitnessgym.value.Description;
import co.com.sofka.gymmanagement.domain.fitnessgym.value.FitnessGymId;
import co.com.sofka.gymmanagement.domain.shared.valueobject.Address;
import co.com.sofka.gymmanagement.domain.shared.valueobject.Email;
import co.com.sofka.gymmanagement.domain.shared.valueobject.Name;
import co.com.sofka.gymmanagement.domain.shared.valueobject.PhoneNumber;

public class CreateFitnessGym extends Command {
    private final FitnessGymId fitnessGymId;
    private final Name name;
    private final Email email;
    private final PhoneNumber phoneNumber;
    private final Address address;
    private final Description description;

    public CreateFitnessGym(FitnessGymId fitnessGymId, Name name,
                            Email email, PhoneNumber phoneNumber,
                            Address address, Description description) {
        this.fitnessGymId = fitnessGymId;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.description = description;
    }

    public FitnessGymId getFitnessGymId() {
        return fitnessGymId;
    }

    public Name getName() {
        return name;
    }

    public Email getEmail() {
        return email;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public Address getAddress() {
        return address;
    }

    public Description getDescription() {
        return description;
    }
}
