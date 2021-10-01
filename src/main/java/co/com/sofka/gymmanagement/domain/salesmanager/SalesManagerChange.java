package co.com.sofka.gymmanagement.domain.salesmanager;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.gymmanagement.domain.salesmanager.event.SalesManagerCreated;

public class SalesManagerChange extends EventChange {

    public SalesManagerChange(SalesManager salesManager){
        apply((SalesManagerCreated event) -> {


        });
    }
}
