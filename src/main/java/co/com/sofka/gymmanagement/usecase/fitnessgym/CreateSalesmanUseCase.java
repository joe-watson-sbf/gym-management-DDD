package co.com.sofka.gymmanagement.usecase.fitnessgym;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.gymmanagement.domain.fitnessgym.FitnessGym;
import co.com.sofka.gymmanagement.domain.fitnessgym.command.SalesmanRegistration;

public class CreateSalesmanUseCase extends UseCase<RequestCommand<SalesmanRegistration>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<SalesmanRegistration> salesmanRegistrationRequestCommand) {
        var command = salesmanRegistrationRequestCommand.getCommand();
        var fitnessGym = FitnessGym.from(command.getFitnessGymId(), retrieveEvents());
        fitnessGym.salesmanRegistration(
                command.getSalesmanId(),
                command.getName(),
                command.getGender(),
                command.getEmail(),
                command.getPhoneNumber(),
                command.getAddress()
        );
        emit().onResponse(new ResponseEvents(fitnessGym.getUncommittedChanges()));
    }
}
