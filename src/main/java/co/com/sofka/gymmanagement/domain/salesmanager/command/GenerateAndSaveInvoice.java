package co.com.sofka.gymmanagement.domain.salesmanager.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.gymmanagement.domain.fitnessgym.value.SalesmanId;
import co.com.sofka.gymmanagement.domain.salesmanager.value.CustomerId;
import co.com.sofka.gymmanagement.domain.salesmanager.value.Modality;
import co.com.sofka.gymmanagement.domain.salesmanager.value.PlanAmount;
import co.com.sofka.gymmanagement.domain.salesmanager.value.SalesManagerId;

public class GenerateAndSaveInvoice extends Command {
    private final SalesManagerId salesManagerId;
    private final SalesmanId salesmanId;
    private final CustomerId customerId;
    private final Modality modality;
    private final PlanAmount planAmount;

    public GenerateAndSaveInvoice(SalesManagerId salesManagerId, SalesmanId salesmanId,
                            CustomerId customerId, Modality modality,
                            PlanAmount planAmount) {

        this.salesManagerId = salesManagerId;
        this.salesmanId = salesmanId;
        this.customerId = customerId;
        this.modality = modality;
        this.planAmount = planAmount;
    }

    public SalesmanId getSalesmanId() {
        return salesmanId;
    }

    public CustomerId getCustomerId() {
        return customerId;
    }

    public Modality getModality() {
        return modality;
    }

    public PlanAmount getPlanAmount() {
        return planAmount;
    }

    public SalesManagerId getSalesManagerId() {
        return salesManagerId;
    }
}
