package co.com.sofka.gymmanagement.usecase.fitnessgym;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.gymmanagement.domain.fitnessgym.command.InstructorRegistration;
import co.com.sofka.gymmanagement.domain.fitnessgym.event.FitnessGymCreated;
import co.com.sofka.gymmanagement.domain.fitnessgym.event.InstructorRegistered;
import co.com.sofka.gymmanagement.domain.fitnessgym.value.*;
import co.com.sofka.gymmanagement.domain.shared.valueobject.Address;
import co.com.sofka.gymmanagement.domain.shared.valueobject.Email;
import co.com.sofka.gymmanagement.domain.shared.valueobject.Name;
import co.com.sofka.gymmanagement.domain.shared.valueobject.PhoneNumber;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class CreateInstructorUseCaseTest {

    @Mock
    private DomainEventRepository repository;

    @Test
    void createSalesman(){

        var command = new InstructorRegistration(
                FitnessGymId.of("WSH-674"),
                new InstructorId("LKH-978-RTY"),
                new Name("Williamson"),
                new Gender("Men"),
                new Email("williamson@gmail.com"),
                new PhoneNumber("300647468"),
                new Address("Calle 67"),
                new Speciality("Coach Football")
        );

        var useCase = new CreateInstructorUseCase();

        Mockito.when(repository.getEventsBy("LKH-978-RTY")).thenReturn(domainEventList());
        useCase.addRepository(repository);

        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor("LKH-978-RTY")
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        var event = (InstructorRegistered) events.get(0);

        assertEquals("Williamson", event.getName().value());

    }

    private List<DomainEvent> domainEventList(){
        return List.of(
                new FitnessGymCreated(
                        new Name("AWAWAK FITNESS"),
                        new Email("awawak@fitness.com"),
                        new PhoneNumber("3076459009"),
                        new Address("Calle 78"),
                        new Description("The best Fitness GYM...")
                ),
                new InstructorRegistered(
                        new InstructorId("POQFDSF"),
                        new Name("Ok"),
                        new Gender("Women"),
                        new Email("midsonson@gmail.com"),
                        new PhoneNumber("45678494"),
                        new Address("Calle 9"),
                        new Speciality("Coach Football")
                )
        );
    }

}