package co.com.sofka.gymmanagement.domain.fitnessgym;

import co.com.sofka.gymmanagement.domain.fitnessgym.value.*;
import co.com.sofka.gymmanagement.domain.shared.valueobject.Address;
import co.com.sofka.gymmanagement.domain.shared.valueobject.Email;
import co.com.sofka.gymmanagement.domain.shared.valueobject.Name;
import co.com.sofka.gymmanagement.domain.shared.valueobject.PhoneNumber;

import java.util.Objects;

public class Validations {

    private static final String NULL_BLANK_OBJECT = "can't be null or blanc!!!";

    public static void validateScheduleInput(ScheduleId scheduleId, OpenDay openDay, CloseDay closeDay,
                                             OpenHour openHour, PauseHour pauseHour, CloseHour closeHour)
    {
        Objects.requireNonNull(scheduleId, "Schedule id " + NULL_BLANK_OBJECT);
        Objects.requireNonNull(openDay, "Open day " + NULL_BLANK_OBJECT);
        Objects.requireNonNull(closeDay, "Close day " + NULL_BLANK_OBJECT);
        Objects.requireNonNull(openHour, "Open hour " + NULL_BLANK_OBJECT);
        Objects.requireNonNull(pauseHour, "Pause hour " + NULL_BLANK_OBJECT);
        Objects.requireNonNull(closeHour, "Close hour " + NULL_BLANK_OBJECT);
    }

    public static void validateSalesmanInput(SalesmanId salesmanId, Name name,
                                             Gender gender, Email email,
                                             PhoneNumber phoneNumber, Address address)
    {
        Objects.requireNonNull(salesmanId, "Salesman id " + NULL_BLANK_OBJECT);
        Objects.requireNonNull(name, "Name " + NULL_BLANK_OBJECT);
        Objects.requireNonNull(gender, "Gender " + NULL_BLANK_OBJECT);
        Objects.requireNonNull(email, "Email " + NULL_BLANK_OBJECT);
        Objects.requireNonNull(phoneNumber, "Phone number " + NULL_BLANK_OBJECT);
        Objects.requireNonNull(address, "Address " + NULL_BLANK_OBJECT);
    }


    public static void validateInstructorInput(InstructorId instructorId, Name name,
                                               Gender gender, Email email, PhoneNumber phoneNumber,
                                               Address address, Speciality speciality)
    {
        Objects.requireNonNull(instructorId, "Instructor Id " + NULL_BLANK_OBJECT);
        Objects.requireNonNull(name, "Name " + NULL_BLANK_OBJECT);
        Objects.requireNonNull(gender, "Gender " + NULL_BLANK_OBJECT);
        Objects.requireNonNull(email, "Email " + NULL_BLANK_OBJECT);
        Objects.requireNonNull(phoneNumber, "Phone number " + NULL_BLANK_OBJECT);
        Objects.requireNonNull(address, "Address " + NULL_BLANK_OBJECT);
        Objects.requireNonNull(speciality, "Speciality " + NULL_BLANK_OBJECT);
    }
}
