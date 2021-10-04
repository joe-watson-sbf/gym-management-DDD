package co.com.sofka.gymmanagement.usecase.fitnessgym;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.gymmanagement.domain.fitnessgym.FitnessGym;
import co.com.sofka.gymmanagement.domain.fitnessgym.command.CreateSchedule;

public class CreateScheduleUseCase extends UseCase<RequestCommand<CreateSchedule>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CreateSchedule> createScheduleRequestCommand) {
        var command = createScheduleRequestCommand.getCommand();
        var fitnessGym = FitnessGym.from(command.getFitnessGymId(), retrieveEvents());
        fitnessGym.createSchedule(
                command.getScheduleId(),
                command.getOpenDay(),
                command.getCloseDay(),
                command.getOpenHour(),
                command.getPauseHour(),
                command.getCloseHour()
        );
        emit().onResponse(new ResponseEvents(fitnessGym.getUncommittedChanges()));
    }
}
