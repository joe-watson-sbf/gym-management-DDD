package co.com.sofka.gymmanagement.domain.salesmanager;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.gymmanagement.domain.salesmanager.entity.Customer;
import co.com.sofka.gymmanagement.domain.salesmanager.entity.Invoice;
import co.com.sofka.gymmanagement.domain.salesmanager.entity.Membership;
import co.com.sofka.gymmanagement.domain.salesmanager.entity.SalesInfo;
import co.com.sofka.gymmanagement.domain.salesmanager.event.CustomerRegistered;
import co.com.sofka.gymmanagement.domain.salesmanager.event.InvoiceGenerated;
import co.com.sofka.gymmanagement.domain.salesmanager.event.SalesManagerCreated;
import co.com.sofka.gymmanagement.domain.salesmanager.value.Modality;

import java.util.HashSet;

public class SalesManagerChange extends EventChange {

    public SalesManagerChange(SalesManager salesManager){

        apply((SalesManagerCreated event) -> {
            salesManager.fitnessGymId = event.getFitnessGymId();
            salesManager.salesmanId = event.getSalesmanId();
            salesManager.invoices = new HashSet<>();
            salesManager.customers = new HashSet<>();
            salesManager.salesInfos = new HashSet<>();
        });




        apply((CustomerRegistered event)->{
            // CREATE A NEW CUSTOMER
            var customer = new Customer(event.getCedula(),
                    event.getName(), event.getPhoneNumber());

            // CREATE THE CUSTOMER'S MEMBERSHIP
            var membership = new Membership(event.getType());

            // CHANGE SOME CUSTOMER DATA WITH SOME DEFAULT METHOD IN MEMBERSHIP CLASS
            customer.changeModality(new Modality(membership.type().name()));
            customer.changeStartDate(membership.generateStartDate());
            customer.changeEndDate(membership.generateEndDate());
            customer.changePlanAmount(membership.planAmount());

            // PUSH THE CUSTOMER TO THE LIST
            salesManager.customers.add(customer);

            // CREATE THE SALE BASIC INFO
            var infosaleId = SalesInfo.generateSalesInfoId(salesManager.salesInfos());
            var infoSale = new SalesInfo(infosaleId, salesManager.salesmanId, customer.identity());

            // PUSH THE INFO TO THE LIST
            salesManager.salesInfos.add(infoSale);
        });





        apply((InvoiceGenerated event)->{
            // SEARCH THE ALL NECESSARY INFORMATIONS BEFORE TO CREATE TEH INVOICE
            var customer = salesManager.findCustomerById(event.getCedula());
            var basicSaleInfo = salesManager.findSalesBasicInfoByCustomerId(customer.identity());

            // GENERATE A DEFAULT INVOICE NUMBER
            var invoiceNo = Invoice.generateInvoiceNo(salesManager.invoices());

            // NOW WE CAN CREATE THE INVOICE
            var invoice = new Invoice(invoiceNo,
                    basicSaleInfo.salesmanId(),
                    customer.identity(),
                    customer.modality(),
                    customer.planAmount(),
                    customer.startDate(),
                    customer.endDate());

            // Save the invoice
            salesManager.invoices.add(invoice);

        });

    }
}
