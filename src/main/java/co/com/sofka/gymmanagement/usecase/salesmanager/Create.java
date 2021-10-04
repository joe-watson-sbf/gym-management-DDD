package co.com.sofka.gymmanagement.usecase.salesmanager;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.gymmanagement.domain.salesmanager.SalesManager;
import co.com.sofka.gymmanagement.domain.salesmanager.command.CreateSalesManager;

public class Create extends UseCase<RequestCommand<CreateSalesManager>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CreateSalesManager> createSalesManagerRequestCommand) {
        var command = createSalesManagerRequestCommand.getCommand();
        var salesmanager = new SalesManager(
                command.salesManagerId(),
                command.getSalesmanId(),
                command.getFitnessGymId());
        emit().onResponse(new ResponseEvents(salesmanager.getUncommittedChanges()));
    }
}
