package co.com.sofka.gymmanagement.domain.fitnessgym.value;

import co.com.sofka.domain.generic.Identity;

public class ScheduleId extends Identity {
    public ScheduleId(String id){
        super(id);
    }
    public ScheduleId of(String id){
        return new ScheduleId(id);
    }
}
