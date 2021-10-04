package co.com.sofka.gymmanagement.domain.salesmanager.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.gymmanagement.domain.salesmanager.entity.Membership;
import co.com.sofka.gymmanagement.domain.salesmanager.value.CustomerId;
import co.com.sofka.gymmanagement.domain.salesmanager.value.SalesManagerId;
import co.com.sofka.gymmanagement.domain.shared.valueobject.Name;
import co.com.sofka.gymmanagement.domain.shared.valueobject.PhoneNumber;


public class CustomerRegistered extends DomainEvent {
    private final SalesManagerId salesManagerId;
    private final CustomerId cedula;
    private final Name name;
    private final PhoneNumber phoneNumber;
    private final Membership.Type type;

    public CustomerRegistered(CustomerId cedula, SalesManagerId salesManagerId, Name name,
                              PhoneNumber phoneNumber, Membership.Type type) {
        super("co.com.sofka.gymmanagement.salesmanager.customerregistered");
        this.salesManagerId = salesManagerId;
        this.cedula = cedula;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.type = type;
    }

    public CustomerId getCedula() {
        return cedula;
    }

    public Name getName() {
        return name;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public SalesManagerId getSalesManagerId() {
        return salesManagerId;
    }

    public Membership.Type getType() {
        return type;
    }
}
