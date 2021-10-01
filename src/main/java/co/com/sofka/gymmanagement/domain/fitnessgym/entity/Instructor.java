package co.com.sofka.gymmanagement.domain.fitnessgym.entity;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.gymmanagement.domain.fitnessgym.value.Gender;
import co.com.sofka.gymmanagement.domain.fitnessgym.value.InstructorId;
import co.com.sofka.gymmanagement.domain.fitnessgym.value.Speciality;
import co.com.sofka.gymmanagement.domain.shared.valueobject.*;

public class Instructor extends Entity<InstructorId> {
    private Name name;
    private Gender gender;
    private Email email;
    private PhoneNumber phoneNumber;
    private Address address;
    private Speciality speciality;

    public Instructor(InstructorId entityId, Name name,
                      Gender gender, Email email, PhoneNumber phoneNumber,
                      Address address, Speciality speciality) {
        super(entityId);
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.speciality = speciality;
    }


    public void changeName(Name name){
        this.name = name;
    }

    public void changeGender(Gender gender) {
        this.gender = gender;
    }

    public void changeEmail(Email email) {
        this.email = email;
    }

    public void changePhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public void changeAddress(Address address) {
        this.address = address;
    }


    public void changeSpeciality(Speciality speciality) {
        this.speciality = speciality;
    }


    public Name name() {
        return name;
    }

    public Gender gender() {
        return gender;
    }

    public Email email() {
        return email;
    }

    public PhoneNumber phoneNumber() {
        return phoneNumber;
    }

    public Address address() {
        return address;
    }

    public Speciality speciality() {
        return speciality;
    }
}
