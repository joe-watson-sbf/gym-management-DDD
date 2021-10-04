package co.com.sofka.gymmanagement.usecase.fitnessgym;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.gymmanagement.domain.fitnessgym.FitnessGym;
import co.com.sofka.gymmanagement.domain.fitnessgym.command.UpdateSalesman;

public class UpdateSalesmanUseCase extends UseCase<RequestCommand<UpdateSalesman>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<UpdateSalesman> updateSalesmanRequestCommand) {
        var command = updateSalesmanRequestCommand.getCommand();
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
