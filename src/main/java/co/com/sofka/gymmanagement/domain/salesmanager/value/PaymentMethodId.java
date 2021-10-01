package co.com.sofka.gymmanagement.domain.salesmanager.value;

import co.com.sofka.domain.generic.Identity;

public class PaymentMethodId extends Identity {
    public PaymentMethodId(String id){
        super(id);
    }
    public PaymentMethodId of(String id){
        return new PaymentMethodId(id);
    }
}
