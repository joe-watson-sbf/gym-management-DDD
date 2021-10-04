package co.com.sofka.gymmanagement.domain.fitnessgym.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.gymmanagement.domain.fitnessgym.value.*;

public class UpdateSchedule extends Command {

    private final FitnessGymId fitnessGymId;
    private final ScheduleId scheduleId;
    private final OpenDay openDay;
    private final CloseDay closeDay;
    private final OpenHour openHour;
    private final PauseHour pauseHour;
    private final CloseHour closeHour;


    public UpdateSchedule(FitnessGymId fitnessGymId, ScheduleId scheduleId,
                          OpenDay openDay, CloseDay closeDay, OpenHour openHour,
                           PauseHour pauseHour, CloseHour closeHour) {

        this.fitnessGymId = fitnessGymId;
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

    public FitnessGymId getFitnessGymId() {
        return fitnessGymId;
    }
}
