package co.com.sofka.gymmanagement.usecase.fitnessgym;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.gymmanagement.domain.fitnessgym.FitnessGym;
import co.com.sofka.gymmanagement.domain.fitnessgym.command.UpdateSchedule;

public class UpdateScheduleUseCase extends UseCase<RequestCommand<UpdateSchedule>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<UpdateSchedule> scheduleUpdatedRequestCommand) {
        var command = scheduleUpdatedRequestCommand.getCommand();
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
