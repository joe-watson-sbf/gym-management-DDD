package co.com.sofka.gymmanagement.domain.salesmanager.value;

import co.com.sofka.domain.generic.Identity;

public class InvoiceNo extends Identity {

    public InvoiceNo(String value) {
        super(value);
    }

    public InvoiceNo of(String value){
        return new InvoiceNo(value);
    }
}
