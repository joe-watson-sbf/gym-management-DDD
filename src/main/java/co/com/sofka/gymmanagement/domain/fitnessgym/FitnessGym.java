package co.com.sofka.gymmanagement.domain.fitnessgym;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.gymmanagement.domain.fitnessgym.entity.Instructor;
import co.com.sofka.gymmanagement.domain.fitnessgym.entity.Salesman;
import co.com.sofka.gymmanagement.domain.fitnessgym.entity.Schedule;
import co.com.sofka.gymmanagement.domain.fitnessgym.event.*;
import co.com.sofka.gymmanagement.domain.fitnessgym.value.*;
import co.com.sofka.gymmanagement.domain.shared.valueobject.Address;
import co.com.sofka.gymmanagement.domain.shared.valueobject.Email;
import co.com.sofka.gymmanagement.domain.shared.valueobject.Name;
import co.com.sofka.gymmanagement.domain.shared.valueobject.PhoneNumber;

import java.util.List;
import java.util.Objects;
import java.util.Set;

import static co.com.sofka.gymmanagement.domain.fitnessgym.Validations.*;

public class FitnessGym extends AggregateEvent<FitnessGymId> {
    protected Name name;
    protected Email email;
    protected PhoneNumber phoneNumber;
    protected Address address;
    protected Open open;
    protected Set<Instructor> instructors;
    protected Set<Salesman> salesmen;
    protected Set<Schedule> scheduleSet;
    protected Description description;

    public FitnessGym(FitnessGymId entityId, Name name, Email email,
                      PhoneNumber phoneNumber, Address address,
                      Description description)
    {
        super(entityId);
        appendChange(new FitnessGymCreated(name, email, phoneNumber, address, description)).apply();

    }

    private FitnessGym(FitnessGymId entityId){
        super(entityId);
        subscribe(new FitnessGymChange(this));
    }

    public static FitnessGym from(FitnessGymId entityId, List<DomainEvent> events){
        var fitnessGym = new FitnessGym(entityId);
        events.forEach(fitnessGym::applyEvent);
        return fitnessGym;
    }


    /**
     * Schedule Methods
     * */

    public void createSchedule(ScheduleId scheduleId, OpenDay openDay, CloseDay closeDay,
                               OpenHour openHour, PauseHour pauseHour, CloseHour closeHour)
    {
        // Validation of all input data
        validateScheduleInput(scheduleId, openDay, closeDay,
                openHour, pauseHour, closeHour);

        appendChange(new ScheduleCreated(scheduleId, openDay, closeDay,
                openHour, pauseHour, closeHour)).apply();
    }

    public void changeSchedule(ScheduleId scheduleId, OpenDay openDay, CloseDay closeDay,
                               OpenHour openHour, PauseHour pauseHour, CloseHour closeHour)
    {
        // Validation of all input data
        validateScheduleInput(scheduleId, openDay, closeDay,
                openHour, pauseHour, closeHour);

        appendChange(new ScheduleUpdated(scheduleId, openDay, closeDay,
                openHour, pauseHour, closeHour)).apply();
    }

    public void findScheduleById(ScheduleId scheduleId) {
        Objects.requireNonNull(scheduleId);
        appendChange(new ScheduleGotten(scheduleId));
    }

    /**
     * END : Schedule Methods
     * */




    /**
     * SalesMen Methods
     * */

    public void salesmanRegistration(SalesmanId salesmanId, Name name,
                                     Gender gender, Email email,
                                     PhoneNumber phoneNumber, Address address)
    {
        // Validation of all input data
        validateSalesmanInput(salesmanId, name, gender,
                email, phoneNumber, address);

        appendChange(new SalesmanRegistered(salesmanId, name, gender,
                email, phoneNumber, address)).apply();
    }

    public void UupdateSalesman(SalesmanId salesmanId, Name name,
                                     Gender gender, Email email,
                                     PhoneNumber phoneNumber, Address address)
    {
        // Validation of all input data
        validateSalesmanInput(salesmanId, name, gender,
                email, phoneNumber, address);

        appendChange(new SalesmanUpdated(salesmanId, name, gender,
                email, phoneNumber, address)).apply();
    }

    public Salesman findSalesmanById(SalesmanId salesmanId) {
        return salesmen.stream()
                .filter(e -> e.identity().equals(salesmanId))
                .findFirst()
                .orElseThrow(()->
                        new IllegalArgumentException("Salesman not found!!!"));
    }

    /**
     * END : SalesMen Methods
     * */



    /**
     * Instructor Methods
     * */
    public void instructorRegistration(InstructorId instructorId, Name name,
                                     Gender gender, Email email, PhoneNumber phoneNumber,
                                     Address address, Speciality speciality)
    {
        validateInstructorInput(instructorId, name, gender,email,
                phoneNumber, address, speciality);

        appendChange(new InstructorRegistered(instructorId, name, gender,email,
                phoneNumber, address, speciality)).apply();
    }

    public void updateInstructor(InstructorId instructorId, Name name,
                                       Gender gender, Email email, PhoneNumber phoneNumber,
                                       Address address, Speciality speciality)
    {
        validateInstructorInput(instructorId, name, gender,email,
                phoneNumber, address, speciality);

        appendChange(new InstructorUpdated(instructorId, name, gender,email,
                phoneNumber, address, speciality)).apply();
    }

    public void findInstructorById(InstructorId instructorId) {
        Objects.requireNonNull(instructorId);
        appendChange(new InstructorGotten(instructorId)).apply();
    }

    /**
     * END : Instructor Methods
     * */






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

    public Open isOpen() {
        return open;
    }

    public void changeOpen(Open open) {
        this.open = open;
    }

    public Set<Instructor> instructors() {
        return instructors;
    }

    public Set<Salesman> salesmen() {
        return salesmen;
    }

    public Description description() {
        return description;
    }

    public void changeDescription(Description description) {
        this.description = description;
    }

    public Set<Schedule> schedule() {
        return scheduleSet;
    }
}
