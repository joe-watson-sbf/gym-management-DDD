package co.com.sofka.gymmanagement.domain.salesmanager.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.gymmanagement.domain.salesmanager.value.SalesManagerId;

public class SalesManagerCreated extends DomainEvent {
    private final SalesManagerId salesManagerId;

    public SalesManagerCreated(SalesManagerId salesManagerId){
        super("co.com.sofka.gymmanagement.salesmanager.salesmanagercreated");
        this.salesManagerId = salesManagerId;
    }

    public SalesManagerId salesManagerId() {
        return salesManagerId;
    }
}
