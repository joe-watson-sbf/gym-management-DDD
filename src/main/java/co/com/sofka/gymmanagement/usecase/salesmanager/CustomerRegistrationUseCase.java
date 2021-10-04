package co.com.sofka.gymmanagement.usecase.salesmanager;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.gymmanagement.domain.salesmanager.SalesManager;
import co.com.sofka.gymmanagement.domain.salesmanager.command.CustomerRegistration;

public class CustomerRegistrationUseCase extends UseCase<RequestCommand<CustomerRegistration>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CustomerRegistration> customerRegistrationRequestCommand) {
        var command = customerRegistrationRequestCommand.getCommand();
        var salesManager = SalesManager.from(command.getSalesManagerId(), retrieveEvents());
        salesManager.CustomerRegistration(
                command.getCedula(),
                command.getSalesManagerId(),
                command.getName(),
                command.getPhoneNumber(),
                command.type()
        );
        emit().onResponse(new ResponseEvents(salesManager.getUncommittedChanges()));
    }
}
