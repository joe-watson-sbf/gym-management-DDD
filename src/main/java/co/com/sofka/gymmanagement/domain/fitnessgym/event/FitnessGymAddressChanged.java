package co.com.sofka.gymmanagement.domain.fitnessgym.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.gymmanagement.domain.shared.valueobject.Address;

public class FitnessGymAddressChanged extends DomainEvent {
    private final Address address;

    public FitnessGymAddressChanged(Address address) {
        super("co.com.sofka.gymmanagement.fitnessgym.addresschanged");
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
}
