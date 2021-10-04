package co.com.sofka.gymmanagement.domain.fitnessgym.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.gymmanagement.domain.fitnessgym.value.FitnessGymId;
import co.com.sofka.gymmanagement.domain.fitnessgym.value.SalesmanId;

public class DeleteSalesman extends Command {
    private final FitnessGymId fitnessGymId;
    private final SalesmanId salesmanId;

    public DeleteSalesman(FitnessGymId fitnessGymId, SalesmanId salesmanId) {
        this.fitnessGymId = fitnessGymId;
        this.salesmanId = salesmanId;
    }

    public SalesmanId getSalesmanId() {
        return salesmanId;
    }

    public FitnessGymId getFitnessGymId() {
        return fitnessGymId;
    }
}
