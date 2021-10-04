package co.com.sofka.gymmanagement.usecase.fitnessgym;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.gymmanagement.domain.fitnessgym.FitnessGym;
import co.com.sofka.gymmanagement.domain.fitnessgym.command.ChangeNameFitnessGym;

public class ChangeNameFitnessUseCase extends UseCase<RequestCommand<ChangeNameFitnessGym>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<ChangeNameFitnessGym> changeNameFitnessGymRequestCommand) {
        var command = changeNameFitnessGymRequestCommand.getCommand();
        var fitness = FitnessGym.from(command.getFitnessGymId(), retrieveEvents());
        fitness.changeName(command.getName());
        emit().onResponse(new ResponseEvents(fitness.getUncommittedChanges()));
    }
}
