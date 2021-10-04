package co.com.sofka.gymmanagement.domain.fitnessgym.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.gymmanagement.domain.fitnessgym.value.Gender;
import co.com.sofka.gymmanagement.domain.fitnessgym.value.SalesmanId;
import co.com.sofka.gymmanagement.domain.shared.valueobject.Address;
import co.com.sofka.gymmanagement.domain.shared.valueobject.Email;
import co.com.sofka.gymmanagement.domain.shared.valueobject.Name;
import co.com.sofka.gymmanagement.domain.shared.valueobject.PhoneNumber;

public class SalesmanUpdated extends DomainEvent {

    private final SalesmanId salesmanId;
    private final Name name;
    private final Gender gender;
    private final Email email;
    private final PhoneNumber phoneNumber;
    private final Address address;

    public SalesmanUpdated(SalesmanId salesmanId, Name name,
                              Gender gender, Email email,
                              PhoneNumber phoneNumber, Address address) {
        super("co.com.sofka.gymmanagement.salesmanager.salesmanupdated");
        this.salesmanId= salesmanId;
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public SalesmanId getSalesmanId() {
        return salesmanId;
    }

    public Name getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
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
}
