package co.com.sofka.gymmanagement.domain.fitnessgym.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.gymmanagement.domain.fitnessgym.value.FitnessGymId;
import co.com.sofka.gymmanagement.domain.fitnessgym.value.Gender;
import co.com.sofka.gymmanagement.domain.fitnessgym.value.SalesmanId;
import co.com.sofka.gymmanagement.domain.shared.valueobject.Address;
import co.com.sofka.gymmanagement.domain.shared.valueobject.Email;
import co.com.sofka.gymmanagement.domain.shared.valueobject.Name;
import co.com.sofka.gymmanagement.domain.shared.valueobject.PhoneNumber;

public class SalesmanRegistration extends Command {

    private final FitnessGymId fitnessGymId;
    private final SalesmanId salesmanId;
    private final Name name;
    private final Gender gender;
    private final Email email;
    private final PhoneNumber phoneNumber;
    private final Address address;

    public SalesmanRegistration(FitnessGymId fitnessGymId, SalesmanId salesmanId, Name name,
                              Gender gender, Email email,
                              PhoneNumber phoneNumber, Address address) {
        this.fitnessGymId = fitnessGymId;
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

    public FitnessGymId getFitnessGymId() {
        return fitnessGymId;
    }
}
