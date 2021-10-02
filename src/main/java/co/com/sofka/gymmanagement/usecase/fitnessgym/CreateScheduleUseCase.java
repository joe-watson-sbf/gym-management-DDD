package co.com.sofka.gymmanagement.usecase.fitnessgym;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.gymmanagement.domain.fitnessgym.entity.Schedule;

public class CreateSchedule extends UseCase<RequestCommand<CreateSchedule>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CreateSchedule> createScheduleRequestCommand) {
        var command = createScheduleRequestCommand.getCommand();
        var schedule = new Schedule(
                command.get
        );

    }
}
