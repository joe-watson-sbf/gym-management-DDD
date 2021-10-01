package co.com.sofka.gymmanagement.domain.fitnessgym.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.gymmanagement.domain.fitnessgym.value.Description;
import co.com.sofka.gymmanagement.domain.fitnessgym.value.FitnessGymId;
import co.com.sofka.gymmanagement.domain.shared.valueobject.Address;
import co.com.sofka.gymmanagement.domain.shared.valueobject.Email;
import co.com.sofka.gymmanagement.domain.shared.valueobject.Name;
import co.com.sofka.gymmanagement.domain.shared.valueobject.PhoneNumber;

public class FitnessGymCreated extends DomainEvent {
    private final Name name;
    private final Email email;
    private final PhoneNumber phoneNumber;
    private final Address address;
    private final Description description;

    public FitnessGymCreated(Name name, Email email, PhoneNumber phoneNumber,
                             Address address, Description description) {
        super("co.com.sofka.gymmanagement.fitnessgym.fitnessgymcreated");
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.description = description;
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
