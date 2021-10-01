package co.com.sofka.gymmanagement.domain.salesmanager.entity;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.gymmanagement.domain.salesmanager.value.CardName;
import co.com.sofka.gymmanagement.domain.salesmanager.value.CarteExpirationDate;
import co.com.sofka.gymmanagement.domain.salesmanager.value.PaymentMethodId;

public class PaymentMethod extends Entity<PaymentMethodId> {
    private CarteExpirationDate expirationDate;
    private CardName cardName;

    public PaymentMethod(PaymentMethodId entityId,
                         CarteExpirationDate expirationDate,
                         CardName cardName) {
        super(entityId);
        this.expirationDate = expirationDate;
        this.cardName = cardName;
    }

    public CarteExpirationDate expirationDate() {
        return expirationDate;
    }

    public void changeExpirationDate(CarteExpirationDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public CardName cardName() {
        return cardName;
    }

    public void changeCardName(CardName cardName) {
        this.cardName = cardName;
    }
}
