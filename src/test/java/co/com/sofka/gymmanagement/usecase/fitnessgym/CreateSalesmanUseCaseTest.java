package co.com.sofka.gymmanagement.usecase.fitnessgym;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.gymmanagement.domain.fitnessgym.command.SalesmanRegistration;
import co.com.sofka.gymmanagement.domain.fitnessgym.event.FitnessGymCreated;
import co.com.sofka.gymmanagement.domain.fitnessgym.event.SalesmanRegistered;
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
class CreateSalesmanUseCaseTest {

    @Mock
    private DomainEventRepository repository;

    @Test
    void createSalesman(){

        var command = new SalesmanRegistration(
                FitnessGymId.of("WSH-674"),
                new SalesmanId("989FK"),
                new Name("Joe SBF"),
                new Gender("Men"),
                new Email("joe@gmail.com"),
                new PhoneNumber("304444444"),
                new Address("Rionegro, Calle 0")
        );

        var useCase = new CreateSalesmanUseCase();

        Mockito.when(repository.getEventsBy("989FK")).thenReturn(domainEventList());
        useCase.addRepository(repository);

        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor("989FK")
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        var event = (SalesmanRegistered) events.get(0);

        assertEquals("Joe SBF", event.getName().value());

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
                new SalesmanRegistered(
                        new SalesmanId("OKOKO"),
                        new Name("Luisa"),
                        new Gender("Women"),
                        new Email("luisa@gmail.com"),
                        new PhoneNumber("900444444"),
                        new Address("Medellin, Calle 50")
                )
        );
    }

}