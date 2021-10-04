package co.com.sofka.gymmanagement.domain.salesmanager.value;

import co.com.sofka.domain.generic.Identity;

public class SalesInfoId extends Identity {
    public SalesInfoId(String id){
        super(id);
    }

    public SalesInfoId of(String id){
        return new SalesInfoId(id);
    }
}
