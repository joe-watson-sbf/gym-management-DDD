package co.com.sofka.gymmanagement.domain.fitnessgym.value;

import co.com.sofka.domain.generic.Identity;

public class InstructorId extends Identity {
    public InstructorId(String id){
        super(id);
    }
    public InstructorId of(String id){
        return new InstructorId(id);
    }
}
