package co.com.sofka.gymmanagement.domain.fitnessgym.value;

import co.com.sofka.domain.generic.Identity;

public class FitnessGymId extends Identity {

    public FitnessGymId(String id){
        super(id);
    }

    public static FitnessGymId of(String id){
        return new FitnessGymId(id);
    }
}
