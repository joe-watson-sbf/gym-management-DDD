package co.com.sofka.gymmanagement.domain.salesmanager;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.gymmanagement.domain.fitnessgym.value.FitnessGymId;
import co.com.sofka.gymmanagement.domain.fitnessgym.value.SalesmanId;
import co.com.sofka.gymmanagement.domain.salesmanager.entity.Customer;
import co.com.sofka.gymmanagement.domain.salesmanager.entity.Invoice;
import co.com.sofka.gymmanagement.domain.salesmanager.entity.Membership;
import co.com.sofka.gymmanagement.domain.salesmanager.entity.PaymentMethod;
import co.com.sofka.gymmanagement.domain.salesmanager.value.SalesManagerId;

import java.util.Set;

public class SalesManager extends AggregateEvent<SalesManagerId> {

    protected SalesmanId salesmanId;
    protected FitnessGymId fitnessGymId;
    protected Set<Customer> customers;
    protected Invoice invoice;
    protected Membership membership;
    protected PaymentMethod paymentMethod;

    public SalesManager(SalesManagerId entityId, SalesmanId salesmanId, FitnessGymId fitnessGymId) {
        super(entityId);
        this.salesmanId = salesmanId;
        this.fitnessGymId = fitnessGymId;
    }


    public SalesmanId salesmanId() {
        return salesmanId;
    }

    public void changeSalesmanId(SalesmanId salesmanId) {
        this.salesmanId = salesmanId;
    }

    public FitnessGymId fitnessGymId() {
        return fitnessGymId;
    }


    public Set<Customer> customers() {
        return customers;
    }

    public void changeCustomers(Set<Customer> customers) {
        this.customers = customers;
    }

    public Invoice invoice() {
        return invoice;
    }

    public void changeInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public Membership membership() {
        return membership;
    }

    public void changeMembership(Membership membership) {
        this.membership = membership;
    }

    public PaymentMethod paymentMethod() {
        return paymentMethod;
    }

    public void changePaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}
