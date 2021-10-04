package co.com.sofka.gymmanagement.domain.salesmanager.entity;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.gymmanagement.domain.salesmanager.value.*;
import co.com.sofka.gymmanagement.domain.shared.valueobject.Name;
import co.com.sofka.gymmanagement.domain.shared.valueobject.PhoneNumber;

public class Customer extends Entity<CustomerId> {
    private Name name;
    private PhoneNumber phoneNumber;
    private Modality modality;
    private StartDate startDate;
    private EndDate endDate;
    private PlanAmount planAmount;

    public Customer(CustomerId cedula, Name name, PhoneNumber phoneNumber) {
        super(cedula);
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.modality = null;
        this.startDate = null;
        this.endDate = null;
        this.planAmount = null;
    }

    public Name name() {
        return name;
    }

    public void changeName(Name name) {
        this.name = name;
    }

    public PhoneNumber phoneNumber() {
        return phoneNumber;
    }

    public void changePhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Modality modality() {
        return modality;
    }

    public void changeModality(Modality modality) {
        this.modality = modality;
    }

    public StartDate startDate() {
        return startDate;
    }

    public void changeStartDate(StartDate startDate) {
        this.startDate = startDate;
    }

    public EndDate endDate() {
        return endDate;
    }

    public void changeEndDate(EndDate endDate) {
        this.endDate = endDate;
    }

    public PlanAmount planAmount() {
        return planAmount;
    }

    public void changePlanAmount(PlanAmount planAmount) {
        this.planAmount = planAmount;
    }
}
