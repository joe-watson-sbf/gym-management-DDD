package co.com.sofka.gymmanagement.domain.salesmanager.entity;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.gymmanagement.domain.fitnessgym.value.SalesmanId;
import co.com.sofka.gymmanagement.domain.salesmanager.value.CustomerId;
import co.com.sofka.gymmanagement.domain.salesmanager.value.SalesInfoId;
import java.util.Set;

public class SalesInfo extends Entity<SalesInfoId> {
    private final SalesmanId salesmanId;
    private final CustomerId customerId;

    public SalesInfo(SalesInfoId entityId, SalesmanId salesmanId, CustomerId customerId) {
        super(entityId);
        this.salesmanId = salesmanId;
        this.customerId = customerId;
    }

    public static SalesInfoId generateSalesInfoId(Set<SalesInfo> infos){
        return new SalesInfoId("info00"+infos.size());
    }

    public SalesmanId salesmanId() {
        return salesmanId;
    }

    public CustomerId customerId() {
        return customerId;
    }
}
