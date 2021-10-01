package co.com.sofka.gymmanagement.domain.fitnessgym.entity;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.gymmanagement.domain.fitnessgym.value.*;

public class Schedule extends Entity<ScheduleId> {
    private OpenDay openDay;
    private CloseDay closeDay;
    private OpenHour openHour;
    private PauseHour pauseHour;
    private CloseHour closeHour;

    public Schedule(ScheduleId entityId, OpenDay openDay,
                    CloseDay closeDay, OpenHour openHour,
                    PauseHour pauseHour, CloseHour closeHour) {
        super(entityId);
        this.openDay = openDay;
        this.closeDay = closeDay;
        this.openHour = openHour;
        this.pauseHour = pauseHour;
        this.closeHour = closeHour;
    }

    public OpenDay openDay() {
        return openDay;
    }

    public void changeOpenDay(OpenDay openDay) {
        this.openDay = openDay;
    }

    public CloseDay closeDay() {
        return closeDay;
    }

    public void changeCloseDay(CloseDay closeDay) {
        this.closeDay = closeDay;
    }

    public OpenHour openHour() {
        return openHour;
    }

    public void changeOpenHour(OpenHour openHour) {
        this.openHour = openHour;
    }

    public PauseHour pauseHour() {
        return pauseHour;
    }

    public void changePauseHour(PauseHour pauseHour) {
        this.pauseHour = pauseHour;
    }

    public CloseHour closeHour() {
        return closeHour;
    }

    public void changeCloseHour(CloseHour closeHour) {
        this.closeHour = closeHour;
    }
}
