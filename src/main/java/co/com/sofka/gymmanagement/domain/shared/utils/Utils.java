package co.com.sofka.gymmanagement.domain.shared.utils;

import co.com.sofka.gymmanagement.domain.fitnessgym.entity.Schedule;
import co.com.sofka.gymmanagement.domain.fitnessgym.value.ScheduleId;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Utils {

    private static final String EMPTY_STRING = "ERROR: Empty String!!!";
    private static final String NULL_STRING = "ERROR: Null String!!!";
    public static String requireNonEmptyString(String value){
        value = nonNullString(value);
        if(value.length()<1){
            throw new IllegalArgumentException(EMPTY_STRING);
        }
        return value;
    }

    private static String nonNullString(String s){
        if(s==null){
            throw new IllegalArgumentException(NULL_STRING);
        }
        return s.trim();
    }

    public void changeSchedule(ScheduleId scheduleId, Schedule schedule) {
        Set<Schedule> scheduleSet = new HashSet<>();
        scheduleSet.forEach(olSchedule -> {
            if(olSchedule.identity().equals(scheduleId)){
                olSchedule.changeCloseHour(schedule.closeHour());
                olSchedule.changeCloseDay(schedule.closeDay());
                olSchedule.changeOpenDay(schedule.openDay());
                olSchedule.changeOpenHour(schedule.openHour());
                olSchedule.changePauseHour(schedule.pauseHour());
            }
        });
    }

    public Schedule findScheduleById(ScheduleId scheduleId) {
        Set<Schedule> scheduleSet = new HashSet<>();
        return scheduleSet.stream()
                .filter(e -> e.identity().equals(scheduleId))
                .findFirst()
                .orElseThrow(()->
                        new IllegalArgumentException("Schedule not found!!!"));
    }
}
