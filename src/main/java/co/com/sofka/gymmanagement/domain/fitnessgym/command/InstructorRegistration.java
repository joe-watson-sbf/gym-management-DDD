package co.com.sofka.gymmanagement.domain.fitnessgym.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.gymmanagement.domain.fitnessgym.value.FitnessGymId;
import co.com.sofka.gymmanagement.domain.fitnessgym.value.Gender;
import co.com.sofka.gymmanagement.domain.fitnessgym.value.InstructorId;
import co.com.sofka.gymmanagement.domain.fitnessgym.value.Speciality;
import co.com.sofka.gymmanagement.domain.shared.valueobject.Address;
import co.com.sofka.gymmanagement.domain.shared.valueobject.Email;
import co.com.sofka.gymmanagement.domain.shared.valueobject.Name;
import co.com.sofka.gymmanagement.domain.shared.valueobject.PhoneNumber;

public class InstructorRegistration extends Command {

    private final FitnessGymId fitnessGymId;
    private final InstructorId instructorId;
    private final Name name;
    private final Gender gender;
    private final Email email;
    private final PhoneNumber phoneNumber;
    private final Address address;
    private final Speciality speciality;

    public InstructorRegistration(FitnessGymId fitnessGymId, InstructorId instructorId, Name name,
                            Gender gender, Email email, PhoneNumber phoneNumber,
                            Address address, Speciality speciality) {
        this.fitnessGymId = fitnessGymId;
        this.instructorId = instructorId;
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.speciality = speciality;
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

    public Speciality getSpeciality() {
        return speciality;
    }

    public InstructorId getInstructorId() {
        return instructorId;
    }

    public FitnessGymId getFitnessGymId() {
        return fitnessGymId;
    }
}
