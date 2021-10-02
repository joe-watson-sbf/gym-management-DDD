package co.com.sofka.gymmanagement.usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.gymmanagement.domain.fitnessgym.command.CreateSchedule;
import co.com.sofka.gymmanagement.domain.fitnessgym.event.ScheduleCreated;
import co.com.sofka.gymmanagement.domain.fitnessgym.value.*;
import co.com.sofka.gymmanagement.usecase.fitnessgym.CreateScheduleUseCase;
import co.com.sofka.infraestructure.repository.EventStoreRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class CreateScheduleTest {
    @Mock
    private DomainEventRepository repository;

    @Test
    void createSceduleSuccessfull(){
        String sceduleId = "QWE-67645";
        var command = new CreateSchedule(
                new FitnessGymId("1919"),
                new ScheduleId(sceduleId),
                new OpenDay("Monday"),
                new CloseDay("Saturday"),
                new OpenHour("8:00 AM"),
                new PauseHour("12:00 pm - 01:15 pm"),
                new CloseHour("11pm")
        );

        var myUseCaseCreateSchedule = new CreateScheduleUseCase();

        List<DomainEvent> store = List.of(new ScheduleCreated(
                new ScheduleId("454645"),
                new OpenDay("Monday"),
                new CloseDay("Saturday"),
                new OpenHour("8:00 AM"),
                new PauseHour("12:00 pm - 01:15 pm"),
                new CloseHour("11pm")
        ));

        Mockito.when(repository.getEventsBy(sceduleId)).thenReturn(store);
        myUseCaseCreateSchedule.addRepository(repository);

        var events = UseCaseHandler.getInstance()
                .syncExecutor(myUseCaseCreateSchedule, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        var event = (ScheduleCreated) events.get(0);

        assertEquals("Monday", event.getOpenDay().value());

    }

}
