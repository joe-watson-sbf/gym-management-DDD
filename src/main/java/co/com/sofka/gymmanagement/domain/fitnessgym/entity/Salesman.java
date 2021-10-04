package co.com.sofka.gymmanagement.domain.fitnessgym.entity;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.gymmanagement.domain.fitnessgym.value.Gender;
import co.com.sofka.gymmanagement.domain.fitnessgym.value.SalesmanId;
import co.com.sofka.gymmanagement.domain.shared.valueobject.Address;
import co.com.sofka.gymmanagement.domain.shared.valueobject.Email;
import co.com.sofka.gymmanagement.domain.shared.valueobject.Name;
import co.com.sofka.gymmanagement.domain.shared.valueobject.PhoneNumber;

public class Salesman extends Entity<SalesmanId> {

    private Name name;
    private Gender gender;
    private Email email;
    private PhoneNumber phoneNumber;
    private Address address;

    public Salesman(SalesmanId entityId, Name name,
                    Gender gender, Email email,
                    PhoneNumber phoneNumber, Address address) {
        super(entityId);
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public Name name() {
        return name;
    }

    public void changeName(Name name) {
        this.name = name;
    }

    public Gender gender() {
        return gender;
    }

    public void changeGender(Gender gender) {
        this.gender = gender;
    }

    public Email email() {
        return email;
    }

    public void changeEmail(Email email) {
        this.email = email;
    }

    public PhoneNumber phoneNumber() {
        return phoneNumber;
    }

    public void changePhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Address address() {
        return address;
    }

    public void changeAddress(Address address) {
        this.address = address;
    }
}
