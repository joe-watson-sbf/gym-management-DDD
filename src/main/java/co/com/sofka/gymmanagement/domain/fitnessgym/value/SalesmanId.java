package co.com.sofka.gymmanagement.domain.fitnessgym.value;

import co.com.sofka.domain.generic.Identity;

public class SalesmanId extends Identity {
    public SalesmanId(String id){
        super(id);
    }
    public SalesmanId of(String id){
        return new SalesmanId(id);
    }
}
