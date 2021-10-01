package co.com.sofka.gymmanagement.domain.fitnessgym;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.gymmanagement.domain.fitnessgym.entity.Instructor;
import co.com.sofka.gymmanagement.domain.fitnessgym.entity.Salesman;
import co.com.sofka.gymmanagement.domain.fitnessgym.entity.Schedule;
import co.com.sofka.gymmanagement.domain.fitnessgym.value.Open;
import co.com.sofka.gymmanagement.domain.fitnessgym.value.FitnessGymId;
import co.com.sofka.gymmanagement.domain.shared.valueobject.Address;
import co.com.sofka.gymmanagement.domain.shared.valueobject.Email;
import co.com.sofka.gymmanagement.domain.shared.valueobject.Name;
import co.com.sofka.gymmanagement.domain.shared.valueobject.PhoneNumber;
import jdk.jfr.Description;

import java.util.Set;

public class FitnessGym extends AggregateEvent<FitnessGymId> {
    protected Name name;
    protected Email email;
    protected PhoneNumber phoneNumber;
    protected Address address;
    protected Open open;
    protected Set<Instructor> instructors;
    protected Set<Salesman> salesmen;
    protected Set<Schedule> schedule;
    protected Description description;

    public FitnessGym(FitnessGymId entityId, Name name,
                      Email email, PhoneNumber phoneNumber,
                      Address address) {
        super(entityId);
        this.name = name;
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

    public Open open() {
        return open;
    }

    public void changeOpen(Open open) {
        this.open = open;
    }

    public Set<Instructor> instructors() {
        return instructors;
    }

    public void changeInstructors(Set<Instructor> instructors) {
        this.instructors = instructors;
    }

    public Set<Salesman> salesmen() {
        return salesmen;
    }

    public void changeSalesmen(Set<Salesman> salesmen) {
        this.salesmen = salesmen;
    }

    public Description description() {
        return description;
    }

    public void changeDescription(Description description) {
        this.description = description;
    }

    public Set<Schedule> schedule() {
        return schedule;
    }

    public void changeSchedule(Set<Schedule> schedule) {
        this.schedule = schedule;
    }
}
