package co.com.sofka.gymmanagement.usecase.fitnessgym;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.gymmanagement.domain.fitnessgym.FitnessGym;
import co.com.sofka.gymmanagement.domain.fitnessgym.command.InstructorRegistration;

public class CreateInstructorUseCase extends UseCase<RequestCommand<InstructorRegistration>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<InstructorRegistration> instructorRegistrationRequestCommand) {
        var command = instructorRegistrationRequestCommand.getCommand();
        var fitness = FitnessGym.from(command.getFitnessGymId(), retrieveEvents());
        fitness.instructorRegistration(
                command.getInstructorId(),
                command.getName(),
                command.getGender(),
                command.getEmail(),
                command.getPhoneNumber(),
                command.getAddress(),
                command.getSpeciality()
        );
        emit().onResponse(new ResponseEvents(fitness.getUncommittedChanges()));
    }
}
