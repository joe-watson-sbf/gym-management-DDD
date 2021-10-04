package co.com.sofka.gymmanagement.domain.salesmanager;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.gymmanagement.domain.fitnessgym.value.FitnessGymId;
import co.com.sofka.gymmanagement.domain.fitnessgym.value.SalesmanId;
import co.com.sofka.gymmanagement.domain.salesmanager.entity.Customer;
import co.com.sofka.gymmanagement.domain.salesmanager.entity.Invoice;
import co.com.sofka.gymmanagement.domain.salesmanager.entity.Membership;
import co.com.sofka.gymmanagement.domain.salesmanager.entity.SalesInfo;
import co.com.sofka.gymmanagement.domain.salesmanager.event.CustomerRegistered;
import co.com.sofka.gymmanagement.domain.salesmanager.event.InvoiceGenerated;
import co.com.sofka.gymmanagement.domain.salesmanager.event.SalesManagerCreated;
import co.com.sofka.gymmanagement.domain.salesmanager.value.*;
import co.com.sofka.gymmanagement.domain.shared.valueobject.Name;
import co.com.sofka.gymmanagement.domain.shared.valueobject.PhoneNumber;

import java.util.List;
import java.util.Objects;
import java.util.Set;

public class SalesManager extends AggregateEvent<SalesManagerId> {

    protected SalesmanId salesmanId;
    protected FitnessGymId fitnessGymId;
    protected Set<Customer> customers;
    protected Set<Invoice> invoices;
    protected Set<SalesInfo> salesInfos;
    protected Membership membership;


    public SalesManager(SalesManagerId salesManagerId, SalesmanId salesmanId,
                        FitnessGymId fitnessGymId) {
        super(salesManagerId);
        appendChange(new SalesManagerCreated(fitnessGymId, salesManagerId, salesmanId)).apply();
    }

    private SalesManager(SalesManagerId salesManagerId){
        super(salesManagerId);
        subscribe(new SalesManagerChange(this));
    }

    public static SalesManager from(SalesManagerId salesManagerId, List<DomainEvent> events){
        var salesman = new SalesManager(salesManagerId);
        events.forEach(salesman::applyEvent);
        return salesman;
    }



    public void generateAndSaveInvoice(SalesmanId salesmanId, CustomerId customerId,
                                        Modality modality, PlanAmount planAmount){

        Objects.requireNonNull(salesmanId);
        Objects.requireNonNull(customerId);
        Objects.requireNonNull(modality);
        Objects.requireNonNull(planAmount);

        appendChange(new InvoiceGenerated(salesmanId, customerId, modality, planAmount)).apply();
    }

    public void CustomerRegistration(CustomerId cedula,SalesManagerId salesManagerId, Name name,
                                     PhoneNumber phoneNumber, Membership.Type type){
        Objects.requireNonNull(cedula);
        Objects.requireNonNull(name);
        Objects.requireNonNull(phoneNumber);
        appendChange(new CustomerRegistered(cedula, salesManagerId, name, phoneNumber, type)).apply();
    }

    public Customer findCustomerById(CustomerId cedula){
        return customers.stream()
                .filter(customer -> customer.identity().equals(cedula))
                .findFirst()
                .orElseThrow(()-> new IllegalArgumentException("Customer not found!!!"));
    }


    public SalesInfo findSalesBasicInfoByCustomerId(CustomerId cedula){
        return salesInfos.stream()
                .filter(salesInfo -> salesInfo.customerId().equals(cedula))
                .findFirst()
                .orElseThrow(()-> new IllegalArgumentException("Basic Info Not Found!!!"));
    }


    public SalesmanId salesmanId() {
        return salesmanId;
    }

    public Set<SalesInfo> salesInfos() {
        return salesInfos;
    }

    public FitnessGymId fitnessGymId() {
        return fitnessGymId;
    }

    public Set<Customer> customers() {
        return customers;
    }

    public Set<Invoice> invoices() {
        return invoices;
    }

    public Membership membership() {
        return membership;
    }

    public void changeMembership(Membership membership) {
        this.membership = membership;
    }

}
