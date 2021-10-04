package co.com.sofka.gymmanagement.domain.salesmanager.entity;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.gymmanagement.domain.fitnessgym.value.SalesmanId;
import co.com.sofka.gymmanagement.domain.salesmanager.value.*;

import java.util.Random;
import java.util.Set;

public class Invoice extends Entity<InvoiceNo> {

    private final SalesmanId salesmanId;
    private final CustomerId customerId;
    private final Modality modality;
    private final StartDate startDate;
    private final EndDate endDate;
    private final PlanAmount planAmount;

    public Invoice(InvoiceNo entityId, SalesmanId salesmanId,
                   CustomerId customerId, Modality modality,
                   PlanAmount planAmount, StartDate startDate, EndDate endDate) {
        super(entityId);
        this.salesmanId = salesmanId;
        this.customerId = customerId;
        this.modality = modality;
        this.planAmount = planAmount;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public static InvoiceNo generateInvoiceNo(Set<Invoice> invoices){
        Random random = new Random();
        int rdn = random.nextInt(331);
        String number = (invoices.size() + rdn) + "IEVCNO- 001" + rdn;
        return new InvoiceNo(number);
    }

    public SalesmanId salesmanId() {
        return salesmanId;
    }

    public CustomerId customerId() {
        return customerId;
    }

    public Modality modality() {
        return modality;
    }

    public StartDate startDate() {
        return startDate;
    }

    public EndDate endDate() {
        return endDate;
    }

    public PlanAmount planAmount() {
        return planAmount;
    }
}
