package co.com.sofka.gymmanagement.domain.salesmanager.entity;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.gymmanagement.domain.salesmanager.value.*;

import java.util.Calendar;
import java.util.TimeZone;

public class Membership extends Entity<MembershipId> {
    private final Membership.Type type;

    public Membership(Membership.Type type) {
        super(generateMembershipId(type));
        this.type = type;
    }

    private static MembershipId generateMembershipId(Membership.Type type){
        switch (type){
            case STARTER:
                return new MembershipId("STATER-015");
            case BRONZE:
                return new MembershipId("BRONZE-045");
            case PLATINIUM:
                return new MembershipId("PLATINIUM-075");
            default:
                return new MembershipId("CLASS-07");
        }
    }

    public PlanAmount planAmount(){

        switch (this.type){
            case STARTER:
                return new PlanAmount("$15.50");
            case BRONZE:
                return new PlanAmount("$45");
            case PLATINIUM:
                return new PlanAmount("$75");
            default:
                return new PlanAmount("$7.99");
        }
    }

    private Calendar generateLimitDate(){
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        int month = 0;
        switch (this.type){
            case STARTER:
                month=1;
                break;
            case BRONZE:
                month=2;
                break;
            case PLATINIUM:
                month=3;
                break;
            default:
                break;
        }
        month += calendar.get(Calendar.MONTH);
        calendar.set(calendar.get(Calendar.YEAR), month, calendar.get(Calendar.DATE));

        return calendar;
    }

    public StartDate generateStartDate(){

        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DATE);

        String date = day + "/" + month + "/" + year;

        return new StartDate(date);
    }

    public EndDate generateEndDate(){
        Calendar calendar = generateLimitDate();

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DATE);

        String date = day + "/" + month + "/" + year;

        return new EndDate(date);
    }

    public Type type() {
        return type;
    }

    public enum Type{
        STARTER,
        BRONZE,
        PLATINIUM,
        CLASS
    }


}
