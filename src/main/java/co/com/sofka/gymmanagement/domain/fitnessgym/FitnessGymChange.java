package co.com.sofka.gymmanagement.domain.fitnessgym;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.gymmanagement.domain.fitnessgym.event.FitnessGymCreated;
import co.com.sofka.gymmanagement.domain.fitnessgym.value.Open;

import java.util.HashSet;

public class FitnessGymChange extends EventChange {
    public FitnessGymChange(FitnessGym fitnessGym){
        apply((FitnessGymCreated event) -> {
            fitnessGym.name = event.getName();
            fitnessGym.email = event.getEmail();
            fitnessGym.address = event.getAddress();
            fitnessGym.description = event.getDescription();
            fitnessGym.open = new Open(false);
            fitnessGym.phoneNumber = event.getPhoneNumber();
            fitnessGym.instructors = new HashSet<>();
            fitnessGym.salesmen = new HashSet<>();
            fitnessGym.scheduleSet = new HashSet<>();
        });
    }
}
