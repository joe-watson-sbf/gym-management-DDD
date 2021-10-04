package co.com.sofka.gymmanagement.domain.salesmanager.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.gymmanagement.domain.salesmanager.entity.Membership;
import co.com.sofka.gymmanagement.domain.salesmanager.value.CustomerId;
import co.com.sofka.gymmanagement.domain.salesmanager.value.SalesManagerId;
import co.com.sofka.gymmanagement.domain.shared.valueobject.Name;
import co.com.sofka.gymmanagement.domain.shared.valueobject.PhoneNumber;

public class CustomerRegistration extends Command {
    private final SalesManagerId salesManagerId;
    private final CustomerId cedula;
    private final Name name;
    private final PhoneNumber phoneNumber;
    private final Membership.Type type;

    public CustomerRegistration(CustomerId cedula, SalesManagerId salesManagerId, Name name,
                                PhoneNumber phoneNumber, Membership.Type type) {
        this.salesManagerId = salesManagerId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.cedula = cedula;
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

    public Membership.Type type() {
        return type;
    }

    public SalesManagerId getSalesManagerId() {
        return salesManagerId;
    }
}
