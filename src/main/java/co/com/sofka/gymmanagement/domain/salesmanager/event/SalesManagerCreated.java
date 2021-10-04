package co.com.sofka.gymmanagement.domain.salesmanager.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.gymmanagement.domain.fitnessgym.value.FitnessGymId;
import co.com.sofka.gymmanagement.domain.fitnessgym.value.SalesmanId;
import co.com.sofka.gymmanagement.domain.salesmanager.value.SalesManagerId;

public class SalesManagerCreated extends DomainEvent {
    private final FitnessGymId fitnessGymId;
    private final SalesManagerId salesManagerId;
    private final SalesmanId salesmanId;

    public SalesManagerCreated(FitnessGymId fitnessGymId, SalesManagerId salesManagerId, SalesmanId salesmanId){
        super("co.com.sofka.gymmanagement.salesmanager.salesmanagercreated");
        this.fitnessGymId = fitnessGymId;
        this.salesManagerId = salesManagerId;
        this.salesmanId = salesmanId;
    }

    public SalesManagerId salesManagerId() {
        return salesManagerId;
    }

    public FitnessGymId getFitnessGymId() {
        return fitnessGymId;
    }

    public SalesmanId getSalesmanId() {
        return salesmanId;
    }
}
