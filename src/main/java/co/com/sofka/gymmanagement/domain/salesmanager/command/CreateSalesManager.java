package co.com.sofka.gymmanagement.domain.salesmanager.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.gymmanagement.domain.fitnessgym.value.FitnessGymId;
import co.com.sofka.gymmanagement.domain.fitnessgym.value.SalesmanId;
import co.com.sofka.gymmanagement.domain.salesmanager.value.SalesManagerId;

public class CreateSalesManager extends Command {
    private final FitnessGymId fitnessGymId;
    private final SalesManagerId salesManagerId;
    private final SalesmanId salesmanId;

    public CreateSalesManager(FitnessGymId fitnessGymId, SalesManagerId salesManagerId, SalesmanId salesmanId){
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
