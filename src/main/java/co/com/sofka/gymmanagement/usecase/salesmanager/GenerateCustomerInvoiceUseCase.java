package co.com.sofka.gymmanagement.usecase.salesmanager;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.gymmanagement.domain.salesmanager.SalesManager;
import co.com.sofka.gymmanagement.domain.salesmanager.command.GenerateAndSaveInvoice;

public class GenerateCustomerInvoiceUseCase extends UseCase<RequestCommand<GenerateAndSaveInvoice>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<GenerateAndSaveInvoice> generateAndSaveInvoiceRequestCommand) {
        var command = generateAndSaveInvoiceRequestCommand.getCommand();
        var salesManager = SalesManager.from(command.getSalesManagerId(), retrieveEvents());

        salesManager.generateAndSaveInvoice(
                command.getSalesmanId(),
                command.getCustomerId(),
                command.getModality(),
                command.getPlanAmount()
        );

        emit().onResponse(new ResponseEvents(salesManager.getUncommittedChanges()));
    }
}
