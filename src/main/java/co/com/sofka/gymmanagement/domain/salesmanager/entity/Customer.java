package co.com.sofka.gymmanagement.domain.salesmanager.entity;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.gymmanagement.domain.fitnessgym.value.Gender;
import co.com.sofka.gymmanagement.domain.salesmanager.value.CustomerId;
import co.com.sofka.gymmanagement.domain.salesmanager.value.MembershipId;
import co.com.sofka.gymmanagement.domain.salesmanager.value.PaymentMethodId;
import co.com.sofka.gymmanagement.domain.shared.valueobject.Email;
import co.com.sofka.gymmanagement.domain.shared.valueobject.Name;
import co.com.sofka.gymmanagement.domain.shared.valueobject.PhoneNumber;

public class Customer extends Entity<CustomerId> {
    private MembershipId membershipId;
    private PaymentMethodId paymentMethodId;
    private Name name;
    private Gender gender;
    private Email email;
    private PhoneNumber phoneNumber;

    public Customer(CustomerId entityId, MembershipId membershipId,
                    PaymentMethodId paymentMethodId, Name name,
                    Gender gender, Email email,
                    PhoneNumber phoneNumber) {
        super(entityId);
        this.membershipId = membershipId;
        this.paymentMethodId = paymentMethodId;
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public MembershipId membershipId() {
        return membershipId;
    }

    public void changeMembershipId(MembershipId membershipId) {
        this.membershipId = membershipId;
    }

    public PaymentMethodId paymentId() {
        return paymentMethodId;
    }

    public void changePaymentId(PaymentMethodId paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
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
}
