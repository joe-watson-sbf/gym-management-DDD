package co.com.sofka.gymmanagement.domain.salesmanager.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.gymmanagement.domain.salesmanager.value.CustomerId;
import co.com.sofka.gymmanagement.domain.shared.valueobject.Name;
import co.com.sofka.gymmanagement.domain.shared.valueobject.PhoneNumber;


public class CustomerSubscribed extends DomainEvent {
    private CustomerId customerId;
    private Name name;
    private PhoneNumber phoneNumber;

    public CustomerSubscribed(CustomerId customerId, Name name, PhoneNumber phoneNumber) {
        super("co.com.sofka.gymmanagement.salesmanager.customersubscribed");
        this.customerId = customerId;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public CustomerId getCustomerId() {
        return customerId;
    }

    public Name getName() {
        return name;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }
}
