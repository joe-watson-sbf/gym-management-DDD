package co.com.sofka.gymmanagement.usecase.fitnessgym;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.gymmanagement.domain.fitnessgym.FitnessGym;
import co.com.sofka.gymmanagement.domain.fitnessgym.command.CreateFitnessGym;

public class Create extends UseCase<RequestCommand<CreateFitnessGym>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CreateFitnessGym> createFitnessGymRequestCommand) {
        var command = createFitnessGymRequestCommand.getCommand();
        var fitnessGym = new FitnessGym(
                command.getFitnessGymId(),
                command.getName(),
                command.getEmail(),
                command.getPhoneNumber(),
                command.getAddress(),
                command.getDescription()
        );
        emit().onResponse(new ResponseEvents(fitnessGym.getUncommittedChanges()));
    }
}
