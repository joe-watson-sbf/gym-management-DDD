package co.com.sofka.gymmanagement.domain.fitnessgym.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.gymmanagement.domain.fitnessgym.value.ScheduleId;

public class ScheduleDeleted extends DomainEvent {
    private final ScheduleId scheduleId;


    public ScheduleDeleted(ScheduleId scheduleId) {
        super("co.com.sofka.gymmanagement.fitnessgym.schedulegotten");
        this.scheduleId = scheduleId;
    }

    public ScheduleId getScheduleId() {
        return scheduleId;
    }

}
