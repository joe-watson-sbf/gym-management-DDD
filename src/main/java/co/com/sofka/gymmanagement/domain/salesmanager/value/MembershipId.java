package co.com.sofka.gymmanagement.domain.salesmanager.value;

import co.com.sofka.domain.generic.Identity;

public class MembershipId extends Identity {
    public MembershipId(String id){
        super(id);
    }
    public MembershipId of(String id){
        return new MembershipId(id);
    }
}
