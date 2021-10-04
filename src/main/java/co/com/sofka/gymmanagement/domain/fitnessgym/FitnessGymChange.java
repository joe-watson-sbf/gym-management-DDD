package co.com.sofka.gymmanagement.domain.fitnessgym;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.gymmanagement.domain.fitnessgym.entity.Instructor;
import co.com.sofka.gymmanagement.domain.fitnessgym.entity.Salesman;
import co.com.sofka.gymmanagement.domain.fitnessgym.entity.Schedule;
import co.com.sofka.gymmanagement.domain.fitnessgym.event.*;
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

        // CHANGE BUSINESS NAME
        apply((FitnessGymNameChanged event)->{
            fitnessGym.changeName(event.getName());
        });

        // CHANGE BUSINESS EMAIL
        apply((FitnessGymEmailChanged event)->{
            fitnessGym.changeEmail(event.getEmail());
        });

        // CHANGE BUSINESS PHONE
        apply((FitnessGymPhoneNumberChanged event)->{
            fitnessGym.changePhoneNumber(event.getPhoneNumber());
        });

        // CHANGE BUSINESS ADDRESS
        apply((FitnessGymAddressChanged event)->{
            fitnessGym.changeAddress(event.getAddress());
        });

        // BUSINESS OPEN/CLOSE
        apply((FitnessGymOpenChanged event)->{
            fitnessGym.changeOpen(event.getOpen());
        });



        // CREATE BUSINESS SCHEDULE
        apply((ScheduleCreated event)->{
            fitnessGym.scheduleSet.add(new Schedule(
                    event.getScheduleId(),
                    event.getOpenDay(),
                    event.getCloseDay(),
                    event.getOpenHour(),
                    event.getPauseHour(),
                    event.getCloseHour()
            ));
        });

        // UPDATE BUSINESS SCHEDULE
        apply((ScheduleUpdated event) -> {
            fitnessGym.scheduleSet.forEach(schedule -> {
                if(schedule.identity().equals(event.getScheduleId())){
                    schedule.changePauseHour(event.getPauseHour());
                    schedule.changeOpenDay(event.getOpenDay());
                    schedule.changeCloseDay(event.getCloseDay());
                    schedule.changeCloseHour(event.getCloseHour());
                    schedule.changeOpenHour(event.getOpenHour());
                }
            });
        });

        // DELETE BUSINESS SCHEDULE
        apply((ScheduleUpdated event) -> {
            var schedule = fitnessGym.findScheduleById(event.getScheduleId());
            fitnessGym.scheduleSet.remove(schedule);
        });

        // SALESMAN REGISTRATION
        apply((SalesmanRegistered event)->{
            var salesmandTotal = fitnessGym.salesmen.size();
            if(salesmandTotal==4){
                throw new IllegalArgumentException("Sorry, we cannot add more Salesman!!!");
            }
            fitnessGym.salesmen.add(new Salesman(
                    event.getSalesmanId(),
                    event.getName(),
                    event.getGender(),
                    event.getEmail(),
                    event.getPhoneNumber(),
                    event.getAddress()
            ));
        });

        // SALESMAN UPDATING DATA
        apply((SalesmanUpdated event)->{
            fitnessGym.salesmen.forEach(salesman -> {
                if(salesman.identity().equals(event.getSalesmanId())){
                    salesman.changeGender(event.getGender());
                    salesman.changeAddress(event.getAddress());
                    salesman.changeEmail(event.getEmail());
                    salesman.changeName(event.getName());
                    salesman.changePhoneNumber(event.getPhoneNumber());
                }
            });
        });

        // SALESMAN DELETE DATA
        apply((SalesmanDeleted event)->{
            var salesman = fitnessGym.findSalesmanById(event.getSalesmanId());
            fitnessGym.salesmen.remove(salesman);
        });




        // INSTRUCTOR REGISTRATION
        apply((InstructorRegistered event)->{
            var totalInstructor = fitnessGym.instructors.size();
            if(totalInstructor==7){
                throw new IllegalArgumentException("Sorry, we cannot add more Instructor!!!");
            }
            if(event.getSpeciality()==null){
                throw new IllegalArgumentException("Sorry, for your registration you need to have" +
                        "at least one speciality!!!");
            }

            fitnessGym.instructors.add(new Instructor(
                    event.getInstructorId(),
                    event.getName(),
                    event.getGender(),
                    event.getEmail(),
                    event.getPhoneNumber(),
                    event.getAddress(),
                    event.getSpeciality()
            ));
        });

        // INSTRUCTOR UPDATING DATA
        apply((InstructorUpdated event)->{
            if(event.getSpeciality()==null){
                throw new IllegalArgumentException("We cannot update your data," +
                        "your speciality is requiered!!! ");
            }
            fitnessGym.instructors.forEach(instructor -> {
                if(instructor.identity() == event.getInstructorId()){
                    instructor.changeAddress(event.getAddress());
                    instructor.changeGender(event.getGender());
                    instructor.changeEmail(event.getEmail());
                    instructor.changeName(event.getName());
                    instructor.changeSpeciality(event.getSpeciality());
                }
            });
        });

        // INSTRUCTOR DELETE DATA
        apply((InstructorDeleted event)->{
            var instructor = fitnessGym.findInstructorById(event.getInstructorId());
            fitnessGym.instructors.remove(instructor);
        });
    }
}
