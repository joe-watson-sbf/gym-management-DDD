package co.com.sofka.gymmanagement.domain.fitnessgym.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.gymmanagement.domain.shared.valueobject.PhoneNumber;

public class FitnessGymPhoneNumberChanged extends DomainEvent {
    private final PhoneNumber phoneNumber;

    public FitnessGymPhoneNumberChanged(PhoneNumber phoneNumber) {
        super("co.com.sofka.gymmanagement.fitnessgym.phonenmberchanged");
        this.phoneNumber = phoneNumber;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }
}
