package co.com.sofka.gymmanagement.domain.fitnessgym.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.gymmanagement.domain.fitnessgym.value.*;

public class ScheduleUpdated extends DomainEvent {
    private final ScheduleId scheduleId;
    private final OpenDay openDay;
    private final CloseDay closeDay;
    private final OpenHour openHour;
    private final PauseHour pauseHour;
    private final CloseHour closeHour;


    public ScheduleUpdated(ScheduleId scheduleId, OpenDay openDay, CloseDay closeDay, OpenHour openHour,
                           PauseHour pauseHour, CloseHour closeHour) {
        super("co.com.sofka.gymmanagement.fitnessgym.scheduleupdated");
        this.scheduleId = scheduleId;
        this.openDay = openDay;
        this.closeDay = closeDay;
        this.openHour = openHour;
        this.pauseHour = pauseHour;
        this.closeHour = closeHour;
    }

    public OpenDay getOpenDay() {
        return openDay;
    }

    public CloseDay getCloseDay() {
        return closeDay;
    }

    public OpenHour getOpenHour() {
        return openHour;
    }

    public PauseHour getPauseHour() {
        return pauseHour;
    }

    public CloseHour getCloseHour() {
        return closeHour;
    }

    public ScheduleId getScheduleId() {
        return scheduleId;
    }
}