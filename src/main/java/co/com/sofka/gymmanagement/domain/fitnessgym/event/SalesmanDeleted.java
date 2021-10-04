package co.com.sofka.gymmanagement.domain.fitnessgym.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.gymmanagement.domain.fitnessgym.value.SalesmanId;

public class SalesmanDeleted extends DomainEvent {

    private final SalesmanId salesmanId;

    public SalesmanDeleted(SalesmanId salesmanId) {
        super("co.com.sofka.gymmanagement.salesmanager.salesmanregistered");
        this.salesmanId = salesmanId;
    }

    public SalesmanId getSalesmanId() {
        return salesmanId;
    }
}
