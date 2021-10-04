package co.com.sofka.gymmanagement.usecase.fitnessgym;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.gymmanagement.domain.fitnessgym.command.ChangeNameFitnessGym;
import co.com.sofka.gymmanagement.domain.fitnessgym.command.CreateFitnessGym;
import co.com.sofka.gymmanagement.domain.fitnessgym.event.FitnessGymCreated;
import co.com.sofka.gymmanagement.domain.fitnessgym.value.Description;
import co.com.sofka.gymmanagement.domain.fitnessgym.value.FitnessGymId;
import co.com.sofka.gymmanagement.domain.shared.valueobject.Address;
import co.com.sofka.gymmanagement.domain.shared.valueobject.Email;
import co.com.sofka.gymmanagement.domain.shared.valueobject.Name;
import co.com.sofka.gymmanagement.domain.shared.valueobject.PhoneNumber;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class CreateFitnessGymTest {

    @Test
    void createGym(){
        var command = new CreateFitnessGym(
                new FitnessGymId("1919"),
                new Name("JOE FITNESS"),
                new Email("admin@joefitness.com"),
                new PhoneNumber("3048989999"),
                new Address("Calle 12"),
                new Description("The best Fitness GYM...")
        );
        var myUseCaseCreateGym = new Create();

        var events = UseCaseHandler.getInstance()
                .syncExecutor(myUseCaseCreateGym, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();


        var event = (FitnessGymCreated) events.get(0);


        // BUSINESS NAME'S VERIFICATION
        assertEquals("JOE FITNESS", event.getName().value());

        // BUSINESS EMAIL'S VERIFICATION
        assertEquals("admin@joefitness.com", event.getEmail().value());

        // BUSINESS DESCRIPTION'S VERIFICATION
        assertEquals("The best Fitness GYM...", event.getDescription().value());
    }


}
