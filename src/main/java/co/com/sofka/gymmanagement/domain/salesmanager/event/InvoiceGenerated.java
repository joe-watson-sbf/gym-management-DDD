package co.com.sofka.gymmanagement.domain.salesmanager.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.gymmanagement.domain.fitnessgym.value.SalesmanId;
import co.com.sofka.gymmanagement.domain.salesmanager.value.*;

public class InvoiceGenerated extends DomainEvent {

    private final SalesmanId salesmanId;
    private final CustomerId cedula;
    private final Modality modality;
    private final PlanAmount planAmount;

    public InvoiceGenerated(SalesmanId salesmanId,
                            CustomerId cedula, Modality modality,
                            PlanAmount planAmount) {
        super("co.com.sofka.gymmanagement.salesmanager.invoicegenerated");
        this.salesmanId = salesmanId;
        this.cedula = cedula;
        this.modality = modality;
        this.planAmount = planAmount;
    }

    public SalesmanId getSalesmanId() {
        return salesmanId;
    }

    public CustomerId getCedula() {
        return cedula;
    }

    public Modality getModality() {
        return modality;
    }

    public PlanAmount getPlanAmount() {
        return planAmount;
    }
}
