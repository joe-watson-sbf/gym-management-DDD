package co.com.sofka.gymmanagement.domain.salesmanager.value;

import co.com.sofka.domain.generic.Identity;

public class SalesManagerId extends Identity {
    public SalesManagerId(String id){
        super(id);
    }
    public SalesManagerId of(String id){
        return new SalesManagerId(id);
    }
}
