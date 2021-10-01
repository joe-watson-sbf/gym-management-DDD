package co.com.sofka.gymmanagement.domain.salesmanager.entity;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.gymmanagement.domain.salesmanager.value.MembershipId;
import co.com.sofka.gymmanagement.domain.salesmanager.value.Type;

public class Membership extends Entity<MembershipId> {
    private Type type;

    public Membership(MembershipId entityId, Type type) {
        super(entityId);
        this.type = type;
    }

    public Type type() {
        return type;
    }

    public void changeType(Type type) {
        this.type = type;
    }

    public enum Modality{
        STARTER,
        BRONZE,
        PLATINIUM,
        CLASS,
        PERSONAL
    }
}
